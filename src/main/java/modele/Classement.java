package modele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Classement {
    private static TreeMap<Integer, ArrayList<Parcours>> chTreeParcours = new TreeMap<>();
    private static int chNbSolutionsTotales = 0;

    /**
     * ajoute le parcours finis dans le classement
     * @param parparcours (Parcours) est un parcours finis
     */
    public static void ajout(Parcours parparcours) {
        int cle = parparcours.getCle();
        if (chTreeParcours.containsKey(cle)) {
            ArrayList<Parcours> listeParcours = chTreeParcours.get(cle);
            listeParcours.add(parparcours);
        } else {
            ArrayList<Parcours> listeParcours = new ArrayList<>();
            listeParcours.add(parparcours);
            chTreeParcours.put(cle, listeParcours);
        }
    }
    /**
     * retourne les parcours triées selon une caractériqtique précise
     * @return chTreeParcours (TreeMap<Integer, ArrayList<Parcours>>): les parcours triées selon une caractériqtique précise
     */
    public static TreeMap<Integer, ArrayList<Parcours>> getChTreeParcours() {
        return chTreeParcours;
    }
    /**
     * affiche la durée des et les parcours par ordre croissant sur la durée
     * @param parChoix (int) représente le choix entre les meilleures ou pires solutions, si parChoix=1 alors on prend les meilleures solutions, sinon si c'est égale a 2 c'est les pires.
     * @param nbSolutions (int) représente le nombre de solutions qu'on veut afficher.
     */
    public static void afficherClassement(int nbSolutions,int parChoix) throws ClassementException {
        int parcoursaffiche = 0;
        if (parChoix == 2){
            // inverse l'ordre des valeurs de chTreeParcours
            TreeMap<Integer, ArrayList<Parcours>> mapinverse = new TreeMap<>(Collections.reverseOrder());
            mapinverse.putAll(chTreeParcours);
            chTreeParcours = mapinverse;
        }
        for (ArrayList<Parcours> listeParcours : chTreeParcours.values()) {
            if (parcoursaffiche == nbSolutions){
                break;
            }
            for (Parcours parcours : listeParcours) {
                if (parcoursaffiche == nbSolutions) {
                    break;
                }
                parcoursaffiche ++;
                System.out.println( parcours.toString());

            }
        }
        if (parcoursaffiche !=nbSolutions) {
            throw new ClassementException(0);
        }
    }
    /**
     * permet d'enlever des parcours au Classement s'ils ne correspondent plus à nos critéres
     * @param parsolutions (int): Le nombre de solutions qui doit etre présente à la fin du classement
     * @param parparcours (int): parcours qu'on veut rajouter
     * @param parChoix (int): represente le choix de l'utilisateur entre les meilleures et les pires solutions : 1 represente les meilleures solutions
     *                                                                                                         : 2 represente les pires solutions
     */
    public static void regulationParcours(int parsolutions,Parcours parparcours,int parChoix){
        ;
    }
}
