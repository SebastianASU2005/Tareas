/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author astud
 */
public class CadenaServicio {
     Scanner leer=new Scanner(System.in);
   public void MostrarVocales(Cadena Cadena){
      
      
       
       System.out.println(Cadena.getLongitud());
     String palabra=Cadena.getFrase();
     String letra;
     int cont=0;
       for (int i = 0; i < Cadena.getLongitud(); i++) {
          letra=palabra.substring(i, i);
           if (Cadena.getFrase().substring(i, i+1).equalsIgnoreCase("a")) {
            cont=cont+1;
           }else
               if (Cadena.getFrase().substring(i, i+1).equalsIgnoreCase("e")) {
               cont=cont+1;
           }else
                   if (Cadena.getFrase().substring(i, i+1).equalsIgnoreCase("i")) {
               cont=cont+1;
           }else 
                if (Cadena.getFrase().substring(i, i+1).equalsIgnoreCase("o")){
                    cont=cont+1;
                
           }else
                    if (Cadena.getFrase().substring(i, i+1).equalsIgnoreCase("u")){
                        cont=cont+1;  
           }
             
          }
       System.out.println("La cantidad de vocales que hay es: "+cont); 
       }
   public void InvertirFrase(Cadena Cadena){
       for (int i = Cadena.getLongitud(); i > 0; i--) {
           System.out.print(Cadena.getFrase().substring(i-1, i));
       }
       System.out.println("");
   }
   public void vecesRepetido(Cadena Cadena){
       String letra;
       System.out.println("Que letra desea buscar?");
       letra=leer.next();
       int cont=0;
       for (int i = 0; i < Cadena.getLongitud(); i++) {
           if (Cadena.getFrase().substring(i, i+1).equalsIgnoreCase(letra)) {
              cont=cont+1;
           }

       }
       if (cont>1) {
           System.out.println("La letra elejida se repite "+(cont-1)+" veces"); 
       }else
           System.out.println("La letra no se repite");
      
   }
   public void compararLongitud(Cadena Cadena){
       String palabra;
       System.out.println("Ingrese otra frase");
       palabra=leer.next();
       if (Cadena.getFrase().compareToIgnoreCase(palabra)==0) {
           System.out.println("La dos frases tienen la misma longitud");
       }else 
           if  (Cadena.getFrase().compareToIgnoreCase(palabra)>0) {
               System.out.println("La primera frase es mas grande que la reciente");
       }else 
             System.out.println("La primera frase es mas pequeña que la reciente");
               
           
       
   }
   public void unirFrases(Cadena Cadena){
       String palabra;
       String junto;
       System.out.println("Ingrese una nueva frase");
       palabra=leer.next();
       junto=Cadena.getFrase().concat(palabra);
       System.out.println("La primera frase unida con la reciente forman la palabra: "+Cadena.getFrase()+" "+palabra);
       
   }
   public void reemplazar(Cadena Cadena){
       String letra;
       String palabra;
       System.out.println("Vamos a cambiar todas las vocales A que contega la primera frase");
       System.out.println("A que letra quieres cambiar dicha vocal?");
       letra=leer.next();
       for (int i = 0; i < Cadena.getLongitud(); i++) {
           if (Cadena.getFrase().substring(i, i+1).equalsIgnoreCase("a")) {
               palabra=letra;
               System.out.print(palabra);
           }else{
               palabra=Cadena.getFrase().substring(i, i+1);
               System.out.print(palabra);
           }
               
       }
   }
   public void contiene(Cadena Cadena){
       String letra;
       int num=0;
       System.out.println("Que letra deseas comprobrar que tenga la primera frase");
       letra=leer.next();
       for (int i = 0; i <Cadena.getLongitud(); i++) {
           if (Cadena.getFrase().substring(i, i+1).equalsIgnoreCase(letra)) {
            num=1;   
           }
           
       }
       if (num==0) {
           System.out.println("Lo siento la palabra no se encuentra en la primera frase"); 
       }else
           System.out.println("Bien. Su letra fue encontrada en la frase");
   }
}
   

