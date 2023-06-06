package modele;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class ClassementTest {
    @Test @Order(1)
    public void ajout(){
        // Premier Cas
        Scenario scenario = new Scenario("test1");
        Quete quete1 = new Quete("1|(2, 2)|()|10|100|explorer pic de Bhanborim");
        scenario.ajout(quete1);
        Parcours parcours1 = new Parcours(scenario,10,20,0,"duree",new LinkedHashMap<>(),new TreeSet<Quete>(),new HashSet<Quete>());
        Classement.ajout(parcours1);
        Classement.getChTreeParcours().get(20);
        ArrayList<Parcours> solution = new ArrayList<>();
        solution.add(parcours1);
        assertEquals(solution,Classement.getChTreeParcours().get(20));

        // Second Cas
        Parcours parcours2 = new Parcours(scenario,10,20,0,"duree",new LinkedHashMap<>(),new TreeSet<Quete>(),new HashSet<Quete>());
        Classement.ajout(parcours2);
        solution.add(parcours2);
        assertEquals(solution,Classement.getChTreeParcours().get(20));
    }
}