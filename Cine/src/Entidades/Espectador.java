/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author astud
 */
public class Espectador {
    private String nombre;
    private int edad;
    private int dinero;
    private boolean but;

    public boolean getBut() {
        return but;
    }

    public void setBut(boolean but) {
        this.but = but;
    }
    

 

    public Espectador(String nombre, int edad, int dinero,boolean but) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.but=but;
     
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

   
    public Espectador() {
    }
}
