package com.mycompany.mavenproject17;

public class Camion extends Vehiculo {
    private double capacidadCarga; // en toneladas

    // Constructor
    public Camion(String marca, String modelo, int año, double capacidadCarga) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    // Método específico para Camión
    public void cargarMercancia() {
        System.out.println("Cargando mercancía en el camión...");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
    }
}
