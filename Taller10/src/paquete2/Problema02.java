/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int[][] ventas = new int[2][5];
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        int suma = 0;

        for (int i = 0; i < vendedores.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.println("Ingrese la cantidad de ventas hechas en el dia: ");
                ventas[i][j] = entrada.nextInt();

                suma = suma + ventas[i][j];

            }

        }
        for (int i = 0; i < vendedores.length; i++) {
            System.out.printf("Vendedor(a) %s\n", vendedores[i]);

        }
        System.out.printf("En total se realizaro una cantidad de: %d en ventas.\n", suma);

    }

}
