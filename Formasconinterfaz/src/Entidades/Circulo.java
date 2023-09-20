/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author astud
 */
public class Circulo implements calculosFormas {

    public double radio;
    public double diametro;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo() {
    }
    @Override
    public void calcularArea(){
        System.out.println("El area del circulo es igual a: "+PI*this.radio*this.radio);
    }
    @Override
    public void calcularPerimetro(){
        System.out.println("El perimetro del circulo es igual a: "+PI*this.diametro);
    }
}
