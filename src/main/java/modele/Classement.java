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
        ;
    }
    /**
     * retourne les parcours triées selon une caractériqtique précise
     * @return chTreeParcours (TreeMap<Integer, ArrayList<Parcours>>): les parcours triées selon une caractériqtique précise
     */
    public static TreeMap<Integer, ArrayList<Parcours>> getChTreeParcours() {
        return chTreeParcours;
    }
}
