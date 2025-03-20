package com.mycompany.mavenproject5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*5-Filtro con Streams: Filtra los números pares de una lista de enteros utilizando la 
operación filter() de Streams y muestra el resultado.*/

public class Mavenproject5 {

    public static void main(String[] args) {
        // Crear una lista de enteros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtrar solo los números pares usando Streams y filter()
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0) // Filtra los números que son divisibles por 2
                .collect(Collectors.toList()); // Convierte el resultado en una lista

        // Mostrar el resultado
        System.out.println("Números pares: " + numerosPares);
    }
}
