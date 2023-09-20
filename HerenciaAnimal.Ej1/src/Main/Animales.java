/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author astud
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1=new Perro("Tedy","Croquetas",10, "Beagle");
        perro1.alimento();
        Animal perro2=new Perro("Ted","Croquetas",4,"Pug");
        perro2.alimento();
        Animal gato=new Gato("Michi", "Atun", 10,"Siames");
        gato.alimento();
        Animal caballo=new Caballo("Jose", "Pasto",15, "Fino");
        caballo.alimento();
    }
    
}
