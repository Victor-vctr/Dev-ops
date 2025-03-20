package com.mycompany.mavenproject18;

import java.util.Arrays;
import java.util.List;

/*18-Impresión con forEach(): Usa el método forEach() de Streams para imprimir cada elemento 
de una lista de enteros.*/
public class Mavenproject18 {

    public static void main(String[] args) {
        // Lista de enteros
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        // Usar forEach() con Streams para imprimir cada número
        numeros.stream().forEach(numero -> System.out.println("Número: " + numero));
    }
}
