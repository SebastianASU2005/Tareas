/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Perro;
import Entidades.Personas;
import java.util.Scanner;

/**
 *
 * @author astud
 */
public class PerroPersonaService {
    Scanner leer=new Scanner(System.in);
    public void CrearPerro(Perro Perro){
        
        System.out.println("Ingrese el nombre del perro");  
        Perro.setNombre(leer.next());
        System.out.println("Ingrese la raza del perro");
        Perro.setRaza(leer.next());
        System.out.println("Ingrese la edad del perro");
        Perro.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño del perro");
        System.out.println("Grande/Mediano/Chico");
        Perro.setTamaño(leer.next());
    }
    public void CrearPersona(Personas Persona){
        System.out.println("Ingrese el nombre de la persona");
      Persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona");
        Persona.setApellido(leer.next());
        System.out.println("Ingrese la edad de la persona");
        Persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el documento de la persona");
        Persona.setDocumento(leer.nextInt());
    }
}
