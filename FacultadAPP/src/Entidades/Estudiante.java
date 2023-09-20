/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author astud
 */
public class Estudiante extends Persona{
private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellido, long documento, String estadoCivil) {
        super(nombre, apellido, documento, estadoCivil);
        this.curso = curso;
    }
}
