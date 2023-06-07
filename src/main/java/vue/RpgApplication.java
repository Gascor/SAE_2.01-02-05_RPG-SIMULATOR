package vue;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RpgApplication extends Application {
    public void start(Stage stage) {
        VBoxRoot root = new VBoxRoot();
        Scene scene = new Scene(root, 1300, 300);
        root.setAlignment(Pos.CENTER);
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
