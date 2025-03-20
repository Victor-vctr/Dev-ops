package com.mycompany.mavenproject7;

import java.util.TreeSet;

/*7-TreeSet Ordenado: Usa un TreeSet para almacenar números y demuestra cómo se ordenan 
automáticamente.*/

public class Mavenproject7 {

    public static void main(String[] args) {
        // Crear un TreeSet para almacenar números enteros
        TreeSet<Integer> numeros = new TreeSet<>();

        // Agregar números al TreeSet (en orden aleatorio)
        numeros.add(50);
        numeros.add(20);
        numeros.add(40);
        numeros.add(10);
        numeros.add(30);

        // Mostrar los números ordenados automáticamente
        System.out.println("Números en el TreeSet ordenados: " + numeros);
    }
}
