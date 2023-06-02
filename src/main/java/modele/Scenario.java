package modele;

import java.util.TreeSet;

public class Scenario {
    private final TreeSet<Quete> treeQuete;
    private int nbQuete;
    private final String chnom;

    /**
     * permet de constuire un objet de la classe Parcours
     * @param parnom (String): represente le nom du scénario
     */
    public Scenario(String parnom){
        treeQuete = new TreeSet<>();
        nbQuete = 0;
        chnom = parnom;

    }

    /**
     * ajoute une quete au scenario
     * @param chquete: Une quete qui doit etre dans ce scenario
     */
    public void ajout(Quete chquete){
        treeQuete.add(chquete);
        nbQuete = nbQuete + 1;
    }
}
