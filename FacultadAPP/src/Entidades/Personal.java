/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author astud
 */
public class Personal extends Persona{
private int año;
private int despacho;
private String seccion;

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    public Personal(String seccion,int año, int despacho, String nombre, String apellido, long documento, String estadoCivil) {
        super(nombre, apellido, documento, estadoCivil);
        this.año = año;
        this.despacho = despacho;
        this.seccion=seccion;
    }

    public Personal() {
    }
}
