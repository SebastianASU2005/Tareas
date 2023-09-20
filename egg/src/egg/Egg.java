/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg;

import Entidades.Persona;
import Services.PersonaService;

/**
 *
 * @author astud
 */
public class Egg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int[] edad = new int[4];
        double[] peso = new double[4];
        int def = 0;
        int nor = 0;
        int gor = 0;
        int porceEdad;
        int porcePeso;
        int menores = 0;
        int mayores = 0;
        Persona m1 = new Persona(0, "", "", 0, 0);
        Persona m2 = new Persona(0, "", "", 0, 0);
        Persona m3 = new Persona(0, "", "", 0, 0);
        Persona m4 = new Persona(0, "", "", 0, 0);
        PersonaService cs = new PersonaService();
        cs.CrearPersona(m1);
        if (cs.MayorDeEdad(m1)) {
            System.out.println("La persona " + m1.getNombre() + " es mayor de edad");
        } else {
            System.out.println("La persona " + m1.getNombre() + " es menor  de edad");
        }
        edad[0] = m1.getEdad();
        switch (cs.CalcularIMC(m1)) {
            case -1:
                System.out.println("La persona " + m1.getNombre() + " esta por debajo de su peso ideal");
                def = def + 1;
                break;
            case 0:
                System.out.println("La persona " + m1.getNombre() + " esta en su peso ideal");
                nor = nor + 1;
                break;
            case 1:
                System.out.println("La persona " + m1.getNombre() + " esta por encima de su peso ideal");
                gor = gor + 1;
                break;
            default:
                break;
        }
        peso[0] = m1.getPeso();
        
        cs.CrearPersona(m2);
        if (cs.MayorDeEdad(m2)) {
            System.out.println("La persona " + m2.getNombre() + " es mayor de edad");
        } else {
            System.out.println("La persona " + m2.getNombre() + " es menor  de edad");
        }
        edad[1] = m2.getEdad();
        switch (cs.CalcularIMC(m2)) {
            case -1:
                System.out.println("La persona " + m2.getNombre() + " esta por debajo de su peso ideal");
                def = def + 1;
                break;
            case 0:
                System.out.println("La persona " + m2.getNombre() + " esta en su peso ideal");
                nor = nor + 1;
                break;
            case 1:
                System.out.println("La persona " + m2.getNombre() + " esta por encima de su peso ideal");
                gor = gor + 1;
                break;
            default:
                break;
        }
        peso[1] = m2.getPeso();
       
        cs.CrearPersona(m3);
        if (cs.MayorDeEdad(m3)) {
            System.out.println("La persona " + m3.getNombre() + " es mayor de edad");
        } else {
            System.out.println("La persona " + m3.getNombre() + " es menor  de edad");
        }
        edad[2] = m3.getEdad();
        switch (cs.CalcularIMC(m3)) {
            case -1:
                System.out.println("La persona " + m3.getNombre() + " esta por debajo de su peso ideal");
                def = def + 1;
                break;
            case 0:
                System.out.println("La persona " + m3.getNombre() + " esta en su peso ideal");
                nor = nor + 1;
                break;
            case 1:
                System.out.println("La persona " + m3.getNombre() + " esta por encima de su peso ideal");
                gor = gor + 1;
                break;
            default:
                break;
        }
        peso[2] = m3.getPeso();
       
        cs.CrearPersona(m4);
        if (cs.MayorDeEdad(m4)) {
            System.out.println("La persona " + m4.getNombre() + " es mayor de edad");
        } else {
            System.out.println("La persona " + m4.getNombre() + " es menor  de edad");
        }
        edad[3] = m4.getEdad();
        switch (cs.CalcularIMC(m4)) {
            case -1:
                System.out.println("La persona " + m4.getNombre() + " esta por debajo de su peso ideal");
                def = def + 1;
                break;
            case 0:
                System.out.println("La persona " + m4.getNombre() + " esta en su peso ideal");
                nor = nor + 1;
                break;
            case 1:
                System.out.println("La persona " + m4.getNombre() + " esta por encima de su peso ideal");
                gor = gor + 1;
                break;
            default:
                break;
        }
        peso[3] = m4.getPeso();
        
        for (int i = 0; i < edad.length; i++) {

            if (edad[i] >= 18) {
                mayores = mayores + 1;
            } else {
                menores = menores + 1;
            }
        }
        mayores = (mayores * 100) / 4;
        menores = (menores * 100) / 4;
        def = (def * 100) / 4;
        nor = (nor * 100) / 4;
        gor = (gor * 100) / 4;
        System.out.println("El porcentade de gente mayor de edad es de " + mayores + "%");
        System.out.println("El porcentade de gente menor de edad es de " + menores + "%");
        System.out.println("");
        System.out.println("El porcentaje de gente con deficis de peso es de " + def + "%");
        System.out.println("El porcentaje de gente con peso ideal es de " + nor + "%");
        System.out.println("El porcentaje de gente con sobrepeso de peso es de "+gor+"%");*/
    }
}
