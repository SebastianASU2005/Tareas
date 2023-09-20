/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author astud
 */
public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private final String[] alumnos=new String[5];

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public Curso() {
    }
    Scanner leer=new Scanner(System.in);
    public void cargarAlumnos(){
        String nombre;
        System.out.println("A continuacion ingrese los nombres de los 5 alumnos");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno numero: "+(i+1));
            nombre=leer.next();
            alumnos[i]=nombre;
        }
    }
    public void crearCurso(){
        System.out.println("Nombre del curso:"); 
        nombreCurso=leer.next();
        System.out.println("Ingrese el turno del curso (Mañana o Tarde)");
        turno=leer.next();
        System.out.println("Ingrese la cantidad de horas de cursado por dia");
        cantidadHorasPorDia=leer.nextInt();
        System.out.println("Ingrese la cantidad de dias de cursado");
        cantidadDiasPorSemana=leer.nextInt();
        System.out.println("Ingrese el precio por hora");
        precioPorHora=leer.nextInt();
        //cargarAlumnos();
    }
    public void calcularGanancias(){
        double dias;
        dias=cantidadHorasPorDia*cantidadDiasPorSemana;
        dias=dias*precioPorHora;
        dias=dias*5;
        dias=dias*cantidadDiasPorSemana;
        System.out.println("Las ganancias del curso serian: "+dias);
    }
}
