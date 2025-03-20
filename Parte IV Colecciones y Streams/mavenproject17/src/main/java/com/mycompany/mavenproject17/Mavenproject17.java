package com.mycompany.mavenproject17;

import java.util.*;

/*17-Uso de Optional: Crea un ejemplo que utilice Optional para evitar valores nulos al 
buscar un elemento en una lista.*/
public class Mavenproject17 {

    public static void main(String[] args) {
        // Lista de nombres
        List<String> nombres = Arrays.asList("Ana", "Bruno", "Carlos", "Daniela");

        // Buscar un nombre en la lista (ejemplo: "Carlos")
        Optional<String> resultado = nombres.stream()
                .filter(nombre -> nombre.equalsIgnoreCase("Carlos")) // Buscar "Carlos"
                .findFirst(); // Retorna un Optional<String>

        // Manejo del Optional
        resultado.ifPresentOrElse(
            nombre -> System.out.println("Nombre encontrado: " + nombre),
            () -> System.out.println("Nombre no encontrado")
        );
    }
}
