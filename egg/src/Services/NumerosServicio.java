/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.ParDeNumeros;
import static java.lang.Math.abs;

/**
 *
 * @author astud
 */
public class NumerosServicio {
    public void MostrarValores(ParDeNumeros ParDeNumeros){
        System.out.println("El primer numero es "+ParDeNumeros.getNum1());
        System.out.println("El segundo numero es "+ParDeNumeros.getNum2());
    }
    public void RetornarMayor(ParDeNumeros ParDeNumeros){
        if (ParDeNumeros.getNum1()>ParDeNumeros.getNum2()) {
            System.out.println("El numero mas grande es: "+ParDeNumeros.getNum1());
        }else   
            if (ParDeNumeros.getNum2()>ParDeNumeros.getNum1()) {
                System.out.println("El numero mas grande es: "+ParDeNumeros.getNum2());
            }else
                System.out.println("Los 2 numero son iguales");
    }
    public void Potencia(ParDeNumeros ParDeNumeros){
        if (ParDeNumeros.getNum1()>ParDeNumeros.getNum2()) {
            System.out.println(Math.pow(Math.round(ParDeNumeros.getNum1()),Math.round(ParDeNumeros.getNum2())));
        }else   
            if (ParDeNumeros.getNum2()>ParDeNumeros.getNum1()) {
                System.out.println(Math.pow(Math.round(ParDeNumeros.getNum2()),Math.round(ParDeNumeros.getNum1())));
            }else
                System.out.println(Math.pow(Math.round(ParDeNumeros.getNum2()),Math.round(ParDeNumeros.getNum1())));
    }
    public void CalcularRaiz(ParDeNumeros ParDeNumeros){
        System.out.println(Math.sqrt(Math.min(Math.abs(ParDeNumeros.getNum1()),Math.abs(ParDeNumeros.getNum2()))));
    }
}
