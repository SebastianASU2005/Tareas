/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author astud
 */
public class EdificioDeOficinas extends Edificio{
    private int numOficinas;
    private int personasPorOficinas;
    private int pisos;

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getPersonasPorOficinas() {
        return personasPorOficinas;
    }

    public void setPersonasPorOficinas(int personasPorOficinas) {
        this.personasPorOficinas = personasPorOficinas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int personasPorOficinas, int pisos, double largo, double ancho, double alto) {
        super(largo, ancho, alto);
        this.numOficinas = numOficinas;
        this.personasPorOficinas = personasPorOficinas;
        this.pisos = pisos;
    }
    public void cantPersonas(EdificioDeOficinas m1){
        System.out.println("La cantidad de personas por piso del edificio es igual a: "+m1.getPersonasPorOficinas()*m1.getNumOficinas());
        System.out.println("La cantidad de personas en el edificio entero es igual a: "+m1.getPersonasPorOficinas()*m1.getNumOficinas()*m1.getPisos());
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
