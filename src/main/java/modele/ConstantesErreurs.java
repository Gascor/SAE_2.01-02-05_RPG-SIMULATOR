package modele;
/**
 * L'interface ConstantesErreur définit les constantes liées aux erreurs du système.
 */
public interface ConstantesErreurs {
    String [] ERREURS_CLASSEMENTS = {
            "le nombre de solutions voulu est inférieure au nombre de parcours possibles!"
    };
    String [] ERREURS_LAUNCHER = {"le nombre n'est pas entre 0 et 10 inclus","le nombre n'est pas entre 1 et 2 inclus","le nombre n'est pas entre 1 et 3 inclus","le nombre doit être positif"
    };
    String [] ERREURS_FORMULAIRE = {"le nombre mis n'est pas du tout positif!"};
}
