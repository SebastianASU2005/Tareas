/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author astud
 */
public class Hotel4 extends Hotel {

    protected char gimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Hotel4() {
    }

    public Hotel4(char gimnasio, String nombreRestaurante, int capacidadRestaurante, int habitaciones, int camas, int pisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public void calcularPrecios() {
        this.precioHabitacion = super.calcularPrecio();
        //Logica para el tipo de gimnasio
        if (this.gimnasio == 'A') {
            this.precioHabitacion += 50;
        } else {
            this.precioHabitacion += 30;
        }
        //Logica de la capacidad del restaurante 
        if (this.capacidadRestaurante < 30) {
            this.precioHabitacion += 10;
        } else if (this.capacidadRestaurante >= 30 && this.capacidadRestaurante <= 50) {
            this.precioHabitacion += 30;    
        }else
            this.precioHabitacion+=50;
        
    }
}
