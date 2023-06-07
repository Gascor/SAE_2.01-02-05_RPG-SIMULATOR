package modele;

import java.util.ArrayList;
import java.util.HashSet;

public class Algorithme {
    /**
     * permet de déterminer tous les parcours gloutons du scenario
     * @param parScenario (Scenario): scenario qu'utilise les parcours
     * @param listparcours ( ArrayList<Parcours>): liste chronologique des parcours ajoutés
     */
    public static void recursiviteGloutonneEfficace(Scenario parScenario,ArrayList<Parcours> listparcours){
        Parcours parparcours = listparcours.get(listparcours.size() -1);
        if ((parparcours.queteFinPossibleEfficace())){
            parparcours.ajouteDuree(parparcours.getQueteFin());
            parparcours.ajouteQueteFaite(parparcours.getQueteFin());
            Classement.ajout(parparcours);
        }
        else{
            Quete QueteActuelle = parparcours.getQueteActuelle();
            parparcours.quetesPossibles();
            HashSet<Quete> ensQueteProche= QueteActuelle.queteProche(parparcours.getQuetePossible());
            for (Quete q: ensQueteProche){
                parparcours.ajouteDuree(q);
                parparcours.ajoutexp(q.getExperience());
                parparcours.ajouteQueteFaite(q);
                Algorithme.recursiviteGloutonneEfficace(parScenario,listparcours);
                parparcours = listparcours.get(listparcours.size() - 1);
                listparcours.add(new Parcours(parScenario, parparcours.getChexp(), parparcours.getduree(),0, "duree", parparcours.getQuetesFaite(), parparcours.getQuetesNonFaite(), new HashSet<>()));
                listparcours.remove(listparcours.size()-2);
                parparcours = listparcours.get(listparcours.size() - 1);
                if(parparcours.getQuetesFaite().containsKey(0)) {
                    parparcours.enleverQueteFaite(parparcours.getQueteFin());
                    parparcours.enleverDuree(parparcours.getQueteFin());
                }
                parparcours.enleverQueteFaite(q);
                parparcours.enleverDuree(q);
                parparcours.ajoutexp(-q.getExperience());


            }


        }
    }
    /**
     * permet de lancer l'algorithme gluton efficace
     * @param parScenario (Scenario): Scenario utilisé pour lancer l'algorithme
     */
    public static void solutionGloutonneEfficace(Scenario parScenario){
        ArrayList<Parcours> listparcours = new ArrayList<>();
        listparcours.add(new Parcours(parScenario,"duree"));
        Algorithme.recursiviteGloutonneEfficace(parScenario,listparcours);

    }
    /**
     * permet de déterminer le chemin le plus court en faisant toutes les quêtes
     * @param parScenario (Scenario): scenario qu'utilise les parcours
     * @param listparcours ( ArrayList<Parcours>): liste chronologique des parcours ajoutés
     */
    public static void recursiviteGlutonneExhaustive(Scenario parScenario,ArrayList<Parcours> listparcours){
        Parcours parparcours = listparcours.get(listparcours.size() -1);
        if ((parparcours.queteFinPossibleExhaustive())){
            parparcours.ajouteDuree(parparcours.getQueteFin());
            parparcours.ajouteQueteFaite(parparcours.getQueteFin());
            Classement.ajout(parparcours);

        }
        else{
            Quete QueteActuelle = parparcours.getQueteActuelle();
            parparcours.quetesPossibles();
            HashSet<Quete> ensQueteProche= QueteActuelle.queteProche(parparcours.getQuetePossible());
            for (Quete q: ensQueteProche){
                parparcours.ajouteDuree(q);
                parparcours.ajoutexp(q.getExperience());
                parparcours.ajouteQueteFaite(q);
                Algorithme.recursiviteGlutonneExhaustive(parScenario,listparcours);
                parparcours = listparcours.get(listparcours.size() - 1);
                listparcours.add(new Parcours(parScenario, parparcours.getChexp(), parparcours.getduree(),0, "duree", parparcours.getQuetesFaite(), parparcours.getQuetesNonFaite(), new HashSet<>()));
                listparcours.remove(listparcours.size()-2);
                parparcours = listparcours.get(listparcours.size() - 1);
                if(parparcours.getQuetesFaite().containsKey(0)) {
                    parparcours.enleverQueteFaite(parparcours.getQueteFin());
                    parparcours.enleverDuree(parparcours.getQueteFin());
                }
                parparcours.enleverQueteFaite(q);
                parparcours.enleverDuree(q);
                parparcours.ajoutexp(-q.getExperience());
            }

        }
    }
    /**
     * permet de lancer l'algorithme gluton exhaustive
     * @param parScenario (Scenario): Scenario utilisé pour lancer l'algorithme
     */
    public static void solutionGloutonneExhaustive(Scenario parScenario){
        ArrayList<Parcours> listparcours = new ArrayList<>();
        listparcours.add(new Parcours(parScenario,"duree"));
        Algorithme.recursiviteGlutonneExhaustive(parScenario,listparcours);
    }
    /**
     * permet de determiner tout les parcours les plus optimale en terme de durée de manière efficace.
     * @param parScenario (Scenario): scenario qu'utilise les parcours
     * @param listparcours ( ArrayList<Parcours>): liste chronologique des parcours ajoutés
     */
    public static void recursiviteSpeedrunEfficace(Scenario parScenario,ArrayList<Parcours> listparcours){
        ;
    }
    /**
     * permet de lancer l'algorithme speedrun efficace
     * @param parScenario (Scenario): Scenario utilisé pour lancer l'algorithme
     */
    public static void solutionSpeedrunEfficace(Scenario parScenario){
        ;
    }

}
