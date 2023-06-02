package modele;

public class Quete {

    private int numero;
    private int [] pos = new int[2] ;
    private int [] precond = new int[4];
    private int duree;
    private int experience;
    private String intitule;

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
