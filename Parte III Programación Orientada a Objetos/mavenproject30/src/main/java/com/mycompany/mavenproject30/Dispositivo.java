package com.mycompany.mavenproject30;

public abstract class Dispositivo {
    protected String marca;

    // Constructor
    public Dispositivo(String marca) {
        this.marca = marca;
    }

    // Método abstracto para encender (será sobreescrito en las subclases)
    public abstract void encender();
}
