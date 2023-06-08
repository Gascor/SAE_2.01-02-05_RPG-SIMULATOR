package modele;

/**
 * Cette classe représente une exception spécifique pour les erreurs de Launcher.
 * Elle étend la classe Exception et implémente l'interface ConstantesErreurs.
 */
public class LauncherException extends Exception implements ConstantesErreurs {
    private final int chCodeErreur;

    /**
     * Constructeur de la classe LauncherException.
     *
     * @param parCodeError le code d'erreur correspondant à l'exception
     */
    public  LauncherException(int parCodeError) {
        super();
        chCodeErreur = parCodeError;
    }

    /**
     * Retourne le code d'erreur associé à l'exception.
     *
     * @return le code d'erreur associé à l'exception
     */
    public String getCodeErreur() {
        return ERREURS_LAUNCHER[chCodeErreur];
    }
}
