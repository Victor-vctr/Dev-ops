package com.mycompany.mavenproject17;


public class Coche extends Vehiculo{
    private int numPuertas;

    // Constructor
    public Coche(String marca, String modelo, int año, int numPuertas) {
        super(marca, modelo, año); // Llamada al constructor de la superclase
        this.numPuertas = numPuertas;
    }

    // Método específico para Coche
    public void abrirMaletero() {
        System.out.println("Abriendo el maletero del coche...");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numPuertas);
    }
}
