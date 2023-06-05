package modele;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

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
}