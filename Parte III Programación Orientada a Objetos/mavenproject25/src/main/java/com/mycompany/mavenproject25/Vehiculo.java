package com.mycompany.mavenproject25;

public class Vehiculo {
    protected String marca;

    // Constructor de la clase padre
    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // Método de la clase padre
    public void mostrarInfo() {
        System.out.println("Marca del vehículo: " + marca);
    }
}
