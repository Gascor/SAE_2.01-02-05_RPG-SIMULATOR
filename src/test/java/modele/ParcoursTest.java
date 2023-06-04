package modele;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParcoursTest {

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
}