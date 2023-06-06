package modele;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectureFichierTexte {
    /**
     * lis un fichier scenario. Crée le scénario avec ses quetes
     *
     * @param fichier (File): le fichier du scénario
     * @return  L'objet scenario : si le fichier existe
     *          Null             : si le fichier n'existe pas
     */
    public static Scenario lecture(File fichier) {
        try {
            Scanner scanner = new Scanner(fichier);
            Scenario scenario = new Scenario(fichier.getName());
            while (scanner.hasNext()) {
                Quete quete = new Quete(scanner.nextLine());
                scenario.ajout(quete);
            }
            return scenario;
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}