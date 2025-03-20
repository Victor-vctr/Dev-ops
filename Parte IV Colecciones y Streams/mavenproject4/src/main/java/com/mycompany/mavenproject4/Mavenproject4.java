package com.mycompany.mavenproject4;

import java.util.ArrayList;
import java.util.Collections;

/*4-Ordenar Strings: Crea una lista de cadenas y ordénala alfabéticamente utilizando 
Collections.sort().*/
public class Mavenproject4 {

    public static void main(String[] args) {
        // Crear una lista de cadenas
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar nombres a la lista
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Pedro");

        // Mostrar lista antes de ordenar
        System.out.println("Lista antes de ordenar: " + nombres);

        // Ordenar la lista alfabéticamente
        Collections.sort(nombres);

        // Mostrar lista después de ordenar
        System.out.println("Lista después de ordenar: " + nombres);
    }
}
