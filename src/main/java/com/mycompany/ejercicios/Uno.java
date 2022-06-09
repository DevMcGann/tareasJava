
package com.mycompany.ejercicios;

import java.util.Scanner;


public class Uno {
   int leerNumero(){
          int numero;
          Scanner console = new Scanner(System.in);
          System.out.print("ingresa numero menor a 100: ");
          numero = console.nextInt();
          return numero;
        }

        void mostrarResultado(){
            int numero = leerNumero();
            System.out.println("numero seleccionado fue  " + numero);
            for (int i=numero; i<=100; i++){
                if (i % 2 == 0){
                    System.out.println("numero " + i);
                }
            }
        } 
}
