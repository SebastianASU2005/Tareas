/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author astud
 */
public final class Residencias extends Extrahotelero{
  protected int habitaciones; 
  protected boolean descuentosGrem;
  protected boolean campoDeportivo;

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isDescuentosGrem() {
        return descuentosGrem;
    }

    public void setDescuentosGrem(boolean descuentosGrem) {
        this.descuentosGrem = descuentosGrem;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    public Residencias(int habitaciones, boolean descuentosGrem, boolean campoDeportivo, boolean privado, double metros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros, nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.descuentosGrem = descuentosGrem;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencias() {
    }
}
