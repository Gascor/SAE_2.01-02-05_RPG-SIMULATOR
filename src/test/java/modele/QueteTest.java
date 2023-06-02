package modele;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

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
}