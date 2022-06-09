
package com.mycompany.ejercicios;

import java.util.Scanner;


public class Tres {
    int leerNumero(){
          int numero;
          Scanner console = new Scanner(System.in);
          System.out.print("ingresa numero mayor a 1: ");
          numero = console.nextInt();
          return numero;
        }

        void mostrarResultado(){
            int numero = leerNumero();
            System.out.println("cuenta regresiva desde " + numero + " hasta 1 : ");
            for (int i=numero; i>=1; i--){
                    System.out.println(i);
            }
        }  
}
