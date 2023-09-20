/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mains;

import Entidades.Perro;
import Entidades.Personas;
import Service.PerroPersonaService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author astud
 */
public class PersonaPerro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String res;
        Perro perro;
        boolean ready=false;
        Scanner leer=new Scanner(System.in);
       Personas m1=new Personas();
       Personas m2=new Personas();
       Personas m3=new Personas();
       Perro p1=new Perro();
       Perro p2=new Perro();
       Perro p3=new Perro();
       PerroPersonaService cs=new PerroPersonaService();
       cs.CrearPerro(p1);
       cs.CrearPerro(p2);
//       cs.CrearPerro(p3);
       cs.CrearPersona(m1);
       cs.CrearPersona(m2);
//       cs.CrearPersona(m3);
       ArrayList<Perro> perri=new ArrayList();
       ArrayList<Personas> people=new ArrayList();
       perri.add(p1);
       perri.add(p2);
//       perri.add(p3);
       
       people.add(m1);
       people.add(m2);
//       people.add(m3);
      
       Iterator it=perri.iterator();
        for (Personas per : people) {
            System.out.println("Por favor "+per.getNombre()+" "+per.getApellido()+" elija uno de los perros disponibles");
            System.out.println("Para elejir un perro debe escribir su nombre");
            for (Perro pe : perri) {
                System.out.println(pe);
            }
            res=leer.next();
            do {
                
                    for (Perro pa : perri) {
                        if (pa.getNombre().equalsIgnoreCase(res)) {
                         per.setPerro(pa);
                         
                         while(it.hasNext()){
                             Perro perroAuz=(Perro) it.next();
                             if (perroAuz.getNombre().equalsIgnoreCase(res)) {
                                it.remove();
                             }
                         }
                         ready=true;
                        }
                    }
                    if (ready) {
                        System.out.println("Bien, Gracias por elejir ese sera su nueva mascota");   
                    }else{
                        System.out.println("Lo sentimos ese perro no esta en nuestra lista o el nombre no fue escrito correctamente");
                        System.out.println("Intentelo de nuevo");
                        res=leer.next();
                    }
                
 
            } while (!ready);
        }
        /*System.out.println(m1.getNombre()+" "+m1.getApellido()+"Elija un numero:");
        System.out.println("Ese nuemero decididara cual de los 2 perro se llevara");
        int num=leer.nextInt();
        if (num==1) {
           m1.setPerro(p1);
           m2.setPerro(p2);
        }else{
            m1.setPerro(p2);
            m2.setPerro(p1);
        }
        System.out.println(m1);
        System.out.println(m2);*/
        for (Personas personas : people) {
            System.out.println(personas); 
        }
    }
    
}
