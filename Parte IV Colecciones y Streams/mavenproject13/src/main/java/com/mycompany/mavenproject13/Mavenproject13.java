package com.mycompany.mavenproject13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*13-Map Recorrido: Crea un Map<Integer, String> que asocie claves numéricas a nombres y 
recórrelo usando forEach.*/
public class Mavenproject13 {

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
