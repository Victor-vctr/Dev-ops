
package com.mycompany.mavenproject13;

public class Estudiante {
    
    protected String nombre;
    protected int edad;
    protected String identificacion;

    // Constructor
    public Estudiante(String nombre, int edad, String identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    // Método para mostrar información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("ID: " + identificacion);
    }
}
