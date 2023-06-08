package modele;

import org.junit.jupiter.api.Test;

import java.io.File;
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
    @Test
    void solutionGloutonneExhaustive() {
        // restart le classement
        Classement.getChTreeParcours().clear();
        System.out.println("solution gloutonne exhaustive");
        Quete q1 = new Quete("1|(4, 3)|()|2|100|explorer pic de Bhanborim");
        Quete q2 = new Quete("2|(3, 1)|((1,),)|1|150|dialoguer avec Kaela la chaman des esprits");
        Quete q3 = new Quete("3|(0, 4)|((2,),)|3|200|explorer palais de Ahehona");
        Quete q4 = new Quete("4|(3, 2)|((2,),)|6|100|vaincre Loup Géant");
        Quete q5 = new Quete("0|(1,1)|((3,4),)|4|350|vaincre Araignée lunaire");
        Scenario s1= new Scenario("Scenario.txt");
        s1.ajout(q1);
        s1.ajout(q2);
        s1.ajout(q4);
        s1.ajout(q3);
        s1.ajout(q5);
        Algorithme.solutionGloutonneExhaustive(s1);
        LinkedHashMap <Integer,Quete> soluce1 = new LinkedHashMap<>();
        soluce1.put(q1.getNumero(),q1);
        soluce1.put(q2.getNumero(),q2);
        soluce1.put(q4.getNumero(),q4);
        soluce1.put(q3.getNumero(),q3);
        soluce1.put(q5.getNumero(),q5);
        Parcours p1 = new Parcours(s1,"duree");
        for (ArrayList<Parcours> listeParcours : Classement.getChTreeParcours().values()) {
            for (Parcours parcours : listeParcours) {
                p1 = parcours;
            }
            break;
        }
        System.out.println(1);
        System.out.println(p1);
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
        Algorithme.solutionGloutonneExhaustive(s2);
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
        assertTrue(p2.getQuetesFaite().equals(soluce2));
    }
    @Test
    void solutionSpeedrunEfficace() {
        //réinitialise le classement
        System.out.println("Test de la méthode solution speedrun efficace");
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s0 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_0" + ".txt"));
        Algorithme.solutionSpeedrunEfficace(s0,10000,1);
        int firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(27, firstKey);

        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(30, firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s1 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_1" + ".txt"));
        Algorithme.solutionSpeedrunEfficace(s1,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(34, firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(40, firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s2 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_2" + ".txt"));
        Algorithme.solutionSpeedrunEfficace(s2,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(80, firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(106, firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s3 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_3" + ".txt"));
        Algorithme.solutionSpeedrunEfficace(s3,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(53, firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(72, firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s4 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_4" + ".txt"));
        Algorithme.solutionSpeedrunEfficace(s4,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(95, firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(167, firstKey);
    }
    @Test
    void solutionSpeedrunExhaustive() {
        //réinitialise le classement
        System.out.println("Test de la méthode solution speedrun exhaustive");
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s0 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_0" + ".txt"));
        Algorithme.solutionSpeedrunExhaustive(s0,10000,1);
        int firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(36,firstKey);

        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(40,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s1 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_1" + ".txt"));
        Algorithme.solutionSpeedrunExhaustive(s1,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(34,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(40,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s2 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_2" + ".txt"));
        Algorithme.solutionSpeedrunExhaustive(s2,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(91,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(117,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s3 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_3" + ".txt"));
        Algorithme.solutionSpeedrunExhaustive(s3,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(64,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(74,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s4 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_4" + ".txt"));
        Algorithme.solutionSpeedrunExhaustive(s4,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(115,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(171,firstKey);
    }
    @Test
    void solutionEfficaceNbQuete() {
        //réinitialise le classement
        System.out.println("Test de la méthode solution efficace nbquete");
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s0 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_0" + ".txt"));
        Algorithme.solutionEfficaceNbQuete(s0,10000,1);
        int firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(4,firstKey);

        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(4,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s1 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_1" + ".txt"));
        Algorithme.solutionEfficaceNbQuete(s1,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(5,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(6,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s2 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_2" + ".txt"));
        Algorithme.solutionEfficaceNbQuete(s2,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(9,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(9,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s3 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_3" + ".txt"));
        Algorithme.solutionEfficaceNbQuete(s3,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(6,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(8,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s4 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_4" + ".txt"));
        Algorithme.solutionEfficaceNbQuete(s4,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(7,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(10,firstKey);
    }
    @Test
    void SolutionExhaustivenbQuete() {
        //réinitialise le classement
        System.out.println("Test de la méthode solution exhaustive nbquete");
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s0 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_0" + ".txt"));
        Algorithme.solutionExhaustiveNbQuete(s0,10000,1);
        int firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(5,firstKey);

        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(5,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s1 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_1" + ".txt"));
        Algorithme.solutionExhaustiveNbQuete(s1,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(6,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(6,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s2 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_2" + ".txt"));
        Algorithme.solutionExhaustiveNbQuete(s2,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(10,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(10,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s3 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_3" + ".txt"));
        Algorithme.solutionExhaustiveNbQuete(s3,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(8,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(8,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s4 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_4" + ".txt"));
        Algorithme.solutionExhaustiveNbQuete(s4,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(10,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(10,firstKey);
    }
    @Test
    void solutionDeplacementEfficace() {
        //réinitialise le classement
        System.out.println("Test de la méthode solution deplacement efficace");
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s0 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_0" + ".txt"));
        Algorithme.solutionDeplacementEfficace(s0,10000,1);
        int firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(14,firstKey);

        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(20,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s1 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_1" + ".txt"));
        Algorithme.solutionDeplacementEfficace(s1,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(17,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(23,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s2 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_2" + ".txt"));
        Algorithme.solutionDeplacementEfficace(s2,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(35,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(57,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s3 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_3" + ".txt"));
        Algorithme.solutionDeplacementEfficace(s3,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(26,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(36,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s4 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_4" + ".txt"));
        Algorithme.solutionDeplacementEfficace(s4,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(49,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(107,firstKey);
    }
    @Test
    void solutionDeplacementExhaustive() {
        //réinitialise le classement
        System.out.println("Test de la méthode solution deplacement exhaustive");
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s0 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_0" + ".txt"));
        Algorithme.solutionDeplacementExhaustive(s0,10000,1);
        int firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(20,firstKey);

        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(24,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s1 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_1" + ".txt"));
        Algorithme.solutionDeplacementExhaustive(s1,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(17,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(23,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s2 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_2" + ".txt"));
        Algorithme.solutionDeplacementExhaustive(s2,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(39,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(65,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s3 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_3" + ".txt"));
        Algorithme.solutionDeplacementExhaustive(s3,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(28,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(38,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s4 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_4" + ".txt"));
        Algorithme.solutionDeplacementExhaustive(s4,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(55,firstKey);
        firstKey = Classement.getChTreeParcours().lastKey();
        assertEquals(111,firstKey);
    }
    @Test
    void choixAlgo(){
        System.out.println("Test de la méthode choix algorithme");
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Scenario s0 = LectureFichierTexte.lecture(new File("scenario" + File.separator + "scenario_0" + ".txt"));
        Algorithme.choixAlgo(s0,1,1,10000,1);
        int firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(27,firstKey);
        Classement.getChTreeParcours().clear();
        Algorithme.choixAlgo(s0,1,2,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(14,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Algorithme.choixAlgo(s0,1,3,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(4,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Algorithme.choixAlgo(s0,2,1,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(36,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Algorithme.choixAlgo(s0,2,2,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(20,firstKey);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Algorithme.choixAlgo(s0,2,3,10000,1);
        firstKey = Classement.getChTreeParcours().firstKey();
        assertEquals(5,firstKey);
    }
}