package modele;


import java.io.File;

public class Client {
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