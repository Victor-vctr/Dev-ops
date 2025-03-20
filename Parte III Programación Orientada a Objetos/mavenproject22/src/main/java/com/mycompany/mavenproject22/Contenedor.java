package com.mycompany.mavenproject22;

public class Contenedor {
    private int[] numeros = {1, 2, 3, 4, 5}; // Arreglo de números

    // Clase interna Iterador
    class Iterador {
        private int indice = 0; // Índice para recorrer el arreglo

        // Método para verificar si hay más elementos
        public boolean tieneSiguiente() {
            return indice < numeros.length;
        }

        // Método para obtener el siguiente elemento
        public int siguiente() {
            if (tieneSiguiente()) {
                return numeros[indice++];
            } else {
                throw new RuntimeException("No hay más elementos.");
            }
        }
    }

    // Método para obtener una instancia del Iterador
    public Iterador obtenerIterador() {
        return new Iterador();
    }
}
