/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entidades.Baraja;
import Entidades.Cartas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author astud
 */
public class BarajasService {

    public void CrearCartas(Baraja cart) {
        for (int i = 1; i < 13; i++) {
            if (i < 8 || i > 9) {
                Cartas a = new Cartas(i, "Espada");
                cart.getCartas().add(a);
            }
        }
        for (int i = 1; i < 13; i++) {
            if (i < 8 || i > 9) {
                Cartas a = new Cartas(i, "Basto");
                cart.getCartas().add(a);
            }
        }
        for (int i = 1; i < 13; i++) {
            if (i < 8 || i > 9) {
                Cartas a = new Cartas(i, "Oro");
                cart.getCartas().add(a);
            }
        }
        for (int i = 1; i < 13; i++) {
            if (i < 8 || i > 9) {
                Cartas a = new Cartas(i, "Copa");
                cart.getCartas().add(a);
            }
        }

    }

    public void Barajado(Baraja bar) {
        Collections.shuffle(bar.getCartas());
    }

    public void SiguienteCarta(Baraja bar,ArrayList<Cartas> gay) {
        Iterator it = bar.getCartas().iterator();

        if (it.hasNext()) {
            gay.add((Cartas) it.next());
            System.out.println("La siguiente carta es: " + it.next());
            it.remove();
        } else {
            System.out.println("Lo sentimos ya no hay carta siguiente");
        }
        System.out.println("Operacion completada");

    }

    public void MostrarCartas(Baraja bar) {
        System.out.println("La cantidad de cartas restantes es igaul a: " + bar.getCartas().size());
    }

    public void DarCartas(Baraja bar,ArrayList<Cartas> gay) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantas cartas desea retirar");
        int cant = leer.nextInt();
        Iterator it = bar.getCartas().iterator();
        if (cant > bar.getCartas().size()) {
           
               System.out.println("Pelotudo no hay cartas suficientes");
                     
            }else{
              
               for (int i = 0; i < cant; i++) {
                if (it.hasNext()) {
                    gay.add((Cartas) it.next());
                    System.out.println("La siguiente carta es: " + it.next());
                    it.remove();}
                         }
                 }
        System.out.println("Operacion finalizada");
    }
    public void Monton(ArrayList<Cartas> gay){
        if (gay.size()==0) {
            System.out.println("No ha salido ninguna carta");
        }else{
            System.out.println("Las cartas fuera del maso son: "+gay.size());
            for (Cartas ger:gay) {
                System.out.print(ger); 
            }
        }
    }
    public void MostrarBaraja(Baraja bar){
        System.out.println("");
        System.out.println("Fin del boludeo");
        System.out.println("El maso quedo con: "+bar.getCartas().size());
    }
}
