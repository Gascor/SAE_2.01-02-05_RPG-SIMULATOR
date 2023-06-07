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
