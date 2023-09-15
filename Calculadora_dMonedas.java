/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_dmonedas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculadora_dMonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        final double euro = 18.21;
        final double dolares = 17.07;
        final double yen = 0.12 ;
        final double libra = 21.18;

        System.out.println("Ingresa una cantidad de pesos: ");
        double pesos = lectura.nextInt();

        System.out.println("Euros: " + pesos / 18.21);
      
        System.out.println("Dolares: " + pesos / 17.07);

        System.out.println("yen: " + pesos / 0.12);
        System.out.println("Libra: " + pesos / 21.18);

        // TODO code application logic here
    }

}
