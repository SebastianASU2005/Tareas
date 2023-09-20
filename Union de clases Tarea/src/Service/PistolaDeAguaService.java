/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.PistolaDeAgua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author astud
 */
public class PistolaDeAguaService {

    public void llenarPistola(PistolaDeAgua agua) {
        agua.setBalaPoci((int) (Math.random() * 6));
        agua.setPosicionActual((int) (Math.random() * 6));
    }
    Scanner leer = new Scanner(System.in);

    public boolean mojar(PistolaDeAgua agua) {
        boolean a = false;
        if (agua.getBalaPoci() == agua.getPosicionActual()) {
            a = true;
        }
        return a;
    }

    public void siguiente(PistolaDeAgua agua) {
        if (agua.getPosicionActual() < 5) {
            agua.setPosicionActual(agua.getPosicionActual() + 1);
        } else {
            agua.setPosicionActual(0);
        }
    }

    public Jugador CrearJugador() {
        //ArrayList<Jugador> players=new ArrayList();
        System.out.println("Ingrese el nombre del jugador");
        String nombre = leer.next();
        System.out.println("Ingrese la pocision del jugador");
        System.out.println("Ejemplo: (nombre del jugador) 1 ");
        int id = leer.nextInt();
        boolean mojado = false;
        Jugador a=new Jugador(nombre, id,mojado);
        //players.add(a);
        return a;
    }

    public boolean Disparo(PistolaDeAgua agua, Jugador jugado) {
        System.out.println("El jugador " + (jugado.getNombre())+""+"P"+jugado.getID()+" va disparar");
        boolean dispa=false;
        siguiente(agua);
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException ex) {
            System.out.println("Hola");
        }
        if (mojar(agua)) {
            System.out.println("¡DISPARO!");
            jugado.setMojado(true);
            dispa=true;
        } else {
            System.out.println("Click, ningun disparo se efectuo");
        }
return dispa;
    }
    public void ronda(Juego juga,PistolaDeAgua agua,int cant){
       int i=0;
       Jugador jug=null;
       boolean valido=false;
        do {
            if (i==cant) {
                i=1;
            }else
                i=i+1;
            for (Jugador fre:juga.getJugadores()) {
               valido=Disparo(agua,fre);
            jug=fre;   
            }
            
        } while(!valido);
        System.out.println("El perdedor fue "+jug);
    }
}

 