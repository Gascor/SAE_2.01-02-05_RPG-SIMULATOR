package vue;

import modele.ConstantesErreurs;

/**
 * Classe d'exception spécifique au formulaire.
 * Cette exception est levée lorsqu'une erreur se produit lors de la validation du formulaire.
 */
public class FormulaireException extends Exception implements ConstantesErreurs {
    private final int chCodeErreur;

    /**
     * Constructeur de la classe ClassementException.
     *
     * @param parCodeError le code d'erreur correspondant à l'exception
     */
    public  FormulaireException(int parCodeError) {
        super();
        chCodeErreur = parCodeError;
    }

    /**
     * Retourne le code d'erreur associé à l'exception.
     *
     * @return le code d'erreur associé à l'exception
     */
    public String getCodeErreur() {
        return ERREURS_FORMULAIRE[chCodeErreur];
    }
}

