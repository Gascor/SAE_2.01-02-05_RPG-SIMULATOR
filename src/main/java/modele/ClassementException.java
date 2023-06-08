package modele;

/**
 * Cette classe représente une exception spécifique pour les erreurs de classement.
 * Elle étend la classe Exception et implémente l'interface ConstantesErreurs.
 */
public class ClassementException extends Exception  implements ConstantesErreurs {
    private final int chCodeErreur;
    /**
     * Constructeur de la classe ClassementException.
     *
     * @param parCodeError le code d'erreur correspondant à l'exception
     */
    public  ClassementException(int parCodeError) {
        super();
        chCodeErreur = parCodeError;
    }
    /**
     * Retourne le code d'erreur associé à l'exception.
     *
     * @return le code d'erreur associé à l'exception
     */
    public String getCodeErreur() {
        return ERREURS_CLASSEMENTS[chCodeErreur];
    }
}