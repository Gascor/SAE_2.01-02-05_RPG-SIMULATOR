package modele;

import java.io.File;
import java.util.Scanner;

public class Launcher {
    /**
     * Liste des scénarios chargés en mémoire.
     */
    public static Scenario[] listeScenario = new Scenario[11];
    /**
     * Charge les scénarios à partir des fichiers texte correspondants.
     */
    public static void scenarioLoader() {
        for (int i = 0; i < 11; i++) {
            String nomScenario = "scenario_" + i + ".txt";
            File file = new File("scenario" + File.separator + nomScenario);
            Scenario scenario = LectureFichierTexte.lecture(file);
            listeScenario[i] = scenario;
        }
    }
    /**
     * Demande à l'utilisateur de faire un choix en entrant un entier et le renvoie.
     *
     * @param parCommentaire Le message à afficher pour demander le choix à l'utilisateur.
     * @param premierecond   La valeur minimale valide pour le choix.
     * @param deuxconditions La valeur maximale valide pour le choix.
     * @param typeErreur     Le code d'erreur à utiliser en cas de choix invalide.
     * @return L'entier choisi par l'utilisateur.
     * @throws LauncherException si le choix de l'utilisateur est invalide.
     */
    public static int  choixUtilisateur(String parCommentaire, int premierecond, int deuxconditions,int typeErreur) throws LauncherException{
        int entier = -1;
        while ((entier < premierecond) || (entier > deuxconditions)) {
            try {
                Scanner choixScanner = new Scanner(System.in);
                System.out.println(parCommentaire);
                String entierstr = choixScanner.nextLine();
                entier = Integer.parseInt(entierstr);
                if (((entier < premierecond) || (entier > deuxconditions))) {
                    throw new LauncherException(typeErreur);
                }
            } catch (NumberFormatException e) {
                System.err.println("La valeur doit etre un nombre compris entre " +premierecond +" et " + deuxconditions + " inclus");
            } catch (LauncherException e) {
                System.err.println(e.getCodeErreur());
            }
        }
        return entier;
    }
    /**
     * Demande à l'utilisateur de faire un choix en entrant un entier positif et le renvoie.
     *
     * @param parCommentaire Le message à afficher pour demander le choix à l'utilisateur.
     * @param premierecond   La valeur minimale valide pour le choix.
     * @param typeErreur     Le code d'erreur à utiliser en cas de choix invalide.
     * @return L'entier choisi par l'utilisateur.
     * @throws LauncherException si le choix de l'utilisateur est invalide.
     */
    public static int  choixUtilisateur2(String parCommentaire, int premierecond,int typeErreur) throws LauncherException{
        int entier = -1;
        while (entier < premierecond){
            try {
                Scanner choixScanner = new Scanner(System.in);
                System.out.println(parCommentaire);
                String entierstr = choixScanner.nextLine();
                entier = Integer.parseInt(entierstr);
                if (entier < premierecond) {
                    throw new LauncherException(typeErreur);
                }
            } catch (NumberFormatException e) {
                System.err.println("la valeur doit etre un nombre positive");
            } catch (LauncherException e) {
                System.err.println(e.getCodeErreur());
            }
        }
        return entier;
    }
    /**
     * Renvoie la liste des scénarios chargés en mémoire.
     *
     * @return La liste des scénarios chargés en mémoire.
     */
    public static Scenario[] getListeScenario() {
        return listeScenario;
    }
}
