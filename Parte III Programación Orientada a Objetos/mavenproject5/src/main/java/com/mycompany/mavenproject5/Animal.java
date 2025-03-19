package com.mycompany.mavenproject5;

public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método que será sobrescrito por las subclases
    public void emitirSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
