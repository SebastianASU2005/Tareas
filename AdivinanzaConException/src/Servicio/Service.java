/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.Scanner;

/**
 *
 * @author astud
 */
public class Service {
  public int ValidarNumero(int contador) throws Exception{
      int num=0;
      try {
          Scanner leer=new Scanner(System.in);
          System.out.println("Ingrese un numero");
          num=leer.nextInt();
          return num;
      } catch (Exception e) {
          System.out.println("Ingresar numero enteros, por intento invalido numero por defecto sera 0 ");
          
          return num;
      }
  
      
      
  }
}
