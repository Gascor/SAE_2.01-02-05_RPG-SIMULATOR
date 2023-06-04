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
}