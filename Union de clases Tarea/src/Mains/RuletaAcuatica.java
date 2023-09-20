/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mains;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.PistolaDeAgua;
import Service.PistolaDeAguaService;
import java.util.Scanner;

/**
 *
 * @author astud
 */
public class RuletaAcuatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PistolaDeAgua m1=new PistolaDeAgua();
       PistolaDeAguaService cs=new PistolaDeAguaService ();
       Juego c1=new Juego();
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese cuantas personas van a jugar");
        int cant=leer.nextInt();
       
        for (int i = 0; i < cant; i++) {
          c1.getJugadores().add(cs.CrearJugador());  
        }
        c1.setAgua(m1);
        System.out.println("Cargando la bala");
        cs.llenarPistola(m1);
        System.out.println("Listo empezemos");
        cs.ronda(c1, m1, cant);
        
    }
    
}
