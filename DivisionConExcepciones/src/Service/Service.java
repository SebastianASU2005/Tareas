/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author astud
 */
public class Service {
  public void DivisionNumero(String n1,String n2) throws Exception{
      try {
          int n3=Integer.parseInt(n1);
          System.out.println(n3);
          int n4=Integer.parseInt(n2);
          System.out.println(n2);
          double divicion=n3/n4;
          System.out.println(divicion);
          
      } catch (NumberFormatException e) {
          System.out.println("No se pudo realizar la divicion, ya que la informacion ingresada no puede pasarse a un sistema contable");
      }catch(ArithmeticException e){
          System.out.println("No se puede dividir por 0");
      }
      
  }  
}
