/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author astud
 */
public class Rectangulo implements calculosFormas{
 public double base;
 public double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }


    @Override
    public void calcularArea(){
        System.out.println("El area del rectangulo es igual a: "+this.base*this.altura);  
    }
    @Override
    public void calcularPerimetro(){
        System.out.println("El perimetro del rectangulo es igual a: "+(this.base+this.altura)*2); 
    }
}
