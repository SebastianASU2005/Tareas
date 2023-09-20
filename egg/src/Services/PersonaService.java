/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author astud
 */
public class PersonaService {
    Scanner leer=new Scanner(System.in);
    public Persona crearPersona(){
        String nombre;
        System.out.println("Ingrese el nombre de la persona");
        nombre=leer.next();
        System.out.println("Ingrese el dia de nacimiento");
        int dia;
        dia=leer.nextInt();
        int mes;
        System.out.println("Ingrese el numero de mes de nacimiento");
        mes=leer.nextInt()-1;
        int año;
        System.out.println("Ingrese el año de nacimiento");
        año=leer.nextInt()-1900;
        Date Nacimiento=new Date(año,mes,dia);
        
    return new Persona(nombre,Nacimiento);
    }
    public void calcularEdad(Persona Persona){
     Date nacimiento=Persona.getFechaNacimiento();
     Date FechaActual=new Date();
     long naci=nacimiento.getTime();
     long actu=FechaActual.getTime();
     long dif =actu-naci;
        System.out.println("La edad de la persona es: "+dif/31536000000l);
    }
    public boolean MenorQue(Persona Persona){
         Date nacimiento=Persona.getFechaNacimiento();
     Date FechaActual=new Date();
     long naci=nacimiento.getTime();
     long actu=FechaActual.getTime();
     long dif =actu-naci;
     boolean menor;
        System.out.println("Ingrese una edad");
        int edad=leer.nextInt();
        menor = dif/31536000000l>edad;
        return menor;
    }
}
