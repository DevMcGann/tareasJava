package com.mycompany.ejercicios;


public class Cuatro {
    int lista[]={10,20,30,40,50,60,70,80,90,100};
    int indice;
    
    void resultado(){
        for (int i = 0; i <= lista.length -1; i++){
            indice = indice + 1;
            System.out.println(indice +" "+lista[i]);
        }
    }
}
