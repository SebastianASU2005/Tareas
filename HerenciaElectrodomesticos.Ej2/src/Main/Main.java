/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;


import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author astud
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Lavadora m1=new Lavadora();  
      Lavadora m3=new Lavadora();
      Televisor m2=new Televisor();
      Televisor m4=new Televisor();
      m1.crearLavadora();
      
      m3.crearLavadora();
      m4.crearTelevisor();
      m2.crearTelevisor();
        ArrayList<Electrodomestico> cosas=new ArrayList();
        cosas.add(m1);
        cosas.add(m2);
        cosas.add(m3);
        cosas.add(m4);
        int precioTotalElectrodomesticos = 0;
        int precioTotalLavadoras = 0;
        int precioTotalTelevisores = 0;
        for (Electrodomestico cosa : cosas) {
            int precioFinal = cosa.PrecioFinal();
            precioTotalElectrodomesticos += precioFinal;

            if (cosa instanceof Lavadora) {
                precioTotalLavadoras += precioFinal;
            } else if (cosa instanceof Televisor) {
                precioTotalTelevisores += precioFinal;
            }
        }
        System.out.println("El precio de todos los electrodomesticos es igual a: "+precioTotalElectrodomesticos);
        System.out.println("El precio de las lavadoras es: "+precioTotalLavadoras);
        System.out.println("El precio de los televisores es igual a: "+precioTotalTelevisores);
        }
    }
            
    

