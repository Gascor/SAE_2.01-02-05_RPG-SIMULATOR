package vue;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import modele.Classement;
import modele.ClassementException;
import modele.Parcours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

/**
 * Classe représentant la boîte de classement dans l'interface utilisateur.
 * Elle affiche le classement des parcours en fonction de différents critères.
 */
public class ClassementBox extends VBox {
    private TableView<Parcours> tableParcours;
    private TableColumn<Parcours, Integer> cleColonne;
    /**
     * Constructeur de la classe ClassementBox.
     * Initialise et configure les éléments de la boîte de classement.
     */
    public ClassementBox() {
        setSpacing(10);
        Label labelClass = new Label("Classement");
        tableParcours = new TableView<>();
        cleColonne = new TableColumn<>("durée");
        setupColumn(cleColonne, "Cle", 65);
        TableColumn<Parcours, String> cheminColonne = new TableColumn<>("Chemin");
        setupColumn(cheminColonne, "Chemin", 100);
        tableParcours.getColumns().addAll(cleColonne, cheminColonne);
        getChildren().addAll(labelClass, tableParcours);
    }
    /**
     * Configuration d'une colonne de la table de classement.
     *
     * @param col    La colonne à configurer.
     * @param getter Le nom de la propriété correspondante dans la classe Parcours.
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
     * Affiche les parcours dans le classement en fonction des critères spécifiés.
     *
     * @param nbSolutions Le nombre de solutions à afficher.
     * @param parChoix    Le critère de classement (1: ordre croissant, 2: ordre décroissant).
     * @param parObjectif Le critère d'objectif (1: durée, 2: déplacements, 3: nombre de quêtes).
     * @throws ClassementException Si le nombre de solutions demandé n'est pas atteint.
     */
    public void afficher(int nbSolutions, int parChoix, int parObjectif) throws ClassementException {
        tableParcours.getItems().clear();
        Label labelErreur = VBoxRoot.getFormulaire().getLabelErreur();
        labelErreur.setText("");
        int parcoursAffiche = 0;
        if (parObjectif == 1) {
            cleColonne.setText("Durée");
        } else if (parObjectif == 2) {
            cleColonne.setText("Déplacements");
        } else {
            cleColonne.setText("NbQuêtes");
        }
        TreeMap<Integer, ArrayList<Parcours>> treeParcours = Classement.getChTreeParcours();
        if (parChoix == 2) {
            TreeMap<Integer, ArrayList<Parcours>> mapInverse = new TreeMap<>(Collections.reverseOrder());
            mapInverse.putAll(treeParcours);
            treeParcours = mapInverse;
        }
        for (ArrayList<Parcours> listeParcours : treeParcours.values()) {
            if (parcoursAffiche == nbSolutions) {
                break;
            }
            for (Parcours parcours : listeParcours) {
                if (parcoursAffiche == nbSolutions) {
                    break;
                }
                parcoursAffiche++;
                tableParcours.getItems().add(parcours);
            }
        }
        if (parcoursAffiche != nbSolutions) {
            throw new ClassementException(0);
        }
    }
}
