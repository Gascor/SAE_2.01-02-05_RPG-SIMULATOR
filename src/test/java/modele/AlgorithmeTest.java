package modele;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmeTest {
    @Test
    void solutionGloutonneEfficace() {
        System.out.println("Test de la méthode solution gloutonne efficace");
        Quete q1 = new Quete("1|(4, 3)|()|2|100|explorer pic de Bhanborim");
        Quete q2 = new Quete("2|(3, 1)|((1,),)|1|150|dialoguer avec Kaela la chaman des esprits");
        Quete q3 = new Quete("3|(0, 4)|((2,),)|3|200|explorer palais de Ahehona");
        Quete q4 = new Quete("4|(3, 2)|((2,),)|6|100|vaincre Loup Géant");
        Quete q5 = new Quete("0|(1,1)|((3,4),)|4|350|vaincre Araignée lunaire");
        Scenario s1= new Scenario("Scenario.txt");
        s1.ajout(q1);
        s1.ajout(q2);
        s1.ajout(q3);
        s1.ajout(q4);
        s1.ajout(q5);
        Algorithme.solutionGloutonneEfficace(s1);
        LinkedHashMap<Integer,Quete> soluce1 = new LinkedHashMap<>();
        soluce1.put(q1.getNumero(),q1);
        soluce1.put(q2.getNumero(),q2);
        soluce1.put(q4.getNumero(),q4);
        soluce1.put(q5.getNumero(),q5);
        Parcours p1 = new Parcours(s1,"duree");
        for (ArrayList<Parcours> listeParcours : Classement.getChTreeParcours().values()) {
            for (Parcours parcours : listeParcours) {
                p1 = parcours;
            }
            break;
        }
        assertTrue(p1.getQuetesFaite().equals(soluce1));



        Quete q6 = new Quete("2|(2, 2)|((4, 1),)|2|100|explorer tombeau de Reha Thalor");
        Quete q7 = new Quete("5|(4, 3)|((1, 4), (2,))|1|150|explorer jardin de Syhe Lenora");
        Quete q8 = new Quete("3|(1, 0)|((4,), (1, 2))|7|100|dialoguer avec Morrigan la déesse de la mort");
        Quete q9 = new Quete("1|(3, 1)|()|2|50|dialoguer avec Alaric le mage noir");
        Quete q10 = new Quete("4|(4, 0)|()|2|100|explorer porte de Ifha Ennore");
        Quete q11 = new Quete("0|(2, 3)|((3,),)|3|400|explorer collines de Kortorhm");
        Scenario s2 = new Scenario("Scenario.txt");
        s2.ajout(q9);
        s2.ajout(q10);
        s2.ajout(q8);
        s2.ajout(q6);
        s2.ajout(q7);
        s2.ajout(q11);
        Classement.getChTreeParcours().clear();
        Algorithme.solutionGloutonneEfficace(s2);
        LinkedHashMap <Integer,Quete> soluce2 = new LinkedHashMap<>();
        soluce2.put(q9.getNumero(),q9);
        soluce2.put(q10.getNumero(),q10);
        soluce2.put(q8.getNumero(),q8);
        soluce2.put(q6.getNumero(),q6);
        soluce2.put(q7.getNumero(),q7);
        soluce2.put(q11.getNumero(),q11);
        Parcours p2 = new Parcours(s2,"duree");
        for (ArrayList<Parcours> listeParcours2 : Classement.getChTreeParcours().values()) {
            for (Parcours parcours : listeParcours2) {
                p2 = parcours;
            }
            break;
        }
        System.out.println(p2.getQuetesFaite());
        assertTrue(p2.getQuetesFaite().equals(soluce2));
    }
}