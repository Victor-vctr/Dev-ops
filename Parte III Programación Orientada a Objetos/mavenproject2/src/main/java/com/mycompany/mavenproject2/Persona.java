package com.mycompany.mavenproject2;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    // Constructor 1: Sin parámetros (valores por defecto)
    public Persona() {
        this.nombre = "Desconocido";
        this.apellido = "Desconocido";
        this.edad = 0;
    }

    // Constructor 2: Con nombre y apellido
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = 0; // Edad por defecto
    }

    // Constructor 3: Con nombre, apellido y edad
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Método para mostrar la información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellido + ", Edad: " + edad);
    }
}
