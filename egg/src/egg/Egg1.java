/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg;

/**
 *
 * @author astud
 */
public class Egg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Frase="Hola";
        String letra;
        for (int i = 4; i > 0; i--) {
           //letra=Frase.substring(i);
            String substring = Frase.substring(i-1,i);
           // System.out.println(letra);
            System.out.println(substring);
        }
    }
    
}
