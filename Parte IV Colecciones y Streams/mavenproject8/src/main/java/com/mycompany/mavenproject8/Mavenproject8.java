package com.mycompany.mavenproject8;

import java.util.LinkedList;

/*8-LinkedList Dinámica: Emplea una LinkedList para agregar elementos en posiciones 
específicas y luego eliminarlos, mostrando la lista antes y después.*/
public class Mavenproject8 {

    public static void main(String[] args) {
        // Crear una LinkedList de enteros
        LinkedList<Integer> numeros = new LinkedList<>();

        // Agregar elementos al final de la lista
        numeros.add(10);
        numeros.add(30);
        numeros.add(50);

        // Insertar elementos en posiciones específicas
        numeros.add(1, 20); // Inserta 20 en la posición 1
        numeros.add(3, 40); // Inserta 40 en la posición 3

        // Mostrar la lista después de las inserciones
        System.out.println("Lista después de agregar elementos: " + numeros);

        // Eliminar elementos por posición
        numeros.remove(2); // Elimina el elemento en la posición 2
        numeros.removeFirst(); // Elimina el primer elemento
        numeros.removeLast(); // Elimina el último elemento

        // Mostrar la lista después de las eliminaciones
        System.out.println("Lista después de eliminar elementos: " + numeros);
    }
}
