package com.mycompany.mavenproject11;

import java.util.Arrays;
import java.util.List;

/*11-Reducción en Streams: Emplea la operación reduce() para calcular el producto de todos 
los elementos de una lista de enteros.*/
public class Mavenproject11 {

    public static void main(String[] args) {
        // Lista de números enteros
        List<Integer> numeros = Arrays.asList(2, 3, 4, 5);

        // Calcular el producto de todos los elementos usando reduce()
        int producto = numeros.stream()
                .reduce(1, (a, b) -> a * b); // Multiplica acumulativamente los elementos

        // Mostrar el resultado
        System.out.println("El producto de los números es: " + producto);
    }
}
