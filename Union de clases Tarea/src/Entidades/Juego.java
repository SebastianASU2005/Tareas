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
public class Juego {
    private PistolaDeAgua agua;
    private ArrayList<Jugador> jugadores;

    public PistolaDeAgua getAgua() {
        return agua;
    }

    public void setAgua(PistolaDeAgua agua) {
        this.agua = agua;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Juego(PistolaDeAgua agua, ArrayList<Jugador> jugadores) {
        this.agua = agua;
        this.jugadores = jugadores;
        
    }

    public Juego() {
        this.jugadores=new ArrayList();
    }
}
