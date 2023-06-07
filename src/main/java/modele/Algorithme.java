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
        //regarde si la quete 0 est possible
        if ((parparcours.queteFinPossibleEfficace())){
            // rajoute la quête et sa durée
            parparcours.ajouteDuree(parparcours.getQueteFin());
            parparcours.ajouteQueteFaite(parparcours.getQueteFin());
            // rajoute le parcours finis au classement
            Classement.ajout(parparcours);

        }
        else{
            Quete QueteActuelle = parparcours.getQueteActuelle();
            //regarde les quetes possibles
            parparcours.quetesPossibles();
            //prend les quetes les plus proches de queteActuelle
            HashSet<Quete> ensQueteProche= QueteActuelle.queteProche(parparcours.getQuetePossible());
            for (Quete q: ensQueteProche){
                parparcours.ajouteDuree(q);
                parparcours.ajoutexp(q.getExperience());
                parparcours.ajouteQueteFaite(q);
                Algorithme.recursiviteGloutonneEfficace(parScenario,listparcours);
                parparcours = listparcours.get(listparcours.size() - 1);
                // crée un nouveau parcours sur la base du parcours actuelle
                listparcours.add(new Parcours(parScenario, parparcours.getChexp(), parparcours.getduree(),0, "duree", parparcours.getQuetesFaite(), parparcours.getQuetesNonFaite(), new HashSet<>()));
                // enléve dans liste parcours le parcours inutile pour la récursivité
                listparcours.remove(listparcours.size()-2);
                parparcours = listparcours.get(listparcours.size() - 1);
                // regarde si le parcours a fait la quete 0 pour l'enlever
                if(parparcours.getQuetesFaite().containsKey(0)) {
                    parparcours.enleverQueteFaite(parparcours.getQueteFin());
                    parparcours.enleverDuree(parparcours.getQueteFin());
                }
                // enleve la quete q avec sa durée et son expérience
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
        //regarde si la quete 0 est possible
        if ((parparcours.queteFinPossibleExhaustive())){
            // rajoute la quête et sa durée
            parparcours.ajouteDuree(parparcours.getQueteFin());
            parparcours.ajouteQueteFaite(parparcours.getQueteFin());
            // rajoute le parcours finis au classement
            Classement.ajout(parparcours);

        }
        else{
            Quete QueteActuelle = parparcours.getQueteActuelle();
            //regarde les quetes possibles
            parparcours.quetesPossibles();
            //prend les quetes les plus proches de queteActuelle
            HashSet<Quete> ensQueteProche= QueteActuelle.queteProche(parparcours.getQuetePossible());
            for (Quete q: ensQueteProche){
                parparcours.ajouteDuree(q);
                parparcours.ajoutexp(q.getExperience());
                parparcours.ajouteQueteFaite(q);
                Algorithme.recursiviteGlutonneExhaustive(parScenario,listparcours);
                parparcours = listparcours.get(listparcours.size() - 1);
                // crée un nouveau parcours sur la base du parcours actuelle
                listparcours.add(new Parcours(parScenario, parparcours.getChexp(), parparcours.getduree(),0, "duree", parparcours.getQuetesFaite(), parparcours.getQuetesNonFaite(), new HashSet<>()));
                // enléve dans liste parcours le parcours inutile pour la récursivité
                listparcours.remove(listparcours.size()-2);
                parparcours = listparcours.get(listparcours.size() - 1);
                // regarde si le parcours a fait la quete 0 pour l'enlever
                if(parparcours.getQuetesFaite().containsKey(0)) {
                    parparcours.enleverQueteFaite(parparcours.getQueteFin());
                    parparcours.enleverDuree(parparcours.getQueteFin());
                }
                // enleve la quete q avec sa durée et son expérience
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
        Parcours parparcours = listparcours.get(listparcours.size() -1);
        //regarde si la quete 0 est possible
        if ((parparcours.queteFinPossibleEfficace())){
            // rajoute la quête et sa durée
            parparcours.ajouteDuree(parparcours.getQueteFin());
            parparcours.ajouteQueteFaite(parparcours.getQueteFin());
            // rajoute le parcours finis au classement
            Classement.ajout(parparcours);

        }
        else{
            //regarde les quetes possibles
            parparcours.quetesPossibles();
            HashSet<Quete> ensQuetePossible=  new HashSet<>(parparcours.getQuetePossible());
            for (Quete q: ensQuetePossible){
                parparcours.ajouteDuree(q);
                parparcours.ajoutexp(q.getExperience());
                parparcours.ajouteQueteFaite(q);
                Algorithme.recursiviteSpeedrunEfficace(parScenario,listparcours);
                parparcours = listparcours.get(listparcours.size() - 1);
                // crée un nouveau parcours sur la base du parcours actuelle
                listparcours.add(new Parcours(parScenario, parparcours.getChexp(), parparcours.getduree(),0, "duree", parparcours.getQuetesFaite(), parparcours.getQuetesNonFaite(), new HashSet<>()));
                // enléve dans liste parcours le parcours inutile pour la récursivité
                listparcours.remove(listparcours.size()-2);
                parparcours = listparcours.get(listparcours.size() - 1);
                // regarde si le parcours a fait la quete 0 pour l'enlever
                if(parparcours.getQuetesFaite().containsKey(0)) {
                    parparcours.enleverQueteFaite(parparcours.getQueteFin());
                    parparcours.enleverDuree(parparcours.getQueteFin());
                }
                // enleve la quete q avec sa durée et son expérience
                parparcours.enleverQueteFaite(q);
                parparcours.enleverDuree(q);
                parparcours.ajoutexp(-q.getExperience());
            }
        }
    }
    /**
     * permet de lancer l'algorithme speedrun efficace.
     * @param parScenario (Scenario): Scenario utilisé pour lancer l'algorithme
     */
    public static void solutionSpeedrunEfficace(Scenario parScenario){
        ArrayList<Parcours> listparcours = new ArrayList<>();
        listparcours.add(new Parcours(parScenario, "duree"));
        Algorithme.recursiviteSpeedrunEfficace(parScenario, listparcours);
    }
    /**
     * permet de determiner tout les parcours les plus optimale en terme de durée de manière exhaustif.
     * @param parScenario (Scenario): scenario qu'utilise les parcours
     * @param listparcours ( ArrayList<Parcours>): liste chronologique des parcours ajoutés
     */
    public static void recursiviteSpeedrunExhaustive(Scenario parScenario,ArrayList<Parcours> listparcours){
        Parcours parparcours = listparcours.get(listparcours.size() -1);
        //regarde si la quete 0 est possible
        if ((parparcours.queteFinPossibleExhaustive())){
            // rajoute la quête et sa durée
            parparcours.ajouteDuree(parparcours.getQueteFin());
            parparcours.ajouteQueteFaite(parparcours.getQueteFin());
            // rajoute le parcours finis au classement
            Classement.ajout(parparcours);

        }
        else{
            //regarde les quetes possibles
            parparcours.quetesPossibles();
            HashSet<Quete> ensQuetePossible=  new HashSet<>(parparcours.getQuetePossible());
            for (Quete q: ensQuetePossible){
                parparcours.ajouteDuree(q);
                parparcours.ajoutexp(q.getExperience());
                parparcours.ajouteQueteFaite(q);
                Algorithme.recursiviteSpeedrunExhaustive(parScenario,listparcours);
                parparcours = listparcours.get(listparcours.size() - 1);
                // crée un nouveau parcours sur la base du parcours actuelle
                listparcours.add(new Parcours(parScenario, parparcours.getChexp(), parparcours.getduree(),0, "duree", parparcours.getQuetesFaite(), parparcours.getQuetesNonFaite(), new HashSet<>()));
                // enléve dans liste parcours le parcours inutile pour la récursivité
                listparcours.remove(listparcours.size()-2);
                parparcours = listparcours.get(listparcours.size() - 1);
                // regarde si le parcours a fait la quete 0 pour l'enlever
                if(parparcours.getQuetesFaite().containsKey(0)) {
                    parparcours.enleverQueteFaite(parparcours.getQueteFin());
                    parparcours.enleverDuree(parparcours.getQueteFin());
                }
                // enleve la quete q avec sa durée et son expérience
                parparcours.enleverQueteFaite(q);
                parparcours.enleverDuree(q);
                parparcours.ajoutexp(-q.getExperience());
            }
        }
    }
    /**
     * permet de lancer l'algorithme speedrun exhaustive.
     * @param parScenario (Scenario): Scenario utilisé pour lancer l'algorithme
     */
    public static void solutionSpeedrunExhaustive(Scenario parScenario){
        ArrayList<Parcours> listparcours = new ArrayList<>();
        listparcours.add(new Parcours(parScenario, "duree"));
        Algorithme.recursiviteSpeedrunExhaustive(parScenario, listparcours);
    }
    /**
     * permet de determiner tout les parcours les plus optimales en terme de nombre de quete de manière efficace.
     * @param parScenario (Scenario): scenario qu'utilise les parcours
     * @param listparcours ( ArrayList<Parcours>): liste chronologique des parcours ajoutés
     */
    public static void recursiviteEfficaceNbquete(Scenario parScenario,ArrayList<Parcours> listparcours){
        Parcours parparcours = listparcours.get(listparcours.size() -1);
        if ((parparcours.queteFinPossibleEfficace())){
            // rajoute la quête
            parparcours.ajouteQueteFaite(parparcours.getQueteFin());
            // rajoute le parcours finis au classement
            Classement.ajout(parparcours);

        }
        else{
            //regarde les quetes possibles
            parparcours.quetesPossibles();
            HashSet<Quete> ensQuetePossible=  new HashSet<>(parparcours.getQuetePossible());
            for (Quete q: ensQuetePossible){
                parparcours.ajoutexp(q.getExperience());
                parparcours.ajouteQueteFaite(q);
                Algorithme.recursiviteEfficaceNbquete(parScenario,listparcours);
                parparcours = listparcours.get(listparcours.size() - 1);
                // crée un nouveau parcours sur la base du parcours actuelle
                listparcours.add(new Parcours(parScenario, parparcours.getChexp(), parparcours.getduree(),0, "nbQuete", parparcours.getQuetesFaite(), parparcours.getQuetesNonFaite(), new HashSet<>()));
                // enléve dans liste parcours le parcours inutile pour la récursivité
                listparcours.remove(listparcours.size()-2);
                parparcours = listparcours.get(listparcours.size() - 1);
                // regarde si le parcours a fait la quete 0 pour l'enlever
                if(parparcours.getQuetesFaite().containsKey(0)) {
                    parparcours.enleverQueteFaite(parparcours.getQueteFin());
                }
                // enleve la quete q avec  son expérience
                parparcours.enleverQueteFaite(q);
                parparcours.ajoutexp(-q.getExperience());
            }
        }
    }
    /**
     * permet de lancer l'algorithme efficace nbquete.
     * @param parScenario (Scenario): Scenario utilisé pour lancer l'algorithme
     */
    public static void solutionEfficaceNbQuete(Scenario parScenario) {
        ArrayList<Parcours> listparcours = new ArrayList<>();
        listparcours.add(new Parcours(parScenario, "nbQuete"));
        Algorithme.recursiviteEfficaceNbquete(parScenario, listparcours);
    }
    /**
     * permet de determiner tout les parcours les plus optimales en terme de nombre de quete de manière exhaustive.
     * @param parScenario (Scenario): scenario qu'utilise les parcours
     * @param listparcours ( ArrayList<Parcours>): liste chronologique des parcours ajoutés
     */
    public static void recursiviteExhaustiveNbquete(Scenario parScenario,ArrayList<Parcours> listparcours){
        Parcours parparcours = listparcours.get(listparcours.size() -1);
        if ((parparcours.queteFinPossibleExhaustive())){
            // rajoute la quête
            parparcours.ajouteQueteFaite(parparcours.getQueteFin());
            // rajoute le parcours finis au classement
            Classement.ajout(parparcours);

        }
        else{
            //regarde les quetes possibles
            parparcours.quetesPossibles();
            HashSet<Quete> ensQuetePossible=  new HashSet<>(parparcours.getQuetePossible());
            for (Quete q: ensQuetePossible){
                parparcours.ajoutexp(q.getExperience());
                parparcours.ajouteQueteFaite(q);
                Algorithme.recursiviteExhaustiveNbquete(parScenario,listparcours);
                parparcours = listparcours.get(listparcours.size() - 1);
                // crée un nouveau parcours sur la base du parcours actuelle
                listparcours.add(new Parcours(parScenario, parparcours.getChexp(), parparcours.getduree(),0, "nbQuete", parparcours.getQuetesFaite(), parparcours.getQuetesNonFaite(), new HashSet<>()));
                // enléve dans liste parcours le parcours inutile pour la récursivité
                listparcours.remove(listparcours.size()-2);
                parparcours = listparcours.get(listparcours.size() - 1);
                // regarde si le parcours a fait la quete 0 pour l'enlever
                if(parparcours.getQuetesFaite().containsKey(0)) {
                    parparcours.enleverQueteFaite(parparcours.getQueteFin());
                }
                // enleve la quete q avec  son expérience
                parparcours.enleverQueteFaite(q);
                parparcours.ajoutexp(-q.getExperience());
            }
        }
    }
    /**
     * permet de lancer l'algorithme exhaustif nbquete.
     * @param parScenario (Scenario): Scenario utilisé pour lancer l'algorithme
     */
    public static void solutionExhaustiveNbQuete(Scenario parScenario) {
        ArrayList<Parcours> listparcours = new ArrayList<>();
        listparcours.add(new Parcours(parScenario, "nbQuete"));
        Algorithme.recursiviteExhaustiveNbquete(parScenario, listparcours);
    }
    /**
     * permet de determiner tout les parcours les plus optimales en terme de nombre de deplacement de manière efficace.
     * @param parScenario (Scenario): scenario qu'utilise les parcours
     * @param listparcours ( ArrayList<Parcours>): liste chronologique des parcours ajoutés
     */
    public static void recursiviteSpeedrunDeplacement(Scenario parScenario,ArrayList<Parcours> listparcours){
        ;
    }
    /**
     * permet de lancer l'algorithme deplacement efficace.
     * @param parScenario (Scenario): Scenario utilisé pour lancer l'algorithme
     */
    public static void solutionSpeedrunDeplacement(Scenario parScenario){
        ;
    }
}
