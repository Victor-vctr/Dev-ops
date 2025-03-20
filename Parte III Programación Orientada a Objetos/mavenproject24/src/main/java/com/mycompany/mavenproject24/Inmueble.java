package com.mycompany.mavenproject24;

public class Inmueble {
    protected String direccion;
    protected double precio;

    // Constructor
    public Inmueble(String direccion, double precio) {
        this.direccion = direccion;
        this.precio = precio;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Dirección: " + direccion);
        System.out.println("Precio: $" + precio);
    }
}
