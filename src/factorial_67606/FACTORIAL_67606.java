/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial_67606;

import java.util.Scanner;

/**
 *
 * @author Campe
 */
public class FACTORIAL_67606 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        int suma = 0;
        int valor = 15;
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO 15: ");
        contador = leer.nextInt();
        System.out.println(" LA FACTORIAL DE " + contador + "  ES  ");

        while (contador <= valor) {
            contador++;
            suma = contador * 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 
                    12 * 13 * 14 * 15;

        }
        System.out.println("ESTO : " + suma);
    }
    
}
