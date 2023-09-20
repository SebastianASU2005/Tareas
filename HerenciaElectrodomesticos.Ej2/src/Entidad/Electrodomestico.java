/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author astud
 */
public class Electrodomestico {

    protected Integer precio=1000;
    protected String color;
    protected char Energia;
    protected Integer peso;

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getEnergia() {
        return Energia;
    }

    public void setEnergia(char Energia) {
        this.Energia = Energia;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Electrodomestico(Integer precio, String color, char Energia, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.Energia = Energia;
        this.peso = peso;
    }

    public Electrodomestico() {
    }

    /*Metedo para comprobar si el consumo de energia es el correcto */
    public char comprobarEnergia(char letra) {
        boolean bandera = false;
        if (letra == 'A' || letra == 'a') {
            bandera = true;
        }
        if (letra == 'B' || letra == 'b') {
            bandera = true;
        }
        if (letra == 'C' || letra == 'c') {
            bandera = true;
        }
        if (letra == 'D' || letra == 'd') {
            bandera = true;
        }
        if (letra == 'E' || letra == 'e') {
            bandera = true;
        }
        if (letra == 'F' || letra == 'f') {
            bandera = true;
        }
        if (bandera) {
            System.out.println("Dato comprobado");
        } else {
            System.out.println("Dato incorrecto(F por predeterminado)");
            letra = 'F';
        }
        return letra;
    }

    /*Metedo para combrobar si el color es uno de los disponibles
    Colores Disponibles:BLANCO,NEGRO,ROJO,AZUL Y GRIS*/
    public String comprobarColor(String color) {
        boolean bandera = false;
        if (color.equalsIgnoreCase("Blanco")) {
            bandera = true;
        }
        if (color.equalsIgnoreCase("Negro")) {
            bandera = true;
        }
        if (color.equalsIgnoreCase("Rojo")) {
            bandera = true;
        }
        if (color.equalsIgnoreCase("Azul")) {
            bandera = true;
        }
        if (color.equalsIgnoreCase("Gris")) {
            bandera = true;
        }
        if (bandera) {
            System.out.println("Dato combrobado");
        } else {
            System.out.println("Dato Incorrecto (BLANCO predeterminado)");
            color = "Blanco";
        }
        return color;
    }

    /*Metodo que llena todos los atributos de una clase Electrodomestico, El precio es por predeterminado 1000$ */
   public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el color del electrodomestico");
        this.color = comprobarColor(leer.next());
        System.out.println("Ingrese la letra de consumo de energia del electrodomestico");
        System.out.println("(A|B|C|D|E|F)");
        this.Energia = comprobarEnergia(leer.next().charAt(0));
        System.out.println("Ingrese el peso del electrodomestico");
        this.peso = leer.nextInt();
}

    /*Metodo que se encarga de calcular el precio correcto teniendo en cuenta los datos de ENERGIA y PESO */
    public int PrecioFinal() {
        int precioFinal = this.precio;
        switch (this.Energia) {
            case 'A':
            case 'a':
                precioFinal += 1000;
                break;
            case 'B':
            case 'b':
                precioFinal += 800;
                break;
            case 'C':
            case 'c':
                precioFinal += 600;
                break;
            case 'D':
            case 'd':
                precioFinal += 500;
                break;
            case 'E':
            case 'e':
                precioFinal += 300;
                break;
            case 'F':
            case 'f':
                precioFinal += 100;
                break;

        }
        //Peso
        if (this.peso >= 1 && this.peso <= 19) {
            precioFinal += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioFinal += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioFinal += 800;
        } else {
            precioFinal += 1000;
        }
        return precioFinal;
    }
}

