/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author astud
 */
public class Jugador {
   private String nombre;
   private int ID;
   private boolean mojado;

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", ID=" + ID + '}';
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Jugador(String nombre, int ID,boolean mojado) {
        this.nombre = nombre;
        this.ID = ID;
        this.mojado= mojado;
    }

    public Jugador() {
    }
}
