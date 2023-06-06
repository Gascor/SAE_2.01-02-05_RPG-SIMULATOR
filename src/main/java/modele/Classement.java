package modele;

import java.util.ArrayList;
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
     */
    public static void afficherClassement() {
        for (ArrayList<Parcours> listeParcours : chTreeParcours.values()) {
            for (Parcours parcours : listeParcours) {
                System.out.println( parcours.toString());
            }
            break;
        }
    }
}
