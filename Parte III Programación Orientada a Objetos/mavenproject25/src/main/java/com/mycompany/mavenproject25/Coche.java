package com.mycompany.mavenproject25;

public class Coche extends Vehiculo{
    private int velocidadMaxima;

    // Constructor de la subclase que usa super() para llamar al constructor de la clase padre
    public Coche(String marca, int velocidadMaxima) {
        super(marca); // Llama al constructor de Vehiculo
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método que usa super para llamar al método de la clase padre
    public void mostrarDetalles() {
        super.mostrarInfo(); // Llama al método de la clase padre
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}
