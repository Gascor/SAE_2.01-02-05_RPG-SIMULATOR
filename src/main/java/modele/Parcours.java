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
}