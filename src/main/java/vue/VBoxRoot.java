package vue;

import controlleur.Controleur;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Classe représentant la racine VBox de l'interface utilisateur.
 */
public class VBoxRoot extends VBox {
    private static ClassementBox classementBox;
    private static ScenarioBox scenarioBox;
    private static Controleur controleur;
    private static Formulaire formulaire;
    private static MenuBarre menuBarre;
    /**
     * Constructeur de la classe VBoxRoot.
     * Initialise et configure les éléments de l'interface utilisateur.
     */
    public VBoxRoot() {
        HBox hBox = new HBox();
        setSpacing(0);
        controleur = new Controleur();
        scenarioBox = new ScenarioBox();
        formulaire = new Formulaire();
        classementBox = new ClassementBox();
        menuBarre = new MenuBarre();
        getChildren().addAll(menuBarre, hBox);
        hBox.getChildren().addAll(scenarioBox, formulaire, classementBox);
    }
    /**
     * Retourne le contrôleur de l'application.
     *
     * @return L'instance du Controleur utilisée dans l'application.
     */
    public static Controleur getControleur() {
        return controleur;
    }
    /**
     * Retourne la boîte de scénario de l'interface utilisateur.
     *
     * @return L'instance de ScenarioBox utilisée dans l'interface utilisateur.
     */
    public static ScenarioBox getScenarioBox() {
        return scenarioBox;
    }
    /**
     * Retourne le formulaire de l'interface utilisateur.
     *
     * @return L'instance de Formulaire utilisée dans l'interface utilisateur.
     */
    public static Formulaire getFormulaire() {
        return formulaire;
    }
    /**
     * Retourne la boîte de classement de l'interface utilisateur.
     *
     * @return L'instance de ClassementBox utilisée dans l'interface utilisateur.
     */
    public static ClassementBox getClassementBox() {
        return classementBox;
    }
}