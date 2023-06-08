package modele;

import java.io.File;
import java.util.Scanner;

/**
 * Cette classe permet de lancer Un algorithme selon le choix de l'utilisateur
 */
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
    /**
     * Méthode principale qui affiche la vue principale du programme.
     *
     * @throws LauncherException si une erreur se produit pendant l'exécution.
     */
    public static void mainView() throws LauncherException {
        scenarioLoader();
        int entier = Launcher.choixUtilisateur("▌Dialog▐ ► Quel scénario voulez-vous analyser? :",0,10,0);
        Scenario scenario = listeScenario[entier];
        entier = Launcher.choixUtilisateur("▌Dialog▐ ► Quelles est la solution que vous voulez utiliser:" + "\n\n1- Solution efficace" + "\n\n2- Solution exhaustive",1,2,1);
        int typeSolution = entier;
        entier = Launcher.choixUtilisateur("▌Dialog▐ ► Quel type d'objectif voulez vous:" + "\n\n1- Durée" + "\n\n2- Déplacements"+ "\n\n3- NbQuete",1,3,2);
        int objectif = entier;
        entier = Launcher.choixUtilisateur2("▌Dialog▐  ► Combien de solutions voulez vous ?",1,3);
        int nbSolutions = entier;
        entier = Launcher.choixUtilisateur("▌Dialog▐ ► Choisissez entre les meilleurs solutions ou les pires solutions:" + "\n\n1- Meilleurs choix" + "\n\n2- Pires choix",1,2,1);
        int nbChoix = entier;
        Algorithme.choixAlgo(scenario,typeSolution,objectif,nbSolutions,nbChoix);
        try {
            Classement.afficherClassement(nbSolutions,nbChoix);
        }
        catch (ClassementException e){
            System.out.println(e.getCodeErreur());
        }
    }
}
