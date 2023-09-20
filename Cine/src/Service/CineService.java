/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Cines;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.Scanner;

/**
 *
 * @author astud
 */
public class CineService {
 Scanner leer = new Scanner(System.in);
    public void CrearEspectador(Espectador espe) {
        System.out.println("Ingrese el nombre del cliente");
        espe.setNombre(leer.next());
        System.out.println("Ingrese la edad del cliente");
        espe.setEdad(leer.nextInt());
        System.out.println("Ingrese el dinero disponible del cliente");
        espe.setDinero(leer.nextInt());
        espe.setBut(false);

    }
    public void CrearPelicula(Pelicula pe){
        System.out.println("Ingrese el titulo de la pelicula");
        pe.setTitulo(leer.next());
        System.out.println("Ingrese el director de la pelicula");
        pe.setDirector(leer.next());
        System.out.println("Ingrese la duracion de la pelicula");
        pe.setDuracion(leer.nextDouble());
        System.out.println("Ingrese la edad minima para ver la pelicula");
        pe.setEdadMinima(leer.nextInt());
    }

    public void GenerarSala(Espectador espe, Espectador[][] sala, Cines d1) {
       
        int posA =1; //(int) (Math.random() * 7);
        int posB =1; //(int) (Math.random() * 5);
        boolean s=false;
        for (int i = 0; i < 8; i++) {
            
            for (int j = 0; j < 6; j++) {
                switch (j) {
                    case 0:
                        if (posA == i & posB == j) {

                            if (espe.getEdad() >= d1.getPeli().getEdadMinima()) {
                                if (espe.getDinero() >= d1.getPrecio()) {
                                    if (sala[i][j]==null) {
                                        sala[i][j] = espe;
                                        espe.setBut(true);
                                    } else {
                                         do {
                                         posA=(int) (Math.random() * 7);
                                         posB=(int) (Math.random() * 5);       
                                            if (sala[posA][posB]==null) {
                                                sala[posA][posB]=espe;
                                                s=true;
                                            }
                                        } while (!s);
                                      s=false; 
                                    }
                                } else {
                                    System.out.println("El cliente " + espe.getNombre() + " no tiene el dinero suficiente para ver la pelicula");
                                }
                            } else {
                                System.out.println("El cliente " + espe.getNombre() + " no tiene la edad minima para ver la pelicula");
                            }

                        }
                       
                        break;
                    case 1:
                        if (posA == i & posB == j) {

                            if (espe.getEdad() >= d1.getPeli().getEdadMinima()) {
                                if (espe.getDinero() >= d1.getPrecio()) {
                                    if (sala[i][j]==null) {
                                        sala[i][j] = espe;
                                        espe.setBut(true);
                                    } else {
                                        do {
                                         posA=(int) (Math.random() * 7);
                                         posB=(int) (Math.random() * 5);       
                                            if (sala[posA][posB]==null) {
                                                sala[posA][posB]=espe;
                                                s=true;
                                            }
                                        } while (!s);
                                      s=false; 
                                    }
                                } else {
                                    System.out.println("El cliente " + espe.getNombre() + " no tiene el dinero suficiente para ver la pelicula");
                                }
                            } else {
                                System.out.println("El cliente " + espe.getNombre() + " no tiene la edad minima para ver la pelicula");
                            }

                        }
                        
                        break;
                    case 2:
                        if (posA == i & posB == j) {

                            if (espe.getEdad() >= d1.getPeli().getEdadMinima()) {
                                if (espe.getDinero() >= d1.getPrecio()) {
                                    if (sala[i][j]==null) {
                                        sala[i][j] = espe;
                                        espe.setBut(true);
                                    } else {
                                       do {
                                         posA=(int) (Math.random() * 7);
                                         posB=(int) (Math.random() * 5);       
                                            if (sala[posA][posB]==null) {
                                                sala[posA][posB]=espe;
                                                s=true;
                                            }
                                        } while (!s);
                                      s=false; 
                                    }
                                } else {
                                    System.out.println("El cliente " + espe.getNombre() + " no tiene el dinero suficiente para ver la pelicula");
                                }
                            } else {
                                System.out.println("El cliente " + espe.getNombre() + " no tiene la edad minima para ver la pelicula");
                            }

                        }
                       
                        break;
                    case 3:
                        if (posA == i & posB == j) {

                            if (espe.getEdad() >= d1.getPeli().getEdadMinima()) {
                                if (espe.getDinero() >= d1.getPrecio()) {
                                    if (sala[i][j]==null) {
                                        sala[i][j] = espe;
                                        espe.setBut(true);
                                    } else {
                                        do {
                                         posA=(int) (Math.random() * 7);
                                         posB=(int) (Math.random() * 5);       
                                            if (sala[posA][posB]==null) {
                                                sala[posA][posB]=espe;
                                                s=true;
                                            }
                                        } while (!s);
                                      s=false; 
                                    }
                                } else {
                                    System.out.println("El cliente " + espe.getNombre() + " no tiene el dinero suficiente para ver la pelicula");
                                }
                            } else {
                                System.out.println("El cliente " + espe.getNombre() + " no tiene la edad minima para ver la pelicula");
                            }

                        }
                      
                        break;
                    case 4:
                       if (posA == i & posB == j) {

                            if (espe.getEdad() >= d1.getPeli().getEdadMinima()) {
                                if (espe.getDinero() >= d1.getPrecio()) {
                                    if (sala[i][j]==null) {
                                        sala[i][j] = espe;
                                        espe.setBut(true);
                                    } else {
                                         do {
                                         posA=(int) (Math.random() * 7);
                                         posB=(int) (Math.random() * 5);       
                                            if (sala[posA][posB]==null) {
                                                sala[posA][posB]=espe;
                                                s=true;
                                            }
                                        } while (!s);
                                      s=false; 
                                    }
                                } else {
                                    System.out.println("El cliente " + espe.getNombre() + " no tiene el dinero suficiente para ver la pelicula");
                                }
                            } else {
                                System.out.println("El cliente " + espe.getNombre() + " no tiene la edad minima para ver la pelicula");
                            }

                        }
                       
                        break;
                    case 5:
                      if (posA == i & posB == j) {

                            if (espe.getEdad() >= d1.getPeli().getEdadMinima()) {
                                if (espe.getDinero() >= d1.getPrecio()) {
                                    if (sala[i][j]==null) {
                                        sala[i][j] = espe;
                                        espe.setBut(true);
                                    } else {
                                        do {
                                         posA=(int) (Math.random() * 7);
                                         posB=(int) (Math.random() * 5);       
                                            if (sala[posA][posB]==null) {
                                                sala[posA][posB]=espe;
                                                s=true;
                                            }
                                        } while (!s);
                                      s=false; 
                                    }
                                } else {
                                    System.out.println("El cliente " + espe.getNombre() + " no tiene el dinero suficiente para ver la pelicula");
                                }
                            } else {
                                System.out.println("El cliente " + espe.getNombre() + " no tiene la edad minima para ver la pelicula");
                            }

                        }
                        
                        break;
                    case 6:
                       if (posA == i & posB == j) {

                            if (espe.getEdad() >= d1.getPeli().getEdadMinima()) {
                                if (espe.getDinero() >= d1.getPrecio()) {
                                    if (sala[i][j]==null) {
                                        sala[i][j] = espe;
                                        espe.setBut(true);
                                    } else {
                                        do {
                                         posA=(int) (Math.random() * 7);
                                         posB=(int) (Math.random() * 5);       
                                            if (sala[posA][posB]==null) {
                                                sala[posA][posB]=espe;
                                                s=true;
                                            }
                                        } while (!s);
                                      s=false;  
                                    }
                                } else {
                                    System.out.println("El cliente " + espe.getNombre() + " no tiene el dinero suficiente para ver la pelicula");
                                }
                            } else {
                                System.out.println("El cliente " + espe.getNombre() + " no tiene la edad minima para ver la pelicula");
                            }

                        }
                        
                        break;
                }
            }
            
        }
    }
    public void MostarSala(Espectador[][] sala){
        int h=8;
        for (int i = 0; i < 8; i++) {
            System.out.println("Fila: "+h);
            for (int j = 0; j < 6; j++) {
             switch(j){
                 case 0:
                     System.out.print("A");
                     if (sala[i][j]!=null) {
                         System.out.print(" X "); 
                     }else
                         System.out.print("   ");
                     break;
                     case 1:
                     System.out.print("B");
                     if (sala[i][j]!=null) {
                         System.out.print(" X "); 
                     }else
                         System.out.print("   ");
                     break;
                     case 2:
                     System.out.print("C");
                     if (sala[i][j]!=null) {
                         System.out.print(" X "); 
                     }else
                         System.out.print("   ");
                     break;
                     case 3:
                     System.out.print("D");
                     if (sala[i][j]!=null) {
                         System.out.print(" X "); 
                     }else
                         System.out.print("   ");
                     break;
                     case 4:
                     System.out.print("E");
                     if (sala[i][j]!=null) {
                         System.out.print(" X "); 
                     }else
                         System.out.print("   ");
                     break;
                     case 5:
                     System.out.print("F");
                     if (sala[i][j]!=null) {
                         System.out.print(" X "); 
                     }else
                         System.out.print("   ");
                     break;
             }   
            }
            h=h-1;
            System.out.println(" "); 
        }
    }
}
