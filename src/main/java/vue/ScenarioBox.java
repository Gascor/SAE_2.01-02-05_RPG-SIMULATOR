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
