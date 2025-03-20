package com.mycompany.mavenproject10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*10-Transformación con Streams: Utiliza un Stream para convertir una lista de nombres a 
mayúsculas y muéstrala por consola.*/
public class Mavenproject10 {

    public static void main(String[] args) {
        // Lista de nombres en minúsculas
        List<String> nombres = Arrays.asList("ana", "luis", "carlos", "marta");

        // Transformar los nombres a mayúsculas usando Stream
        List<String> nombresMayusculas = nombres.stream()
                .map(String::toUpperCase) // Convierte cada nombre a mayúsculas
                .collect(Collectors.toList()); // Recolecta en una nueva lista

        // Mostrar la lista transformada
        System.out.println("Nombres en mayúsculas: " + nombresMayusculas);
    }
}
