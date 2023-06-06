package modele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Classement {
    private static TreeMap<Integer, ArrayList<Parcours>> chTreeParcours = new TreeMap<>();

    /**
     * ajoute le parcours finis dans le classement
     * @param parparcours (Parcours) est un parcours finis
     */
    public static void ajout(Parcours parparcours) {

        if (chTreeParcours.containsKey(parparcours.getduree())) {
            ArrayList<Parcours> listeParcours = chTreeParcours.get(parparcours.getduree());
            listeParcours.add(parparcours);
        } else {
            ArrayList<Parcours> listeParcours = new ArrayList<>();
            listeParcours.add(parparcours);
            chTreeParcours.put(parparcours.getduree(), listeParcours);
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

}
