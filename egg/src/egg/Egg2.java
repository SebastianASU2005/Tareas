/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg;

import Entidades.Ahorcado;
import Entidades.Cadena;
import Entidades.Curso;
import Entidades.ParDeNumeros;
import Entidades.Persona;
import Services.AhorcadoService;
import Services.ArregloService;
import Services.CadenaServicio;
import Services.FechaService;
import Services.NumerosServicio;
import Services.PersonaService;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author astud
 */
public class Egg2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Sstem.out.println("Escriba una frase");
       Scanner leer=new Scanner(System.in);
       CadenaServicio cs=new CadenaServicio();
        Cadena m1=new Cadena(leer.next());
        cs.MostrarVocales(m1);
        cs.InvertirFrase(m1);
        cs.vecesRepetido(m1);
        cs.compararLongitud(m1);
        cs.unirFrases(m1);
        cs.reemplazar(m1);
        System.out.println("");
        cs.contiene(m1);y*/

 /*ParDeNumeros m1=new ParDeNumeros();
        NumerosServicio cs=new NumerosServicio();
        cs.MostrarValores(m1);
        cs.RetornarMayor(m1);
        cs.Potencia(m1);
        cs.CalcularRaiz(m1);*/
 /* double[] num50=new double[50];
        double[] num20=new double[20];
        ArregloService cs=new ArregloService();
        cs.InicializarA(num50);
        cs.Mostrar(num50);
        cs.Ordenar(num50);
        cs.InicializarB(num20, num50);
        cs.Mostrar(num50);
        cs.MostrarB(num20);*/
 /*FechaService cs=new FechaService();
       Date fechas=cs.fechaNacimiento();
       Date fechon=cs.FechaActual();
       cs.Diferencia(fechas, fechon);*/
 /*PersonaService cs=new PersonaService();
       Persona m1=cs.crearPersona();
       cs.calcularEdad(m1);
        if (cs.MenorQue(m1) ) {
            System.out.println("La persona es mayor o igual a la edad elejida");
        }else
             System.out.println("La persona es menor a la edad elejida");
        System.out.println(m1);*/
 /*Curso m1=new Curso();
       m1.crearCurso();
       m1.calcularGanancias();*/
 /*Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas.
A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9].
El programa debe pedir al usuario que adivine el mes secreto. 
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:*/
        /*String[] meses = new String[12];
        String mesSecreto;
        Scanner leer = new Scanner(System.in);
        meses[0] = "enero";
        meses[1] = "febreo";
        meses[2] = "marzo";
        meses[3] = "abril";
        meses[4] = "mayo";
        meses[5] = "junio";
        meses[6] = "julio";
        meses[7] = "agosto";
        meses[8] = "septiembre";
        meses[9] = "octubre";
        meses[10] = "noviembre";
        meses[11] = "diciembre";
        mesSecreto = meses[9];
        String eleccion;
        System.out.println("Adivina el mes secreto");
        eleccion="";
        while (true) {
      eleccion= leer.next();
         if(eleccion.equals(mesSecreto)) {
        System.out.println("Acertaste!");
        break;
         } else 
        System.out.println("Intentalo de nuevo!");
  
        }*/
        Scanner leer=new Scanner(System.in);
        Ahorcado m1=new Ahorcado();
        AhorcadoService cs =new AhorcadoService();
        cs.Juego(m1);
        
        
    }
}
