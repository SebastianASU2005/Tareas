/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author astud
 */
public class Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EdificioDeOficinas m1 = new EdificioDeOficinas(10, 5, 5, 30, 80, 115.5);
        EdificioDeOficinas m2 = new EdificioDeOficinas(20, 3, 9, 30, 50, 200);
        Polideportivo m3 = new Polideportivo("Bernabeu", true, 100, 150, 300);
        Polideportivo m4 = new Polideportivo("Jorgitos", false, 100, 150, 300);
        ArrayList<Edificio> estructuras = new ArrayList();
        estructuras.add(m1);
        estructuras.add(m2);
        estructuras.add(m3);
        estructuras.add(m4);
        int techados=0;
        int noTecho=0;
        for (Edificio estructura : estructuras) {
            if (estructura instanceof Polideportivo) {
                System.out.println("Polideportivo: "+((Polideportivo) estructura).getNombre());
                estructura.calcularSuperficie();
                estructura.calcularVolumen();
                if (((Polideportivo) estructura).isTechado()) {
                    techados+=1;
                }else
                   noTecho+=1; 
            }
            if (estructura instanceof EdificioDeOficinas) {
                System.out.println("Oficinas");
                estructura.calcularSuperficie();
                estructura.calcularVolumen();
                ((EdificioDeOficinas) estructura).cantPersonas((EdificioDeOficinas) estructura);
                
            }
        }
        System.out.println("La cantidad de polideportivos techados es igual a: "+techados);
    }

}
