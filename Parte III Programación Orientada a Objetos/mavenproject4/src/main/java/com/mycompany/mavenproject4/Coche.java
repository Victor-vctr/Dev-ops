package com.mycompany.mavenproject4;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    // Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0; // El coche inicia detenido
    }

    // Método para acelerar
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidad += incremento;
            System.out.println("El coche ha acelerado. Velocidad actual: " + velocidad + " km/h");
        } else {
            System.out.println("El incremento de velocidad debe ser positivo.");
        }
    }

    // Método para frenar
    public void frenar(int decremento) {
        if (decremento > 0) {
            velocidad -= decremento;
            if (velocidad < 0) {
                velocidad = 0; // La velocidad no puede ser negativa
            }
            System.out.println("El coche ha frenado. Velocidad actual: " + velocidad + " km/h");
        } else {
            System.out.println("El decremento de velocidad debe ser positivo.");
        }
    }

    // Método para mostrar información del coche
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Velocidad: " + velocidad + " km/h");
    }
}
