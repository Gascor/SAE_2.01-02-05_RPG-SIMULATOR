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
     * transforme la representation de la quete en forme de ligne en création d'une instance de la classe quete
     * @param ligne (String): representation de la quete en forme de ligne
     */
    public Quete(String ligne){
        Scanner scanner = new Scanner(ligne).useDelimiter("\\|");
        while (scanner.hasNext()){
            this.numero = scanner.nextInt();
            String strpos = scanner.next();
            this.pos = extraitPos(strpos);
            String strprecond = scanner.next();
            this.precond = extraitPrecond(strprecond);
            this.duree = scanner.nextInt();
            this.experience = scanner.nextInt();
            this.intitule = scanner.next();
        }
    }

    /**
     * transforme la representation de la position de la quete en forme de ligne à un tableau de 2 de longueurs
     * @param scanner (String): la representation de la position de la quete en forme de ligne
     * @return un tableau à 2 indice. O indice est x et 1er indice est y
     */
    public int [] extraitPos(String scanner){
        String precond = scanner;
        int [] preconditions = new int [2];
        precond = precond.replace("(","");
        precond = precond.replace(")","");
        precond = precond.replace(" ","");
        Scanner scanPrecondition = new Scanner(precond).useDelimiter(",");
        int i= 0;
        while(scanPrecondition.hasNext()){
            String extrait = scanPrecondition.next();
            if(!extrait.equals(""))
                preconditions[i]=Integer.parseInt(extrait);
            i++;
        }
        return preconditions;
    }

    /**
     * transforme la representation des préconditions de la quete en forme de ligne à un tableau de 4 de longueurs
     * @param scanner (String) est la representation des préconditions de la quete en forme de ligne
     * @return un tableau à 4 indices qui possede les préconditions avant de faire la quête (d'autres quêtes)
     */
    public int [] extraitPrecond(String scanner){
        String precond = scanner;
        int [] preconditions = new int[4];
        precond = precond.replace("(","");
        precond = precond.replace(")","");
        precond = precond.replace(" ","");
        Scanner scanPrecondition = new Scanner(precond).useDelimiter(",");
        int i= 0;
        while(scanPrecondition.hasNext()){
            String extrait = scanPrecondition.next();
            if(!extrait.equals(""))
                preconditions[i]=Integer.parseInt(extrait);
            i++;
        }
        return preconditions;
    }

    /**
     * permet savoir si la quete posséde aucune préconditions
     * @return false: si la quête posséde des préconditions
     *         true: si la quete possede aucunes préconditions
     */
    public boolean testprecondition(){
        for(int e:precond){
            if (e!=0)
                return false;
        }
        return true;
    }

    /**
     * retourne la distance entre la quete actuelle this et une autre quete
     * @param parQuete :  represente La quete suivante
     * @return int>=0
     */
    public int distanceQuete(Quete parQuete){

        return Math.abs(this.pos[0] - parQuete.pos[0]) + Math.abs(this.pos[1] - parQuete.pos[1]) ;
    }

    /**
     * determine et renvoie les quetes réalisables et les plus proches de this
     * @param ensQuete : represente l'ensemble des quetes réalisables
     * @return ensQProche qui est un ensemble des quetes les plus proches de this
     */
    public HashSet<Quete> queteProche(HashSet<Quete> ensQuete){
        HashSet<Quete> ensQProche  = new HashSet<>();
        int min = 0;
        for(Quete q:ensQuete){
            min = this.distanceQuete(q);
            break;
        }
        for(Quete quete: ensQuete ){
            if (min > this.distanceQuete(quete)){
                ensQProche.clear();
                ensQProche.add(quete);
                min = this.distanceQuete(quete);
            }
            else if (min == this.distanceQuete(quete)) {
                ensQProche.add(quete);
            }
        }
        return ensQProche;
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
