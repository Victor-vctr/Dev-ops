package com.mycompany.mavenproject19;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Collectors;

/*19-Comparación de Streams: Crea y ejecuta un stream secuencial y uno paralelo para sumar 
un gran número de elementos, comparando su rendimiento (comentario explicativo).*/
public class Mavenproject19 {

    public static void main(String[] args) {
        // Crear una lista de 10 millones de números
        List<Long> numeros = LongStream.rangeClosed(1, 10_000_000)
                                       .boxed()
                                       .collect(Collectors.toList());

        // Medir el tiempo de ejecución del Stream Secuencial
        long inicioSecuencial = System.currentTimeMillis();
        long sumaSecuencial = numeros.stream().mapToLong(Long::longValue).sum();
        long finSecuencial = System.currentTimeMillis();
        System.out.println("Suma Secuencial: " + sumaSecuencial + " (Tiempo: " + (finSecuencial - inicioSecuencial) + " ms)");

        // Medir el tiempo de ejecución del Stream Paralelo
        long inicioParalelo = System.currentTimeMillis();
        long sumaParalela = numeros.parallelStream().mapToLong(Long::longValue).sum();
        long finParalelo = System.currentTimeMillis();
        System.out.println("Suma Paralela: " + sumaParalela + " (Tiempo: " + (finParalelo - inicioParalelo) + " ms)");
    }
}
