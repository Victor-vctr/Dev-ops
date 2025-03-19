package com.mycompany.mavenproject3;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    // Constructor por defecto
    public Persona() {
        this.nombre = "Desconocido";
        this.apellido = "Desconocido";
        this.edad = 0;
    }

    // Constructor con nombre y apellido
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = 0; // Edad por defecto
    }

    // Constructor con todos los atributos
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Getters (Métodos para obtener valores)
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    // Setters (Métodos para modificar valores)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        if (edad >= 0) { // Validación simple
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // Método para mostrar la información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellido + ", Edad: " + edad);
    }
}
