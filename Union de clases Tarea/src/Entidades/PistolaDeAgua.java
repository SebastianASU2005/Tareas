/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author astud
 */
public class PistolaDeAgua {
    private int posicionActual;
    private int balaPoci;

    @Override
    public String toString() {
        return "Posicion actual:" + posicionActual + "|| Posicion de la bala:" + balaPoci;
    }

    public PistolaDeAgua(int posicionActual, int balaPoci) {
        this.posicionActual = posicionActual;
        this.balaPoci = balaPoci;
    }

    public PistolaDeAgua() {
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getBalaPoci() {
        return balaPoci;
    }

    public void setBalaPoci(int balaPoci) {
        this.balaPoci = balaPoci;
    }
}
