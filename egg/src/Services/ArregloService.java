/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.Arrays;

/**
 *
 * @author astud
 */
public class ArregloService {
    public void InicializarA(double num50[]){
        System.out.println("Arreglo A");
        for (int i = 0; i < 50; i++) {
           num50[i]=(Math.random()*20);
        }
        System.out.println("Inicializacion completada");
    }
    public void Mostrar(double num50[]){
        for (int i = 0; i < 50; i++) {
            System.out.println(num50[i]+",");
        }
    }
    public void Ordenar(double num50[]){
        Arrays.sort(num50);
        System.out.println("Ordenado completado");
    }
    public void InicializarB(double num20[],double num50[]){
        for (int i = 0; i < 20; i++) {
            if (i<=9) {
                num20[i]=num50[i];
            }else
                Arrays.fill(num20, 10,19,0.5);
        }
    }
     public void MostrarB(double num20[]){
         System.out.println("Arreglo B");
        for (int i = 0; i < 20; i++) {
            System.out.println(num20[i]+",");
        }
     }
}
