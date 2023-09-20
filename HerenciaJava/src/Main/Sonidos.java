/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Oveja;
import Entidades.Perro;

import java.util.ArrayList;


/**
 *
 * @author astud
 */
public class Sonidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Oveja a=new Oveja();
       Animal b=new Perro();
       Animal c=new Gato();
     ArrayList<Animal> animales=new ArrayList();
    
     animales.add(b);
     animales.add(c);
        for (Animal animale : animales) {
            animale.HacerRuido();
        }
        a.medo();
    }
    
}
