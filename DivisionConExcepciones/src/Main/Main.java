/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Service.Service;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author astud
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        try {
            Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero para realizar una divicion");
        int n1=leer.nextInt();
        System.out.println("Ingrese el segundo numero para la division");
        int n2=leer.nextInt();
        Service cs=new Service();
        cs.DivisionNumero("12", "tres");
        } catch (InputMismatchException e) {
            System.out.println("Mal ingreso de los valores");   
        }
    }
}
   
    
    
    

