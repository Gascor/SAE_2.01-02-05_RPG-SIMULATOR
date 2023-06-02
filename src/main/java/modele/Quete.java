package modele;

import java.util.*;
public class Quete {

    private int numero;
    private int [] pos = new int[2] ;
    private int [] precond = new int[4];
    private int duree;
    private int experience;
    private String intitule;

    /**
     * transforme la representation des préconditions de la quete en forme de ligne à un tableau de 4 de longueurs
     * @param scanner (String) est la representation des préconditions de la quete en forme de ligne
     * @return un tableau à 4 indices qui possede les préconditions avant de faire la quête (d'autres quêtes)
     */
    public int [] extraitPrecond(String scanner){
        return null;
    }

    /**
     * retoune la position de la quete sur la carte
     * @return pos (int []) : position de la quete sur la carte
     */
    public int[] getPos() {
        return pos;
    }

    /**
     * retourne les préconditions de la quete
     * @return precond (int []): préconditions de la quete
     */
    public int[] getPrecond() {
        return precond;
    }
}
