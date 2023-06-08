package modele;

/**
 * Cette classe représente le point d'entrée alternatif du programme.
 * Elle contient la méthode `main` qui lance l'exécution de l'interface utilisateur.
 */
public class Client2 {
    /**
     * Point d'entrée alternatif du programme pour l'interface utilisateur.
     *
     * @param a les arguments de la ligne de commande
     */
    public static void main(String[] a){
        try {
            // Lance l'interface utilisateur
            Launcher.mainView();
        }
        catch (LauncherException ignored){
            // Ignorer l'exception de lancement
        }
    }
}
