package modele;

import org.junit.jupiter.api.*;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder( MethodOrderer.OrderAnnotation.class) public class ParcoursTest {

    @Test @Order(1)
    void extraitQuete(){
        System.out.println("Test méthode ExtraitQuete");
        Scenario scenario = new Scenario("scenario");
        Quete quete0 = new Quete("0|(1, 0)|()|2|100|explorer pic de Bhanborim");
        Quete quete1 = new Quete("1|(1, 1)|()|2|100|explorer pic de Bhanborim");
        Quete quete2 = new Quete("2|(1, 0)|()|2|100|explorer pic de Bhanborim");
        scenario.ajout(quete0);
        scenario.ajout(quete2);
        scenario.ajout(quete1);
        Parcours parcours = new Parcours(scenario,"durée");
        Quete[] solution = {quete1,quete2};
        assertEquals(2,parcours.getQuetesNonFaite().size());
        assertArrayEquals(solution, parcours.getQuetesNonFaite().toArray());
    }
    @Test @Order(1)
    void queteFinPossibleEfficace() {
        System.out.println("Test méthode queteFinPossible");
        // Test 0
        Scenario scenario = new Scenario("test");
        Quete quete0 = new Quete("0|(1, 0)|((1,),(3,))|2|200|explorer pic de Bhanborim");
        Quete quete1 = new Quete("1|(1, 1)|()|2|100|explorer pic de Bhanborim");
        Quete quete2 = new Quete("2|(1, 0)|()|2|100|explorer pic de Bhanborim");
        Quete quete3 = new Quete("3|(1, 0)|()|2|100|explorer pic de Bhanborim");
        scenario.ajout(quete0);
        scenario.ajout(quete1);
        scenario.ajout(quete2);
        scenario.ajout(quete3);
        LinkedHashMap <Integer,Quete> queteFaites = new LinkedHashMap<>();
        queteFaites.put(quete1.getNumero(),quete1);
        queteFaites.put(quete2.getNumero(),quete2);
        queteFaites.put(quete3.getNumero(),quete3);
        Parcours parcours = new Parcours(scenario, 300, 0,0, "duree", queteFaites, new TreeSet<Quete>(), new HashSet<Quete>());
        assertTrue(parcours.queteFinPossibleEfficace());
        // Test 1
        parcours.setChexp(200);
        assertTrue(parcours.queteFinPossibleEfficace());
        // Test 2
        Scenario scenario1 = new Scenario("test1");
        Quete quete4 = new Quete("0|(1, 0)|((4,),(3,))|2|200|explorer pic de Bhanborim");
        scenario1.ajout(quete1);
        scenario1.ajout(quete4);
        scenario1.ajout(quete2);
        scenario1.ajout(quete3);
        Parcours parcours1 = new Parcours(scenario1, 150, 0,0, "duree", queteFaites, new TreeSet<Quete>(), new HashSet<Quete>());
        assertFalse(parcours1.queteFinPossibleEfficace());
        // Test 3
        parcours1.setChexp(200);
        assertFalse(parcours1.queteFinPossibleEfficace());
    }
    @Test @Order(1)
    public void compareTo(){
        System.out.println("Test méthode compareTo");
        Scenario scenario = new Scenario("test");
        Quete quete0 = new Quete("0|(1, 0)|((1,),(3,))|2|200|explorer pic de Bhanborim");
        scenario.ajout(quete0);
        Parcours parcours = new Parcours(scenario, 300,20,0, "duree", new LinkedHashMap<Integer, Quete>(), new TreeSet<Quete>(), new HashSet<Quete>());
        Parcours parcours1 = new Parcours(scenario, 300, 10,0, "duree", new LinkedHashMap<Integer, Quete>(), new TreeSet<Quete>(), new HashSet<Quete>());
        assertEquals(10,parcours.compareTo(parcours1));
        assertEquals(0,parcours.compareTo(parcours));
        assertEquals(-10,parcours1.compareTo(parcours));
    }
    @Test @Order(1)
    public void quetesPossibles(){
        System.out.println("Test méthode quetesPossible");
        // Test 0

        Scenario scenario = new Scenario("test1");
        Quete quete1 = new Quete("1|(1, 1)|()|2|100|explorer pic de Bhanborim"); // Faite
        Quete quete2 = new Quete("2|(1, 0)|()|2|100|explorer pic de Bhanborim"); // Possible
        Quete quete3 = new Quete("3|(1, 0)|((4,),)|2|100|explorer pic de Bhanborim"); // Non Faite
        Quete quete4 = new Quete("4|(1, 0)|((5,),)|2|100|explorer pic de Bhanborim"); // Non Faite
        scenario.ajout(quete1);
        scenario.ajout(quete2);
        scenario.ajout(quete3);
        scenario.ajout(quete4);
        LinkedHashMap <Integer,Quete> queteFaites = new LinkedHashMap<>();
        queteFaites.put(quete1.getNumero(),quete1);
        HashSet<Quete> quetePossible = new HashSet<>();
        quetePossible.add(quete2);
        TreeSet<Quete> queteNonFaite = new TreeSet<>();
        queteNonFaite.add(quete2);
        queteNonFaite.add(quete3);
        queteNonFaite.add(quete4);
        Parcours parcours = new Parcours(scenario,0,0,0,"duree",queteFaites,queteNonFaite,quetePossible);
        Quete [] solution = {quete2};
        parcours.quetesPossibles();
        assertArrayEquals(solution, parcours.getQuetePossible().toArray());
        // Test 1
        Scenario scenario1 = new Scenario("test");
        Quete quete5 = new Quete("4|(1, 0)|((1,),)|2|100|explorer pic de Bhanborim"); // Non Faite, Quete 4bis
        scenario1.ajout(quete1);
        scenario1.ajout(quete2);
        scenario1.ajout(quete3);
        scenario1.ajout(quete5);
        TreeSet<Quete> queteNonFaite1 = new TreeSet<>();
        queteNonFaite1.add(quete2);
        queteNonFaite1.add(quete3);
        queteNonFaite1.add(quete5);
        Parcours parcours1 = new Parcours(scenario1,0,0,0,"duree",queteFaites,queteNonFaite1,quetePossible);
        HashSet<Quete> expectedSet = new HashSet<>();
        expectedSet.add(quete2);
        expectedSet.add(quete5);
        parcours1.quetesPossibles();
        Assertions.assertEquals(parcours1.getQuetePossible(), expectedSet);
        // Test 2
        Scenario scenario2 = new Scenario("test1");
        Quete quete6 = new Quete("5|(1, 0)|((1,),)|2|100|explorer pic de Bhanborim");
        scenario2.ajout(quete1);
        scenario2.ajout(quete2);
        scenario2.ajout(quete3);
        scenario2.ajout(quete5);
        TreeSet<Quete> queteNonFaite2 = new TreeSet<>();
        queteNonFaite2.add(quete2);
        queteNonFaite2.add(quete6);
        queteNonFaite2.add(quete5);
        Parcours parcours2 = new Parcours(scenario2,0,0,0,"duree",queteFaites,queteNonFaite2,quetePossible);

        HashSet<Quete> expectedSet1 = new HashSet<>();
        expectedSet1.add(quete2);
        expectedSet1.add(quete5);
        expectedSet1.add(quete6);
        parcours2.quetesPossibles();
        System.out.println(parcours2.getQuetePossible());
        Assertions.assertEquals(parcours2.getQuetePossible(), expectedSet1);
    }
    @Test @Order(1)
    public void ajouteDuree(){
        System.out.println("Test méthode ajouteDuree");
        Scenario scenario = new Scenario("test1");
        Quete quete1 = new Quete("1|(2, 2)|()|10|100|explorer pic de Bhanborim");
        Quete quete2 = new Quete("2|(1, 0)|()|2|100|explorer pic de Bhanborim");
        Quete quete3 = new Quete("3|(4, 1)|((4,),)|2|100|explorer pic de Bhanborim");
        Quete quete4 = new Quete("4|(1, 0)|((5,),)|6|100|explorer pic de Bhanborim");
        scenario.ajout(quete1);
        scenario.ajout(quete2);
        scenario.ajout(quete3);
        scenario.ajout(quete4);
        Parcours parcours = new Parcours(scenario,"duree");
        parcours.ajouteDuree(quete1);
        assertEquals( 14,parcours.getduree());
        LinkedHashMap<Integer,Quete> QueteFaite = new LinkedHashMap<>();
        QueteFaite.put(1,quete4);
        QueteFaite.put(2,quete2);
        QueteFaite.put(3,quete3);
        //probleme
        Parcours parcours1 = new Parcours(scenario,10,10,0,"duree",QueteFaite,new TreeSet<Quete>(),new HashSet<Quete>());
        parcours1.ajouteDuree(quete1);
        assertEquals(23,parcours1.getduree());

    }
}