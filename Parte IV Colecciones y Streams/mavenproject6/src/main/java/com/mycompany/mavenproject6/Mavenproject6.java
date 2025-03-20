package com.mycompany.mavenproject6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*6-Conversión de Array a Lista: Convierte un array de enteros a una lista utilizando 
Arrays.asList() y recórrelo.*/
public class Mavenproject6 {

    public static void main(String[] args) {
        // Array de enteros
        Integer[] numerosArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Convertir el array a una lista con Arrays.asList()
        List<Integer> numerosLista = Arrays.asList(numerosArray);

        // Recorrer e imprimir la lista usando for-each
        System.out.println("Lista de números:");
        for (Integer num : numerosLista) {
            System.out.print(num + " ");
        }
    }
}
