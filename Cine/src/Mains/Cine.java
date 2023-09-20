/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mains;

import Entidades.Cines;
import Entidades.Espectador;
import Entidades.Pelicula;
import Service.CineService;
import java.util.Scanner;

/**
 *
 * @author astud
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       Espectador m1=new Espectador();
       Espectador m2=new Espectador();
       Espectador m3=new Espectador();
       Espectador[][] sala=new Espectador[8][6];
       CineService cs=new CineService();
       Cines d1=new Cines();
       Pelicula re=new Pelicula();
       cs.CrearPelicula(re);
        System.out.println("Ingrese el precio del ticket");
        d1.setPrecio(leer.nextInt());
       d1.setPeli(re);
       cs.CrearEspectador(m1);
       cs.CrearEspectador(m2);
       cs.CrearEspectador(m3);
       cs.GenerarSala(m1, sala, d1);
       cs.GenerarSala(m2, sala, d1);
       cs.GenerarSala(m3, sala,d1);
       cs.MostarSala(sala);
       
    }
    
}
