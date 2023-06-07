package modele;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class ClassementTest {
    @Test @Order(1)
    public void ajout(){
        System.out.println("Test de la méthode ajout()");
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
    @Test @Order(1)
    public void afficherClassement(){
        System.out.println("Test de la méthode afficherClassement() VERSION 2.0");
        Scenario scenario = new Scenario("test1");
        Quete quete1 = new Quete("1|(2, 2)|()|10|100|explorer pic de Bhanborim");
        scenario.ajout(quete1);
        Parcours parcours1 = new Parcours(scenario,10,20,0,"duree",new LinkedHashMap<>(),new TreeSet<Quete>(),new HashSet<Quete>());
        Parcours parcours2 = new Parcours(scenario,10,25,0,"duree",new LinkedHashMap<>(),new TreeSet<Quete>(),new HashSet<Quete>());
        Classement.ajout(parcours2);
        Classement.ajout(parcours1);
        System.out.println("Doit afficher ci dessous le parcours d'une durée de 20");
        try{
            Classement.afficherClassement(1,1);
        } catch (ClassementException e){
            System.out.println(e.getCodeErreur());
        }
        Parcours parcours3 = new Parcours(scenario,10,20,0,"duree",new LinkedHashMap<>(),new TreeSet<Quete>(),new HashSet<Quete>());
        Classement.ajout(parcours3);
        Parcours parcours4 = new Parcours(scenario,10,25,0,"duree",new LinkedHashMap<>(),new TreeSet<Quete>(),new HashSet<Quete>());
        Classement.ajout(parcours4);
        System.out.println("Doit afficher ci dessous les 2 parcours d'une durée de 20");
        try{
            Classement.afficherClassement(2,1);
        } catch (ClassementException e){
            System.out.println(e.getCodeErreur());
        }
        System.out.println("Doit afficher ci dessous le parcours d'une durée de 25");
        try{
            Classement.afficherClassement(1,2);
        } catch (ClassementException e){
            System.out.println(e.getCodeErreur());
        }
        System.out.println("Doit afficher ci dessous les 2 parcours d'une durée de 25");
        try{
            Classement.afficherClassement(2,2);
        } catch (ClassementException e){
            System.out.println(e.getCodeErreur());
        }
        System.out.println("Doit afficher tout les parcours dans l'ordre décroissant et dois provoquer une exception");
        try{
            Classement.afficherClassement(50,2);
        } catch (ClassementException e){
            System.out.println(e.getCodeErreur());
        }
    }
    @Test
    void regulationParcours() {
        Scenario s1 = LectureFichierTexte.lecture(new File("scenario"+File.separator+"scenario_0" +
                ".txt"));
        Parcours p1 = new Parcours(s1,0,8,0,"duree",new LinkedHashMap<>(),new TreeSet<>(),new HashSet<>());
        Parcours p2 = new Parcours(s1,0,15,0,"duree",new LinkedHashMap<>(),new TreeSet<>(),new HashSet<>());
        Classement.ajout(p1);
        Classement.regulationParcours(2,p2,2);
        ArrayList<Parcours> soluce1 = new ArrayList<>();
        soluce1.add(p1);
        soluce1.add(p2);
        ArrayList<Parcours> sObtenu = new ArrayList<>();
        sObtenu.add(Classement.getChTreeParcours().get(8).get(0));
        sObtenu.add(Classement.getChTreeParcours().get(15).get(0));
        assertEquals(soluce1,sObtenu);
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Classement.ajout(p2);
        Classement.regulationParcours(1,p1,1);
        ArrayList<Parcours> soluce2 = new ArrayList<>();
        soluce2.add(p1);
        assertEquals(soluce2,Classement.getChTreeParcours().get(8));
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Classement.ajout(p1);
        Classement.regulationParcours(1,p2,1);
        ArrayList<Parcours> soluce3 = new ArrayList<>();
        soluce3.add(p1);
        assertEquals(soluce3,Classement.getChTreeParcours().get(8));
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Classement.ajout(p2);
        Classement.regulationParcours(1,p1,2);
        ArrayList<Parcours> soluce4 = new ArrayList<>();
        soluce4.add(p2);
        assertEquals(soluce4,Classement.getChTreeParcours().get(15));
        Classement.getChTreeParcours().clear();
        Classement.setChNbSolutionsTotales(0);
        Classement.ajout(p1);
        Classement.regulationParcours(1,p2,2);
        ArrayList<Parcours> soluce5 = new ArrayList<>();
        soluce5.add(p2);
        assertEquals(soluce4,Classement.getChTreeParcours().get(15));

    }
}