package com.mycompany.mavenproject12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*12-Uso de flatMap(): Crea una lista de listas de enteros y usa flatMap() para aplanarla en
una única lista de enteros.*/
public class Mavenproject12 {

    public static void main(String[] args) {
        // Lista de listas de enteros
        List<List<Integer>> listaDeListas = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        // Aplanar la lista de listas en una sola lista de enteros usando flatMap()
        List<Integer> listaAplanada = listaDeListas.stream()
                .flatMap(List::stream) // Convierte cada lista en un Stream y las fusiona
                .collect(Collectors.toList()); // Recolecta en una nueva lista

        // Mostrar la lista aplanada
        System.out.println("Lista aplanada: " + listaAplanada);
    }
}
