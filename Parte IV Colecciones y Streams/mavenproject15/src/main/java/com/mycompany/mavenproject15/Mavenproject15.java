package com.mycompany.mavenproject15;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*15-Agrupación con Collectors: Emplea Collectors.groupingBy() para agrupar una lista de 
objetos por alguna propiedad (por ejemplo, por la primera letra de un nombre)*/
public class Mavenproject15 {

    public static void main(String[] args) {
        // Lista de nombres
        List<String> nombres = Arrays.asList("Ana", "Andrés", "Carlos", "Carmen", "Beatriz", "Bruno", "David");

        // Agrupar nombres por la primera letra
        Map<Character, List<String>> nombresAgrupados = nombres.stream()
                .collect(Collectors.groupingBy(nombre -> nombre.charAt(0))); // Agrupa por la primera letra

        // Mostrar los grupos
        nombresAgrupados.forEach((letra, lista) -> 
            System.out.println(letra + ": " + lista));
    }
}
