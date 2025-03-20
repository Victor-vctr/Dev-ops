package com.mycompany.mavenproject22;

/*22-Clase Interna: Implementa una clase interna dentro de una clase 
principal para encapsular una funcionalidad específica (por ejemplo, un iterador personalizado).*/
public class Mavenproject22 {

    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        Contenedor.Iterador iterador = contenedor.obtenerIterador();

        // Usamos el iterador para recorrer el arreglo
        while (iterador.tieneSiguiente()) {
            System.out.println("Elemento: " + iterador.siguiente());
        }
    }
}
