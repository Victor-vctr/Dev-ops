package com.mycompany.mavenproject19;


public class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // Método final que NO puede ser sobrescrito en subclases
    public final void arrancar() {
        System.out.println("El vehículo de marca " + marca + " está arrancando...");
    }
}
