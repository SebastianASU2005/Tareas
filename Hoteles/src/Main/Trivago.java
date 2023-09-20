/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidades.Alojamiento;
import Entidades.Campings;
import Entidades.Hotel;
import Entidades.Hotel4;
import Entidades.Hotel5;
import Entidades.Residencias;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author astud
 */
public class Trivago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Hotel4 m1 = new Hotel4('A', "Quijote", 30, 40, 2, 3, 100, "Canto", "R17C21", "Argentina", "Pablo");
        Hotel4 m2 = new Hotel4('B', "Pudrio", 15, 20, 4, 5, 230, "Gabo", "R65C23", "Argentina", "German");
        Hotel5 m3 = new Hotel5(4, 6, 10, 'A', "Jose", 80, 80, 4, 10, 1500, "Deluxe", "R453C32", "Argetina", "Gustavo");
        Hotel5 m4 = new Hotel5(2, 4, 2, 'A', "Timon", 50, 60, 4, 12, 1345, "Flex", "R453C32", "Argetina", "Luis");
        Campings m5 = new Campings(30, 10, true, false, 300, "Descampado", "RioGallego", "Argentina", "Juan");
        Campings m6 = new Campings(20, 5, false, true, 150, "Vida Silvestre", "R435C4536", "Argentina", "Matias");
        Residencias m7 = new Residencias(15, true, true, false, 250, "Hotelero", "R435C234", "Argentina", "Facundo");
        ArrayList<Alojamiento> aloja = new ArrayList();
        aloja.add(m1);
        aloja.add(m2);
        aloja.add(m3);
        aloja.add(m4);
        aloja.add(m5);
        aloja.add(m6);
        aloja.add(m7);
        int eleccion;
        do {
            System.out.println("   Menu    ");
            System.out.println("1_Mostrar todos los alojamientos");
            System.out.println("2_Mostrar todos los hoteles del mas caro al mas barato");
            System.out.println("3_Mostrar todos los camping con restaurante");
            System.out.println("4_Mostrar todas las recidencias que tengan descuentos");
            System.out.println("5_Salir");
            System.out.println("Ingrese el numero de la opcion que desea ver");
            eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    for (Alojamiento alojamiento : aloja) {
                        if (alojamiento instanceof Hotel5) {
                            System.out.println(alojamiento.getNombre() + " Hotel 5 estrellas");
                            continue;
                        }
                        if (alojamiento instanceof Hotel4) {
                            System.out.println(alojamiento.getNombre() + " Hotel 4 estrellas");
                            continue;
                        }
                        if (alojamiento instanceof Campings) {
                            System.out.println(alojamiento.getNombre() + " Camping");
                            continue;
                        }
                        if (alojamiento instanceof Residencias) {
                            System.out.println(alojamiento.getNombre() + " Residencias");
                            continue;
                        }
                    }
                    break;
                case 2:
                    ArrayList<Hotel> hoteles = new ArrayList<>();
                    for (Alojamiento alojamiento : aloja) {
                        if (alojamiento instanceof Hotel5) {
                            Hotel5 hotel5 = (Hotel5) alojamiento;
                            hotel5.calcularPreci();
                            hoteles.add((Hotel) alojamiento);
                            continue;
                        }
                        if (alojamiento instanceof Hotel4) {
                            Hotel4 hotel4 = (Hotel4) alojamiento;
                            hotel4.calcularPrecios();
                            hoteles.add((Hotel) alojamiento);
                            continue;
                        }
                    }

                    // Ordenar hoteles por precio de habitación de mayor a menor
                    Collections.sort(hoteles, new Comparator<Hotel>() {
                        @Override
                        public int compare(Hotel h1, Hotel h2) {
                            return Double.compare(h2.getPrecioHabitacion(), h1.getPrecioHabitacion());
                        }
                    });

                    // Imprimir los hoteles ordenados
                    System.out.println("Hoteles ordenados por precio de habitación de mayor a menor:");
                    for (Hotel hotel : hoteles) {
                        System.out.println(hotel.getNombre() + " - Precio: " + hotel.getPrecioHabitacion());
                    }
                    break;
                case 3:
                    System.out.println("Campings con restaurantes ");
                    for (Alojamiento alojamiento : aloja) {
                        if (alojamiento instanceof Campings) {
                            if (((Campings) alojamiento).isRestaurante()) {
                                System.out.println(alojamiento.getNombre());   
                            }
                            
                        }
 
                    }
                    break;
                case 4:
                    System.out.println("Residencias con descuentos");
                    for (Alojamiento alojamiento : aloja) {
                        if (alojamiento instanceof Residencias) {
                            if (((Residencias) alojamiento).isDescuentosGrem()) {
                                System.out.println(alojamiento.getNombre());  
                            }
                            
                        }
                    }
                    break;
                case 5:
                    System.out.println("Muchas gracias por usar el programa");
                    break;
            }
        } while (eleccion != 5);

    }

}
