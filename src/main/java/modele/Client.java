package modele;


import java.io.File;

/**
 * Cette classe représente le point d'entrée du programme.
 * Elle contient la méthode `main` qui lance l'exécution du programme.
 */
public class Client {
    /**
     * Point d'entrée du programme.
     *
     * @param a les arguments de la ligne de commande
     * @throws ClassementException si une exception de classement se produit
     */
    public static void main(String[] a) throws ClassementException {
        File file = new File("scenario"+File.separator+"scenario_0" +
                ".txt");
        Scenario scenario = LectureFichierTexte.lecture(file);
        // lance la solution glutonne exhaustive
        Algorithme.solutionGloutonneExhaustive(scenario);
        try {
            Classement.afficherClassement(1,1);
        }
        // affiche le message de l'exception
        catch (ClassementException e) {
            System.out.println(e.getCodeErreur());
        }
    }
}