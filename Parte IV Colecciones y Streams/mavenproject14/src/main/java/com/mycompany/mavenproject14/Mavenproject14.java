package com.mycompany.mavenproject14;

import java.util.Arrays;
import java.util.List;

/*14-Filtrado y Conteo: Utiliza Streams para filtrar y contar cuántos elementos en una lista 
de enteros son mayores que 50.*/
public class Mavenproject14 {

    public static void main(String[] args) {
        // Lista de números enteros
        List<Integer> numeros = Arrays.asList(10, 55, 70, 30, 85, 40, 60, 90);

        // Contar cuántos números son mayores que 50
        long cantidad = numeros.stream()
                .filter(n -> n > 50) // Filtra los números mayores que 50
                .count(); // Cuenta los elementos que cumplen la condición

        // Mostrar el resultado
        System.out.println("Cantidad de números mayores que 50: " + cantidad);
    }
}
