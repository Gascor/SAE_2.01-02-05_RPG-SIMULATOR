package modele;

import java.util.ArrayList;

public class Algorithme {
    /**
     * permet de déterminer tous les parcours gloutons du scenario
     * @param parScenario (Scenario): scenario qu'utilise les parcours
     * @param listparcours ( ArrayList<Parcours>): liste chronologique des parcours ajoutés
     */
    public static void recursiviteGloutonneEfficace(Scenario parScenario,ArrayList<Parcours> listparcours){
        ;
    }
    /**
     * permet de lancer l'algorithme gluton efficace
     * @param parScenario (Scenario): Scenario utilisé pour lancer l'algorithme
     */
    public static void solutionGloutonneEfficace(Scenario parScenario){
        ArrayList<Parcours> listparcours = new ArrayList<>();
        listparcours.add(new Parcours(parScenario,"duree"));
        Algorithme.recursiviteGloutonneEfficace(parScenario,listparcours);
        Classement.afficherClassement();

    }
}
