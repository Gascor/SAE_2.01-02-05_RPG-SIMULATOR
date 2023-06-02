package modele;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.*;

class QueteTest {
    @Test @Order(1)
    void extraitPos() {
        System.out.println("Test méthode extraitPos");
        Quete quete = new Quete("1|(2, 4)|()|2|100|explorer pic de Bhanborim");
        assertEquals(2,quete.getPos()[0]);
        assertEquals(4,quete.getPos()[1]);
    }
    @Test @Order(1)
    void extraitPrecond() {
        System.out.println("Test méthode extraitPrecond");
        Quete quete = new Quete("1|(2, 4)|()|2|100|explorer pic de Bhanborim");
        assertEquals(0,quete.getPrecond()[0]);
        assertEquals(0,quete.getPrecond()[1]);
        assertEquals(0,quete.getPrecond()[2]);
        assertEquals(0,quete.getPrecond()[3]);
        Quete quete1 = new Quete("1|(2, 4)|((1,),)|2|100|explorer pic de Bhanborim");
        assertEquals(1,quete1.getPrecond()[0]);
        assertEquals(0,quete1.getPrecond()[1]);
        assertEquals(0,quete1.getPrecond()[2]);
        assertEquals(0,quete1.getPrecond()[3]);
        Quete quete2 = new Quete("1|(2, 4)|((1,), (3,))|2|100|explorer pic de Bhanborim");
        assertEquals(1,quete2.getPrecond()[0]);
        assertEquals(0,quete2.getPrecond()[1]);
        assertEquals(3,quete2.getPrecond()[2]);
        assertEquals(0,quete2.getPrecond()[3]);
        Quete quete3 = new Quete("1|(2, 4)|((1,), (3, 4))|2|100|explorer pic de Bhanborim");
        assertEquals(1,quete3.getPrecond()[0]);
        assertEquals(0,quete3.getPrecond()[1]);
        assertEquals(3,quete3.getPrecond()[2]);
        assertEquals(4,quete3.getPrecond()[3]);
        Quete quete4 = new Quete("1|(2, 4)|((1, 2),)|2|100|explorer pic de Bhanborim");
        assertEquals(1,quete4.getPrecond()[0]);
        assertEquals(2,quete4.getPrecond()[1]);
        assertEquals(0,quete4.getPrecond()[2]);
        assertEquals(0,quete4.getPrecond()[3]);
        Quete quete5 = new Quete("1|(2, 4)|((1, 2), (3,))|2|100|explorer pic de Bhanborim");
        assertEquals(1,quete5.getPrecond()[0]);
        assertEquals(2,quete5.getPrecond()[1]);
        assertEquals(3,quete5.getPrecond()[2]);
        assertEquals(0,quete5.getPrecond()[3]);
        Quete quete6 = new Quete("1|(2, 4)|((1, 2), (3,4))|2|100|explorer pic de Bhanborim");
        assertEquals(1,quete6.getPrecond()[0]);
        assertEquals(2,quete6.getPrecond()[1]);
        assertEquals(3,quete6.getPrecond()[2]);
        assertEquals(4,quete6.getPrecond()[3]);
    }
    @Test @Order(1)
    void testprecondition() {
        System.out.println("Test méthode precondition");
        Quete quete = new Quete("1|(4, 3)|()|2|100|explorer pic de Bhanborim");
        assertTrue(quete.testprecondition());
        Quete quete1 = new Quete("1|(4, 3)|((1,),)|2|100|explorer pic de Bhanborim");
        assertFalse(quete1.testprecondition());
        Quete quete2 = new Quete("1|(4, 3)|((1, 2), (3,4))|2|100|explorer pic de Bhanborim");
        assertFalse(quete2.testprecondition());
    }
    @Test @Order(1)
    void distanceQuete(){
        System.out.println("Test méthode distanceQuete");
        Quete quete = new Quete("1|(2, 2)|()|2|100|explorer pic de Bhanborim");
        Quete quete1 = new Quete("1|(2, 1)|()|2|100|explorer pic de Bhanborim");
        Quete quete2 = new Quete("1|(1, 2)|()|2|100|explorer pic de Bhanborim");
        Quete quete3= new Quete("1|(1, 1)|()|2|100|explorer pic de Bhanborim");
        assertEquals(0,quete.distanceQuete(quete));
        assertEquals(1,quete.distanceQuete(quete1));
        assertEquals(1,quete1.distanceQuete(quete));
        assertEquals(1,quete.distanceQuete(quete2));
        assertEquals(2,quete.distanceQuete(quete3));
        assertEquals(2,quete1.distanceQuete(quete2));
        assertEquals(1,quete2.distanceQuete(quete));
        assertEquals(2,quete2.distanceQuete(quete1));
        assertEquals(2,quete3.distanceQuete(quete));
    }
    @Test @Order(2)
    void queteProche(){
        System.out.println("Test méthode QueteProche");
        Quete quete = new Quete("1|(0,0 )|()|2|100|explorer pic de Bhanborim");
        Quete quete1 = new Quete("1|(1, 0)|()|2|100|explorer pic de Bhanborim");
        Quete quete2 = new Quete("1|(1, 1)|()|2|100|explorer pic de Bhanborim");
        Quete quete3 = new Quete("1|(1, 0)|()|2|100|explorer pic de Bhanborim");
        HashSet <Quete> ens1 = new HashSet<>();
        ens1.add(quete1);
        ens1.add(quete2);
        Quete[] solution = {quete1};
        HashSet<Quete> t1 = quete.queteProche(ens1);
        assertEquals(1,t1.size());
        assertTrue(t1.containsAll(Arrays.asList(solution)));
        HashSet <Quete> ens2 = new HashSet<>();
        ens2.add(quete1);
        ens2.add(quete3);
        Quete[] solution2 = {quete1,quete3};
        HashSet<Quete> t2 = quete.queteProche(ens2);
        assertEquals(2,t2.size());
        assertTrue(t2.containsAll(Arrays.asList(solution2)));
        HashSet <Quete> ens3 = new HashSet<>();
        ens3.add(quete2);
        ens3.add(quete3);
        Quete[] solution3 = {quete3};
        HashSet<Quete> t3 = quete.queteProche(ens3);
        assertEquals(1,t3.size());
        assertTrue(t3.containsAll(Arrays.asList(solution3)));
    }
    @Test @Order(1)
    public void quetePossible(){
        System.out.println("Test méthode QuetePossible");
        LinkedHashMap<Integer,Quete> listQueteFaite = new LinkedHashMap<>();
        Quete quete12 = new Quete("1|(0,0 )|()|2|100|explorer pic de Bhanborim");
        Quete quete11 = new Quete("2|(1, 0)|()|2|100|explorer pic de Bhanborim");
        Quete quete10 = new Quete("3|(1, 1)|()|2|100|explorer pic de Bhanborim");
        Quete quete9 = new Quete("4|(1, 0)|()|2|100|explorer pic de Bhanborim");
        listQueteFaite.put(1,quete12);
        listQueteFaite.put(2,quete11);
        listQueteFaite.put(3,quete10);
        listQueteFaite.put(4,quete9);
        Quete quete = new Quete("1|(2, 4)|((1,),(3,2)|2|100|explorer pic de Bhanborim");
        assertTrue(quete.quetePossible(listQueteFaite));
        Quete quete1 = new Quete("1|(2, 4)|((1,),(6,2)|2|100|explorer pic de Bhanborim");
        assertTrue(quete1.quetePossible(listQueteFaite));
        Quete quete2 = new Quete("1|(2, 4)|((6,1),(2,)|2|100|explorer pic de Bhanborim");
        assertTrue(quete2.quetePossible(listQueteFaite));
        Quete quete3 = new Quete("1|(2, 4)|((6,1),(3,2)|2|100|explorer pic de Bhanborim");
        assertTrue(quete3.quetePossible(listQueteFaite));
        Quete quete4 = new Quete("1|(2, 4)|((1,),(8,9)|2|100|explorer pic de Bhanborim");
        assertFalse(quete4.quetePossible(listQueteFaite));
        Quete quete5 = new Quete("1|(2, 4)|((6,1),(8,)|2|100|explorer pic de Bhanborim");
        assertFalse(quete5.quetePossible(listQueteFaite));
        Quete quete6 = new Quete("1|(2, 4)|((8,9),(6,1)|2|100|explorer pic de Bhanborim");
        assertFalse(quete6.quetePossible(listQueteFaite));
        Quete quete7 = new Quete("1|(2, 4)|((8,9),)|2|100|explorer pic de Bhanborim");
        assertFalse(quete7.quetePossible(listQueteFaite));
        Quete quete8 = new Quete("1|(2, 4)|((8,9),(6,7))|2|100|explorer pic de Bhanborim");
        assertFalse(quete8.quetePossible(listQueteFaite));
    }
}