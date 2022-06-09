
package com.mycompany.ejercicios;

import java.util.Scanner;


public class Dos {
    int[] sueldos = new int[7];
    int mayorSueldo;
    int menorSueldo;
    int promedio;
    
    
    void ejecutar(){
        leerSueldos();
        calcularMayor();
        calcularMenor();
        promedio();
    }
   
     
    void leerSueldos(){
         Scanner input = new Scanner(System.in);
        for (int i = 0; i <= sueldos.length -1 ; i++) {
            System.out.print("ingresa sueldo:  ");
            sueldos[i] = input.nextInt();
        }
    }
    
    void calcularMayor(){
        int mayor = 0;
        for (int i = 0; i <= sueldos.length -1; i++){
            if (sueldos[i] > mayor){
                mayor = sueldos[i];
            }
        }
        mayorSueldo = mayor;
        System.out.println("El sueldo mas alto fue: " + mayorSueldo);
    }
    
    void calcularMenor(){
        int menor = sueldos[0];
        for (int i = 0; i <= sueldos.length -1; i++){
            if (sueldos[i] <= menor){
                menor = sueldos[i];
            }
        }
        menorSueldo = menor;
        System.out.println("El sueldo mas bajo fue: " + menorSueldo);
    }
    
    
    void promedio(){
        int suma = 0;
        for (int i = 0; i <= sueldos.length -1; i++){
           suma = suma + sueldos[i];
        }
        promedio = suma / sueldos.length;
        System.out.println("El promedio fue: " + promedio);
    }
    
    
}
