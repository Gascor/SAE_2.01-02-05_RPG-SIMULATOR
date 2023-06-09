package modele;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeSet;

/**
 * Classe représentant un parcours dans un scénario.
 */
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
     * @param treeq (TreeSet Quete ) : est le treeSet de toutes les quetes du scénario
     * @return treeQueteNonFaite ((TreeSet Quete ): est l'ensemble des quetes non faites au début
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
        return ((chexp >= queteFin.getExperience()) && ((queteFin.quetePossible(chQuetesFaite))));
    }
    /**
     * vérifie les quêtes toujours non réalisables et les ajoutes dans les quetes possibles si elles sont maintenant réalisables
     */
    public void quetesPossibles(){
        HashSet <Quete> ensNonPossible = new HashSet<>(quetesNonFaite);
        ensNonPossible.removeAll(ensQuetePossible);
        for(Quete q :ensNonPossible){
            if (q.quetePossible(chQuetesFaite)){
                ensQuetePossible.add(q);
            }
        }
    }
    /**
     * retoune les quetes non faites actuelles du parcours
     * @return quetesNonFaite (TreeSet Quete ): represenle les quetes non faites du parcours
     */
    public TreeSet<Quete> getQuetesNonFaite() {
        return quetesNonFaite;
    }

    /**
     * retoune les quetes non faites actuelles du parcours
     * @return chQuetesFaite (LinkedHashMap Integer,Quete ): represente les quetes faites du parcours
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
     * permet de savoir la quete O peut etre réalisé de facon exhaustive
     *
     * @return false: si la quete ne peut etre réalisé
     *         true: si la quete peut etre réalisé
     */
    public boolean queteFinPossibleExhaustive(){
        return ((chexp >= queteFin.getExperience()) && ((queteFin.quetePossible(chQuetesFaite))) &&(((chScenario.getNbQuete() -1) == chQuetesFaite.keySet().size())));
    }
    /**
     * retourne un string qui affiche un parcours selon sa clé et les quetes faites
     * @return String: un string qui represente le parcours
     */
    @Override
    public String toString(){
        int cle = getCle();
        String str ="";
        for (Integer key : chQuetesFaite.keySet()){
            str = str + key + " ";
        }
        return cle + " ---> " + str;
    }
    /**
     * ajoute la duree de la quete à faire et le déplacement pour atteindre cette quete
     * @param parquete la quete à faire
     */
    public void ajouteDuree(Quete parquete){
        Quete queteActuelle = getQueteActuelle();
        if (queteActuelle.getNumero() == -10){
            chduree = parquete.getPos()[0] + parquete.getPos()[1]+parquete.getDuree();
        }
        else{
            chduree = chduree + queteActuelle.distanceQuete(parquete) + parquete.getDuree();
        }
    }
    /**
     * compare les durées entre deux parcours
     * @param parparcours : un autre parcours
     * @return inférieur à 0: si la duree (ou nbQuete ou deplacements) de this est inférieur a la duree (ou nbQuete ou deplacements) de parparcours
     *         égale à 0: si la duree (ou nbQuete ou deplacements) de this est égale a la duree (ou nbQuete ou deplacements) de parparcours
     *         supérieur à 0: si la duree (ou nbQuete ou deplacements) de this est supérieure a la duree (ou nbQuete ou deplacements) de parparcours
     */
    public int compareTo(Parcours parparcours) {
        if (chComparatif.equals("duree")) {
            return this.chduree - parparcours.chduree;
        } else if (chComparatif.equals("nbQuete")) {
            return this.chQuetesFaite.keySet().size() - parparcours.chQuetesFaite.keySet().size();
        } else {
            return this.chdeplacements - parparcours.chdeplacements;
        }
    }
    /**
     *
     * retourne la derniere quete qui vient d'etre faites
     * @return QueteActuelle (Quete): la derniére quete qui vient d'être faite
     */
    public Quete getQueteActuelle(){
        Quete queteActuelle = chQuetesFaite.values().stream().reduce((first, second) -> second).orElse(null);
        if (queteActuelle == null){
            return new Quete("-10|(0, 0)|()|0|0|oui");
        }
        return queteActuelle;
    }
    /**
     * retourne la durée du parcours
     * @return chduree(int) : la durée du parcours
     */
    public int getduree() {
        return chduree;
    }
    /**
     * retourne les quetes qui sont possibles à faire pour le parcours
     * @return ensQuetePossible ( HashSet Quete ): les quetes possibles à faire pour le parcours
     */
    public HashSet<Quete> getQuetePossible() {
        return ensQuetePossible;
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
    /**
     * ajoute l'expérience de la quete faites au parcours
     * @param parQueteExp (int): représente l'expérience de la quete faite
     */
    public void ajoutexp(int parQueteExp){
        this.chexp = chexp + parQueteExp;
    }
    /**
     * retourne l'expérience du parcours
     * @return chQuetesFaites (int): l'expérience du parcours
     */
    public int getChexp() {
        return chexp;
    }
    /**
     * ajoute la quete qui vient d'etre fait et l'enleve des quetes possibles et des quetes non faites
     * @param parquete (Quete) est la quete qui vient d'etre fait
     */
    public void ajouteQueteFaite(Quete parquete){
        chQuetesFaite.put(parquete.getNumero(),parquete);
        quetesNonFaite.remove(parquete);
        ensQuetePossible.remove(parquete);
    }
    /**
     * enleve la quete qui a été fait et l'a rajoute aux quetes possibles et aux quetes non faites
     * @param parquete (Quete) est la quete qui a été fait
     */
    public void enleverQueteFaite(Quete parquete) {
        chQuetesFaite.remove(parquete.getNumero());
        if (parquete.getNumero() != 0) {
            quetesNonFaite.add(parquete);
        }
    }
    /**
     * enlève la duree de la quete qui à été faite et le déplacement pour atteindre cette dernière
     * @param parquete la quete qui à été faite
     */
    public void enleverDuree(Quete parquete){
        Quete queteActuelle = getQueteActuelle();
        chduree = chduree - queteActuelle.distanceQuete(parquete) - parquete.getDuree();
    }
    /**
     * ajoute la duree de la quete à faire et le déplacement pour atteindre cette quete
     * @param parquete la quete à faire
     */
    public void ajouterDeplacement(Quete parquete){
        Quete queteActuelle = getQueteActuelle();
        if (queteActuelle.getNumero() == -10){
            chdeplacements = parquete.getPos()[0] + parquete.getPos()[1];
        }
        else{
            chdeplacements = chdeplacements + queteActuelle.distanceQuete(parquete);
        }
    }
    /**
     * enleve la duree de la quete à faire et le déplacement pour atteindre cette quete
     * @param parquete la quete à faire
     */
    public void enleverDeplacement(Quete parquete){
        Quete queteActuelle = getQueteActuelle();
        chdeplacements = chdeplacements - queteActuelle.distanceQuete(parquete);
    }
    /**
     * renvoi une clé correspondant au comparatif du parcours.
     * @return cle (int): retourne la durée du parcours: si this.parComparatif = duree
     *                  :retourne le nombre de quetes faites: si this.parComparatif = nbQuete
     *                  :retourne les déplacements du parcours: si this.parComparatif = deplacements
     */
    public int getCle(){
        int cle;
        if(getComparatif().equals("duree")){
            cle = getduree();
        } else if (getComparatif().equals("nbQuete")){
            cle = getQuetesFaite().keySet().size();
        }
        else {
            cle = getDeplacements();
        }
        return cle;
    }
    /**
     * Retourne le chemin du parcours sous la forme d'une chaîne de caractères.
     *
     * @return Le chemin du parcours.
     */
    public String getChemin(){
        String str ="";
        for (Integer key : chQuetesFaite.keySet()){
            str = str + key + " ";
        }
        return str;
    }
}