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
public class Televisor extends Electrodomestico {

    protected int resolucion;
    protected boolean tdt;

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public Televisor(int resolucion, boolean tdt, Integer precio, String color, char Energia, Integer peso) {
        super(precio, color, Energia, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Televisor() {
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la resolusion del televisor");
        this.resolucion = leer.nextInt();
        System.out.println("Su televisor tiene antena");
        String res = leer.next();
        if (res.equalsIgnoreCase("si")) {
            this.tdt = true;
}

}
    @Override
    public int PrecioFinal(){
     int precio= super.PrecioFinal();
        if (this.resolucion>40) {
           precio+=500; 
        }
     return precio;
    }
}
