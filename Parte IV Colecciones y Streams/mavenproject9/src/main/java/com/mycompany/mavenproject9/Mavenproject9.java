package com.mycompany.mavenproject9;

import java.util.Vector;

/*9-Vector y Sincronización: Crea un Vector de cadenas y explica, en comentarios, la 
sincronización implícita de esta colección.*/
public class Mavenproject9 {

    public static void main(String[] args) {
        // Crear un Vector de cadenas
        Vector<String> nombres = new Vector<>();

        // Agregar elementos al Vector
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Marta");

        // Insertar un elemento en una posición específica
        nombres.add(2, "Pedro"); // Se inserta en la posición 2

        // Mostrar el contenido del Vector
        System.out.println("Elementos del Vector: " + nombres);

        // Eliminar un elemento
        nombres.remove("Luis");

        // Mostrar el contenido después de la eliminación
        System.out.println("Vector después de eliminar un elemento: " + nombres);
    }
}
