package com.mycompany.mavenproject6;

public class Persona {
    private String nombre;
    private int edad;

    // Constructor con parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre; // "this.nombre" se refiere al atributo de la clase
        this.edad = edad;     // "this.edad" se refiere al atributo de la clase
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre + ", Edad: " + this.edad);
    }

    // Método para actualizar la edad usando this
    public void actualizarEdad(int edad) {
        this.edad = edad; // "this.edad" es el atributo, "edad" es el parámetro
        System.out.println("Edad actualizada a: " + this.edad);
    }
}
