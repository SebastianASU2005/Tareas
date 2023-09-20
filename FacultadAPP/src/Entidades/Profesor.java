/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author astud
 */
public class Profesor extends Persona{
 private String departamento;   
 private int año;
private int despacho;

    public Profesor() {
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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

    public Profesor(String departamento, int año, int despacho, String nombre, String apellido, long documento, String estadoCivil) {
        super(nombre, apellido, documento, estadoCivil);
        this.departamento = departamento;
        this.año = año;
        this.despacho = despacho;
    }


    
}
