package controlleur;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioMenuItem;
import modele.Algorithme;
import modele.Classement;
import modele.ClassementException;
import modele.Scenario;
import vue.FormulaireException;
import vue.VBoxRoot;

/**
 * La classe Controleur est un gestionnaire d'événements qui gère les actions effectuées dans l'interface utilisateur.
 * Elle implémente l'interface EventHandler et fournit l'implémentation de la méthode handle.
 */
public class Controleur implements EventHandler<ActionEvent> {
    /**
     * Gère l'événement d'action spécifié.
     *
     * @param event l'événement d'action à gérer
     */
    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() instanceof RadioMenuItem) {
            RadioMenuItem menuItem = (RadioMenuItem) event.getSource();
            int numScenario = Integer.parseInt(menuItem.getText());
            VBoxRoot.getScenarioBox().afficher(numScenario);
            VBoxRoot.getScenarioBox().setScenarioActuelle(numScenario);
        }
        if((event.getSource() instanceof Button btn)) {
            Scenario scenario = VBoxRoot.getScenarioBox().getScenario();
            try {
                int[] tabChoix = VBoxRoot.getFormulaire().getChoix();
                if (tabChoix != null) {
                    Classement.getChTreeParcours().clear();
                    Classement.setChNbSolutionsTotales(0);
                    Algorithme.choixAlgo(scenario, tabChoix[1], tabChoix[2],tabChoix[0],tabChoix[3]);
                    VBoxRoot.getClassementBox().afficher(tabChoix[0], tabChoix[3], tabChoix[2]);
                }
            } catch (FormulaireException ignored) {
            } catch (ClassementException e) {
                Label labelErreur = VBoxRoot.getFormulaire().getLabelErreur();
                labelErreur.setText(e.getCodeErreur());
            }

        }
    }
}
