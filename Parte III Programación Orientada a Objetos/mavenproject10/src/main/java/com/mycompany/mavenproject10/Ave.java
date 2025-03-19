package com.mycompany.mavenproject10;

public class Ave implements Volador{
    private String nombre;

    // Constructor
    public Ave(String nombre) {
        this.nombre = nombre;
    }

    // Implementación del método volar()
    @Override
    public void volar() {
        System.out.println(nombre + " está volando alto en el cielo.");
    }
}
