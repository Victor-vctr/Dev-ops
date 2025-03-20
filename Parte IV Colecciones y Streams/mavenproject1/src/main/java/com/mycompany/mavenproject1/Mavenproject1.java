package com.mycompany.mavenproject1;

import java.util.ArrayList;

/*1-ArrayList Básico: Crea un ArrayList de enteros, agrega 10 números y recórrelo usando un 
bucle for-each, mostrando cada elemento.*/
public class Mavenproject1 {

    public static void main(String[] args) {
        // Crear un ArrayList de enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        
        // Agregar 10 números al ArrayList
        for (int i = 1; i <= 10; i++) {
            numeros.add(i * 10); // Agrega múltiplos de 10 (ejemplo: 10, 20, 30, ...)
        }

        // Recorrer el ArrayList usando un bucle for-each y mostrar los números
        System.out.println("Elementos del ArrayList:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
