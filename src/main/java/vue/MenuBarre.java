package vue;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;

import java.util.Optional;

/**
 * Classe représentant la barre de menu de l'interface utilisateur.
 */
public class MenuBarre extends MenuBar implements ConstantesScenario {
    /**
     * Constructeur de la classe MenuBarre.
     * Initialise et configure les menus et les éléments de la barre de menu.
     */
    public MenuBarre() {
        Menu menuQuitter = new Menu("Quitter");
        MenuItem menuItemQuitter = new MenuItem("Quitter");
        menuQuitter.getItems().add(menuItemQuitter);
        Menu menuScenario = new Menu("Scenario");
        this.getMenus().addAll(menuQuitter,menuScenario);
        ToggleGroup scenarioGroupe = new ToggleGroup();
        // Ajout des éléments de menu pour chaque scénario disponible
        for (String numS :NSCENARIO){
            RadioMenuItem menuItem = new RadioMenuItem(numS);
            menuItem.setText(numS);
            menuScenario.getItems().add(menuItem);
            menuItem.setToggleGroup(scenarioGroupe);
            menuItem.setOnAction(VBoxRoot.getControleur());
        }
        // Sélection du premier élément de menu par défaut
        RadioMenuItem firstRadioMenuItem = (RadioMenuItem) scenarioGroupe.getToggles().get(0);
        firstRadioMenuItem.setSelected(true);
        // Gestionnaire d'événement pour l'option "Quitter"
        menuItemQuitter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Quitter l'application ?");
                alert.setHeaderText("Êtes-vous certain de vouloir quitter l'application ?");
                Optional<ButtonType> option = alert.showAndWait();
                if (option.get() == ButtonType.OK) {
                    System.exit(0);
                }
            }
        });
    }
}