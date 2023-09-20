/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author astud
 */
public final class Hotel5 extends Hotel4{
    private int salonesDeConferencias;
    private int suites;
    private int cantLimosinas;

    public int getSalonesDeConferencias() {
        return salonesDeConferencias;
    }

    public void setSalonesDeConferencias(int salonesDeConferencias) {
        this.salonesDeConferencias = salonesDeConferencias;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5(int salonesDeConferencias, int suites, int cantLimosinas, char gimnasio, String nombreRestaurante, int capacidadRestaurante, int habitaciones, int camas, int pisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, habitaciones, camas, pisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.salonesDeConferencias = salonesDeConferencias;
        this.suites = suites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5() {
    }
    public void calcularPreci(){
     this.precioHabitacion+=(this.camas*this.habitaciones+(this.salonesDeConferencias+this.suites))*this.pisos;
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
        this.precioHabitacion+=15*this.cantLimosinas;
    }
    
}
