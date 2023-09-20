/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author astud
 */
public class Polideportivo extends Edificio{
    private String nombre;
    private boolean techado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    public Polideportivo(String nombre, boolean techado, double largo, double ancho, double alto) {
        super(largo, ancho, alto);
        this.nombre = nombre;
        this.techado = techado;
    }

    public Polideportivo() {
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del edificio es igual a: " +this.largo*this.ancho);
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del edificio es igual a: "+this.largo*this.ancho*this.alto);
    }
}
