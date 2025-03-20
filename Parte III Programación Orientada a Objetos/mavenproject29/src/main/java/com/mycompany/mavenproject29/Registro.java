package com.mycompany.mavenproject29;

public class Registro {
    private String nombre;
    private int edad;
    private String correo;

    // Constructor
    public Registro(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    // Sobrescribimos el método toString()
    @Override
    public String toString() {
        return "Registro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                '}';
    }
}
