/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.Personal;
import Entidades.Profesor;
import java.util.ArrayList;

/**
 *
 * @author astud
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Estudiante m1=new Estudiante("Abogacia", "Francisco", "Hernandez", 5366124, "Soltero");
       Estudiante m2=new Estudiante("Medicina", "Paula", "Rios", 3425123, "Soltera");
       Profesor m3=new Profesor("Quimica", 2012, 23, "Luis", "Gonzalo", 6545371, "Casado");
       Profesor m4=new Profesor("Matematica", 2017, 53, "Gonzalo", "Gesell", 253556, "Soltero");
       Personal m5=new Personal("Bibloteca", 2015, 78, "Juan","Alameda", 534213, "Casado");
       Personal m6=new Personal("Baños", 2015, 56, "Ezequiel", "Ochipinti", 4356412, "Soltero");
       ArrayList<Persona> gente=new ArrayList();
       gente.add(m1);
       gente.add(m2);
       gente.add(m3);
       gente.add(m4);
       gente.add(m5);
       gente.add(m6);
        do {
            System.out.println("   Menu   ");
            System.out.println("1_Cambio del estado civil de una persona.");
            System.out.println("2_Reasignación de despacho a un empleado.");
            System.out.println("3_Matriculación de un estudiante en un nuevo curso.");
            System.out.println("Cambio de departamento de un profesor.");
            
        } while (true);
  
       
    }
    
}
