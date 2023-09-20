/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author astud
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in);

    public void crearJuego(Ahorcado Ahorcado) {
        System.out.println("Ingrese la palabra");
        Ahorcado.setPalabra(leer.next());
        String[] vector = new String[Ahorcado.getPalabra().length()];
        Ahorcado.setVector(vector);
        System.out.println("Elija cuantas oportunidades hay");
        Ahorcado.setJugadasMaximas(leer.nextInt());
        for (int i = 0; i < Ahorcado.getPalabra().length(); i++) {
            String letra;
            letra = Ahorcado.getPalabra().substring(i, i + 1);
            Ahorcado.getVector()[i] = letra;
            System.out.println(Ahorcado.getVector()[i]);
        }
    }

    public void longitud(Ahorcado Ahorcado) {
        System.out.println("La longitud de la palabra es de: " + Ahorcado.getPalabra().length() + " letras");
    }

    public void buscar(Ahorcado Ahorcado, String letra) {
        int cont = 0;
        for (int i = 0; i < Ahorcado.getPalabra().length(); i++) {

            if (letra.equalsIgnoreCase(Ahorcado.getVector()[i])) {
                cont = 1;
            }

        }
        if ((cont == 1)) {
            System.out.println("La letra fue encontrada en la palabra");
        } else {
            System.out.println("La letra no se encontro en la palabra");
        }
    }

    public boolean encontradas(Ahorcado Ahorcado, String letra) {
        boolean verd = false;
        int enc = 0;
        int nop = Ahorcado.getPalabra().length();
        for (int i = 0; i < Ahorcado.getPalabra().length(); i++) {
            if (letra.equalsIgnoreCase(Ahorcado.getVector()[i])) {
 Ahorcado.setLetrasEncontradas(Ahorcado.getLetrasEncontradas()+1);
                verd = true;
            }
            

        }
        
        System.out.println("Numero de letras (Encontrada,Faltantentes)" + Ahorcado.getLetrasEncontradas() + "/" + (Ahorcado.getPalabra().length()-Ahorcado.getLetrasEncontradas()));
        
        return verd;

    }

    public void intentos(Ahorcado Ahorcado) {
        System.out.println("La cantidad de intentos restantes es: " + Ahorcado.getJugadasMaximas());
    }

    public void Juego(Ahorcado Ahorcado) {
        crearJuego(Ahorcado);
        String letra;
        int cont = Ahorcado.getJugadasMaximas();
        do {
            System.out.println("Ingrese una letra");
            letra = leer.next();
            longitud(Ahorcado);
            buscar(Ahorcado, letra);

            if (encontradas(Ahorcado, letra)) {
                
            } else {
               Ahorcado.setJugadasMaximas(Ahorcado.getJugadasMaximas()-1);
            }
            if (cont == 0) {
                break;
            }
            intentos(Ahorcado);

        } while (Ahorcado.getJugadasMaximas()!= 0 && Ahorcado.getLetrasEncontradas()!=Ahorcado.getPalabra().length());
        if (Ahorcado.getJugadasMaximas()>0) {
            System.out.println("Ganaste, felicidades");
        }else
            System.out.println("Game Over");
    }
}
