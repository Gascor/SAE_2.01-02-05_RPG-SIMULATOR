package vue;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Classe principale de l'application RPG.
 * Elle hérite de la classe Application de JavaFX.
 */
public class RpgApplication extends Application {
    /**
     * Méthode de démarrage de l'application.
     * Crée la scène principale de l'interface utilisateur et affiche la fenêtre.
     *
     * @param stage l'objet Stage représentant la fenêtre principale de l'application
     */
    public void start(Stage stage) {
        VBoxRoot root = new VBoxRoot();
        Scene scene = new Scene(root, 1300, 300);
        root.setAlignment(Pos.CENTER);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Méthode principale de l'application.
     * Lance l'application JavaFX.
     * @param args les arguments de la ligne de commande
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
}
