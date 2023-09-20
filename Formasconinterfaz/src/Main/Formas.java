/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author astud
 */
public class Formas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo m1=new Rectangulo(12.5, 9.85);
        Circulo m2=new Circulo(15, 8.9);
        m1.calcularArea();
        m1.calcularPerimetro();
        m2.calcularArea();
        m2.calcularPerimetro();
    }
    
}
