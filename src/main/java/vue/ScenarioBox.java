package vue;


import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import modele.Launcher;
import modele.Quete;
import modele.Scenario;

public class ScenarioBox extends VBox implements ConstantesScenario {
    private Scenario[] listeScenario;
    private Label labelScenario;
    private TableView<Quete> tableQuete;

    private Scenario scenarioActuelle;
    /**
     * Constructeur de la classe ScenarioBox.
     * Initialise et configure les éléments de la boîte de scénario.
     */
    public ScenarioBox() {
        setSpacing(20);
        Launcher.scenarioLoader();
        listeScenario = Launcher.getListeScenario();
        labelScenario = new Label();
        tableQuete = new TableView<>();
        tableQuete.setMaxWidth(557);
        scenarioActuelle = listeScenario[0];

        // Configuration des colonnes de la table des quêtes
        TableColumn<Quete, Integer> numeroColonne = new TableColumn<>("Id");
        setupColumn(numeroColonne, "Numero", 25);
        TableColumn<Quete, String> posColonne = new TableColumn<>("Position");
        setupColumn(posColonne, "StringPos", 65);
        TableColumn<Quete, String> precondColonne = new TableColumn<>("Preconditions");
        setupColumn(precondColonne, "StringPrecond", 90);
        TableColumn<Quete, Integer> dureeColonne = new TableColumn<>("Durée");
        setupColumn(dureeColonne, "Duree", 65);
        TableColumn<Quete, Integer> experienceColonne = new TableColumn<>("Expérience");
        setupColumn(experienceColonne, "Experience", 85);
        TableColumn<Quete, String> intituleColonne = new TableColumn<>("Intitulé");
        setupColumn(intituleColonne, "Intitule", 225);
        tableQuete.getColumns().addAll(numeroColonne, posColonne, precondColonne, dureeColonne, experienceColonne, intituleColonne);

        afficher(0);
        getChildren().addAll(labelScenario, tableQuete);
    }
    /**
     * Configuration d'une colonne de la table des quêtes.
     *
     * @param col    La colonne à configurer.
     * @param getter Le nom de la propriété correspondante dans la classe Quete.
     * @param width  La largeur préférée de la colonne.
     */
    public static void setupColumn(TableColumn col, String getter, int width) {
        col.setCellValueFactory(new PropertyValueFactory<>(getter));
        col.setPrefWidth(width);
        col.setResizable(false);
        col.setSortable(false);
        col.setReorderable(false);
    }
    /**
     * Affiche les quêtes du scénario spécifié.
     *
     * @param scenarioNumero Le numéro du scénario.
     */
    public void afficher(int scenarioNumero) {
        Scenario scenario = listeScenario[scenarioNumero];
        labelScenario.setText(scenario.getNom());
        tableQuete.getItems().clear();
        for (Quete quete : scenario.getTreeQuete()) {
            tableQuete.getItems().add(quete);
        }
    }
    /**
     * Retourne le scénario actuellement sélectionné.
     *
     * @return Le scénario actuellement sélectionné.
     */
    public Scenario getScenario() {
        return scenarioActuelle;
    }

    /**
     * Définit le scénario actuellement sélectionné.
     *
     * @param numeroScenario Le numéro du scénario à sélectionner.
     */
    public void setScenarioActuelle(int numeroScenario) {
        this.scenarioActuelle = listeScenario[numeroScenario];
    }
}
