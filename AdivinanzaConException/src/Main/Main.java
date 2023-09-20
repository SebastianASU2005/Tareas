/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Servicio.Service;
import java.util.Scanner;

/**
 *
 * @author astud
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bandera = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Juguemos a adivina el numero entre el 1 y el 500");
        int azar = (int) (Math.random() * 500);
        int cont = 0;
        int num = 0;
        Service cs=new Service();
        do {

            try {
               num=cs.ValidarNumero(cont);
                if (num == azar) {
                    bandera = true;
                    System.out.println("Bien echo ese era el numero");
                    cont+=1;
                } else if (num > azar) {
                    System.out.println("El numero es menor al que elejiste");
                    cont += 1;
                } else {
                    System.out.println("El numero es mayor al elejido");
                    cont += 1;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (!bandera);
        System.out.println("Intentos para adivinar el numero= " + cont);
    }

}
