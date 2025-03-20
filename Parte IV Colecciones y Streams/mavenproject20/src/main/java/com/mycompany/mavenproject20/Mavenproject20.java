package com.mycompany.mavenproject20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*20-Joining de Strings: Utiliza Collectors.joining() para concatenar los elementos de una 
lista de cadenas separándolos por comas.*/
public class Mavenproject20 {

    public static void main(String[] args) {
        // Lista de cadenas
        List<String> nombres = Arrays.asList("Juan", "María", "Carlos", "Ana");

        // Concatenar usando Collectors.joining() con una coma como separador
        String resultado = nombres.stream().collect(Collectors.joining(", "));

        // Mostrar resultado
        System.out.println("Nombres concatenados: " + resultado);
    }
}
