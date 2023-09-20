/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import egg.Egg2;
import java.util.Scanner;
import java.util.Date;
import static jdk.nashorn.internal.objects.NativeDate.getYear;

/**
 *
 * @author astud
 */
public class FechaService {
    public Date fechaNacimiento(){
     Scanner leer=new Scanner(System.in);  
     int dia;
     int mes;
     int año;
        System.out.println("Ingrese el dia de nacimiento");
        dia=leer.nextInt();
        System.out.println("Ingrese el numero de mes de su nacimiento");
        mes=leer.nextInt()-1;
        System.out.println("Ingrese el años de nacimientos");
        año=leer.nextInt()-1900;
       Date fecha=new Date(año, mes,dia);
       return fecha;
     
    }
    public Date FechaActual(){
        Date fechaActual=new Date();
        return fechaActual;
    }
   public void Diferencia(Date fec,Date fech){
       long fechas=fec.getTime();
       long fechon=fech.getTime();
       long dif=fechon-fechas;
       System.out.println("Edad:");
       System.out.println(dif/31536000000l);
       
   }

    
}
