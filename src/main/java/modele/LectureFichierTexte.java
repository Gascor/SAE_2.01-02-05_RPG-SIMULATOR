package modele;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectureFichierTexte {
    public static void lecture(File fichier){
        try{
            Scanner scanner = new Scanner(fichier);
            Scenario scenario = new Scenario(fichier.getName());
            while (scanner.hasNext()){
                Quete quete = new Quete(scanner.nextLine());
                scenario.ajout(quete);

            }
        }
        catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }
    }
}