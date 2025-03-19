package com.mycompany.mavenproject16;

/*16-Clase Libro: Crea una clase Libro con atributos titulo, autor y 
precio. Instancia varios objetos y muestra sus datos.*/
public class Mavenproject16 {

    public static void main(String[] args) {
        // Crear instancias de libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 19.99);
        Libro libro2 = new Libro("1984", "George Orwell", 14.50);
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", 9.99);

        // Mostrar información de los libros
        System.out.println("Información de los Libros:");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();
    }
}
