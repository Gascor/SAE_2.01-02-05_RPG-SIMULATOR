package modele;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class Parcours {
    private final Scenario chScenario;
    private int chexp;
    private int chduree;
    private int chdeplacements;
    private final String chComparatif;
    private final LinkedHashMap<Integer,Quete> chQuetesFaite;
    private final TreeSet<Quete> quetesNonFaite;
    private final Quete queteFin;
    private final HashSet<Quete> ensQuetePossible;
    /**
     * permet de constuire un objet de la classe Parcours
     * @param parComparatif (String): permet de savoir comment les Parcours vont etre comparée
     * @param parScenario (Scenario): Scenario sur lequel le parcours va se basé
     */
    public Parcours(Scenario parScenario,String parComparatif){
        chScenario = parScenario;
        chexp = 0;
        chduree = 0;
        chdeplacements = 0;
        chComparatif = parComparatif;
        chQuetesFaite =  new LinkedHashMap<>();
        quetesNonFaite = extraitQuete(chScenario.getTreeQuete());
        queteFin = chScenario.getTreeQuete().first();
        ensQuetePossible = new HashSet<>();
    }
    public Parcours(Scenario parScenario,int parexp ,int parduree,int pardeplacement, String parComparatif,LinkedHashMap<Integer,Quete> parQueteFaites,TreeSet<Quete> parQuetesNonFaites,HashSet<Quete> parQuetesPossibles){
        chScenario = parScenario;
        chexp = parexp;
        chduree = parduree;
        chdeplacements = pardeplacement;
        chComparatif = parComparatif;
        chQuetesFaite =  new LinkedHashMap<> (parQueteFaites);
        quetesNonFaite = new TreeSet<> (parQuetesNonFaites);
        queteFin = chScenario.getTreeQuete().first();
        ensQuetePossible =  new HashSet<>(parQuetesPossibles);
    }
    /**
     * crée un Treeset des quetes sans la quete 0
     * @param treeq (TreeSet<Quete>) : est le treeSet de toutes les quetes du scénario
     * @return treeQueteNonFaite ((TreeSet<Quete>): est l'ensemble des quetes non faites au début
     */
    public TreeSet <Quete> extraitQuete(TreeSet<Quete> treeq){
        TreeSet<Quete> treeQueteNonFaite = new TreeSet<>(treeq);
        treeQueteNonFaite.pollFirst();
        return treeQueteNonFaite;
    }
    /**
     * permet de savoir la quete O peut etre réalisé de facon efficace
     * @return false: si la quete ne peut etre réalisé
     *         true: si la quete peut etre réalisé
     */
    public boolean queteFinPossibleEfficace(){
        return false;
    }
    /**
     * retoune les quetes non faites actuelles du parcours
     * @return quetesNonFaite (TreeSet<Quete>): represenle les quetes non faites du parcours
     */
    public TreeSet<Quete> getQuetesNonFaite() {
        return quetesNonFaite;
    }

    /**
     * retoune les quetes non faites actuelles du parcours
     * @return chQuetesFaite (LinkedHashMap<Integer,Quete>): represente les quetes faites du parcours
     */
    public LinkedHashMap<Integer,Quete> getQuetesFaite() {
        return chQuetesFaite;
    }
    /**
     * change l'expérience du parcours
     * @param chexp (int): l'expérience qui qu'on veut mettre
     */
    public void setChexp(int chexp) {
        this.chexp = chexp;
    }
    /**
     * retourne un string qui affiche un parcours selon sa clé et les quetes faites
     * @return String: un string qui represente le parcours
     */
    @Override
    public String toString(){
        int cle;
        if(getComparatif().equals("duree")){
            cle = getduree();
        } else if (getComparatif().equals("nbQuete")){
            cle = getQuetesFaite().keySet().size();
        }
        else {
            cle = getDeplacements();
        }
        String str ="";
        for (Integer key : chQuetesFaite.keySet()){
            str = str + key + " ";
        }
        return cle + " ---> " + str;
    }
    /**
     * retourne la durée du parcours
     * @return chduree(int) : la durée du parcours
     */
    public int getduree() {
        return chduree;
    }
    /**
     * retourne la quete 0 (quete finale) du parcours
     * @return queteFin(Quete): quete finale du parcours
     */
    public Quete getQueteFin() {
        return queteFin;
    }
    public String getComparatif(){
        return chComparatif;
    }
    public int getDeplacements(){
        return chdeplacements;
    }
}