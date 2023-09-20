/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author astud
 */
public class Cartas {
    private int num;
    private String palo;

    @Override
    public String toString() {
        return "Carta " +"num=" + num + ", palo=" + palo ;
    }

    public Cartas(int num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public Cartas() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
}
