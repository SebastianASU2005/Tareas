/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mains;

import Entidades.Baraja;
import Entidades.Cartas;
import Services.BarajasService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author astud
 */
public class BarajaGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarajasService cs=new BarajasService();
        ArrayList<Cartas> gay=new ArrayList();
        Baraja m1=new Baraja();
        cs.CrearCartas(m1);
        System.out.println(m1);
        cs.Barajado(m1);
        System.out.println(m1);
        cs.SiguienteCarta(m1,gay);
        System.out.println(m1);
        cs.MostrarCartas(m1);
        cs.DarCartas(m1, gay);
        cs.MostrarCartas(m1);
        cs.Monton(gay);
        cs.MostrarBaraja(m1);
    }
    
}
