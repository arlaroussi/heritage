/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bts2java;

/**
 *
 * @author rlaroussi
 */
public class MaitreDeConference extends Titulaire {
    
    MaitreDeConference(String nom, String couleur) {
        super(nom, couleur);
    }
    public void setDefaultCouleur(String couleur) {
        this.couleur = "Blue";
    };
}
