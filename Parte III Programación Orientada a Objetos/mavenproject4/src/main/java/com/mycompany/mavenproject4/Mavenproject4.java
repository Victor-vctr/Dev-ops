package com.mycompany.mavenproject4;

/*4-Clase Coche: Crea una clase Coche con atributos como 
marca, modelo y velocidad. Incluye métodos para acelerar y frenar.*/
public class Mavenproject4 {

    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla");

        miCoche.mostrarInformacion();
        miCoche.acelerar(50);
        miCoche.acelerar(20);
        miCoche.frenar(30);
        miCoche.frenar(50); // Esto pondrá la velocidad en 0

        miCoche.mostrarInformacion();
    }
}
