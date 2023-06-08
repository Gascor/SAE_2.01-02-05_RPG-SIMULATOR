package vue;

import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class Formulaire extends GridPane {
    private TextField fieldSolutions;
    private ToggleGroup groupeSolutions;
    private ToggleGroup groupeObjectif;
    private ToggleGroup groupeChoix;
    private RadioButton btnEfficace;
    private RadioButton btnDuree;
    private RadioButton btnMeilleurs;

    private static Label labelErreur;
    /**
     * Constructeur de la classe Formulaire.
     * Initialise et configure les éléments du formulaire.
     */
    public Formulaire() {
        setHgap(10);
        setVgap(10);
        Label lblSolutions = new Label("_Nombre de solutions");
        fieldSolutions = new TextField();
        lblSolutions.setLabelFor(fieldSolutions);
        lblSolutions.setMnemonicParsing(true);
        add(lblSolutions, 0, 4);
        add(fieldSolutions, 1, 4, 5, 1);
        btnEfficace = new RadioButton("_Efficace");
        btnEfficace.setMnemonicParsing(true);
        btnEfficace.setUserData(1);
        RadioButton btnExhaustive = new RadioButton("_Exhaustive");
        btnExhaustive.setMnemonicParsing(true);
        btnExhaustive.setUserData(2);
        groupeSolutions = new ToggleGroup();
        groupeSolutions.getToggles().addAll(btnEfficace, btnExhaustive);
        groupeSolutions.selectToggle(btnEfficace);
        Label labelSolutions = new Label("Type de solutions:");
        add(labelSolutions, 0, 5);
        add(btnEfficace, 2, 5, 2, 1);
        add(btnExhaustive, 5, 5, 2, 1);
        Label labelObjectif = new Label("Objectif de la solution:");
        add(labelObjectif, 0, 6);
        btnDuree = new RadioButton("_Durée");
        btnDuree.setMnemonicParsing(true);
        btnDuree.setUserData(1);
        RadioButton btnNbQuetes = new RadioButton("_Quêtes");
        btnNbQuetes.setMnemonicParsing(true);
        btnNbQuetes.setUserData(3);
        RadioButton btnDeplacements = new RadioButton("_Déplacements");
        btnDeplacements.setMnemonicParsing(true);
        btnDeplacements.setUserData(2);
        groupeObjectif = new ToggleGroup();
        groupeObjectif.getToggles().addAll(btnDuree, btnNbQuetes, btnDeplacements);
        groupeObjectif.selectToggle(btnDuree);
        add(btnDuree, 2, 6, 2, 1);
        add(btnDeplacements, 5, 6, 2, 1);
        add(btnNbQuetes, 7, 6, 2, 1);
        Label labelChoix = new Label("Choix:");
        add(labelChoix, 0, 7);
        btnMeilleurs = new RadioButton("_Meilleures solutions");
        btnMeilleurs.setMnemonicParsing(true);
        btnMeilleurs.setUserData(1);
        RadioButton btnPires = new RadioButton("_Pires solutions");
        btnPires.setMnemonicParsing(true);
        btnPires.setUserData(2);
        groupeChoix = new ToggleGroup();
        groupeChoix.getToggles().addAll(btnMeilleurs, btnPires);
        groupeChoix.selectToggle(btnMeilleurs);
        add(btnMeilleurs, 2, 7, 2, 1);
        add(btnPires, 5, 7, 2, 1);
        Button btnExecuter = new Button("Exécuter");
        Button btnAnnuler = new Button("Annuler");
        add(btnExecuter, 2, 10, 3, 1);
        add(btnAnnuler, 5, 10, 3, 1);
        btnAnnuler.setOnAction(actionEvent -> this.reset());
        btnExecuter.setOnAction(VBoxRoot.getControleur());
        labelErreur = new Label();
        add(labelErreur, 2, 12, 6, 2);
    }
    /**
     * Réinitialise les valeurs du formulaire.
     */
    public void reset() {
        ;
    }
    /**
     * Obtient le label d'erreur associé au formulaire.
     *
     * @return Le label d'erreur.
     */
    public Label getLabelErreur() {
        ;
    }
}
