package com.mycompany.mavenproject17;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    // Constructor
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Método para mostrar información del vehículo
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }

    // Método común para arrancar
    public void arrancar() {
        System.out.println("El vehículo está arrancando...");
    }
}
