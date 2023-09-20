/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author astud
 */
public class Baraja {
    private ArrayList<Cartas> cartas;

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas ;
    }

    public ArrayList<Cartas> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Cartas> cartas) {
        this.cartas = cartas;
    }

    public Baraja(ArrayList<Cartas> cartas) {
        this.cartas = cartas;
    }

    public Baraja() {
        this.cartas=new ArrayList();
    }
    
}
