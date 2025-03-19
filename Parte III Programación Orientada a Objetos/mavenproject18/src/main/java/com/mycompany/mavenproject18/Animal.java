package com.mycompany.mavenproject18;

abstract public class Animal {
    protected String nombre;

    // Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que será sobrescrito por las subclases
    public abstract void emitirSonido();
}
