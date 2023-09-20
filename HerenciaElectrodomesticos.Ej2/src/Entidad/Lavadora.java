/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author astud
 */
public class Lavadora extends Electrodomestico{
    private double carga;

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public Lavadora() {
    }

    public Lavadora(double carga, Integer precio, String color, char Energia, Integer peso) {
        super(precio, color, Energia, peso);
        this.carga = carga;
    }
   public void crearLavadora() {
        super.crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la carga de la Lavadora");
        this.carga = leer.nextDouble();
        

}
    @Override
    public int PrecioFinal(){
     int precio= super.PrecioFinal();
        if (this.carga>30) {
           precio+=500; 
        }
     return precio;
    }

    
}
