package com.mycompany.mavenproject16;

import java.util.*;

/*16-Conversión de Set a Lista: Convierte un Set de cadenas en una lista y recórrela, 
mostrando cada elemento.*/
public class Mavenproject16 {

    public static void main(String[] args) {
        // Crear un Set de cadenas
        Set<String> conjunto = new HashSet<>(Arrays.asList("Java", "Python", "C++", "JavaScript"));

        // Convertir el Set en una Lista
        List<String> lista = new ArrayList<>(conjunto);

        // Recorrer la lista y mostrar cada elemento
        System.out.println("Lista convertida:");
        for (String elemento : lista) {
            System.out.println(elemento);
        };
    }
}
