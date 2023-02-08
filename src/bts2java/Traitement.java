/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bts2java;

import java.util.*;

/**
 *
 * @author rlaroussi
 */
public class Traitement {
    
    public static void main (String argv[]) {


        ArrayList<Etudiant> listeE = new ArrayList<Etudiant>();
        Etudiant etd1 = new Etudiant("Baptiste", 15);
        listeE.add(etd1);
        Etudiant etd2 = new Etudiant("Samia", 17);
        listeE.add(etd2);

        System.out.println("Traitement des étudiants");
        for (Etudiant etd:listeE ) {
            System.out.println(etd.meurt());
        }

        ArrayList<Agrege> listeA = new ArrayList<Agrege>();
        Agrege agreg1 = new Agrege("Dupond", " Bleue");
        listeA.add(agreg1);
        Agrege agreg2 = new Agrege("Privault", " Bleue");
        listeA.add(agreg2);

        System.out.println("Traitement des agrégés");
        for (Agrege ag : listeA) {
            System.out.println(ag.meurt() + " ==> La couleur : "+ ag.getCouleur());
        }

    }
}