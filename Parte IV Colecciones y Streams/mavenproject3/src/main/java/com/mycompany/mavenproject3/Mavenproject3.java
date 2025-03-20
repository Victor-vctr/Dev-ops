package com.mycompany.mavenproject3;

import java.util.HashMap;
import java.util.Map;

/*3-HashMap de Estudiantes: Implementa un HashMap que asocie nombres de estudiantes con sus 
calificaciones y recórrelo mostrando cada par clave-valor.*/
public class Mavenproject3 {

    public static void main(String[] args) {
        // Crear un HashMap que asocie nombres de estudiantes con sus calificaciones
        HashMap<String, Integer> calificaciones = new HashMap<>();

        // Agregar estudiantes y sus calificaciones
        calificaciones.put("Juan", 85);
        calificaciones.put("María", 92);
        calificaciones.put("Carlos", 78);
        calificaciones.put("Ana", 90);
        calificaciones.put("Pedro", 88);

        // Recorrer el HashMap y mostrar cada par clave-valor
        System.out.println("Calificaciones de los estudiantes:");
        for (Map.Entry<String, Integer> entrada : calificaciones.entrySet()) {
            System.out.println("Estudiante: " + entrada.getKey() + " - Calificación: " + entrada.getValue());
        }
    }
}
