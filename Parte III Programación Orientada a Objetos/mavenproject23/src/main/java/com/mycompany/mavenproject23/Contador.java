package com.mycompany.mavenproject23;

public class Contador {
    private int cuenta; // Variable privada para almacenar el contador

    // Constructor para inicializar el contador en 0
    public Contador() {
        this.cuenta = 0;
    }

    // Método para incrementar y mostrar el contador
    public void incrementar() {
        cuenta++; // Incrementa el valor
        System.out.println("Contador actual: " + cuenta);
    }
}
