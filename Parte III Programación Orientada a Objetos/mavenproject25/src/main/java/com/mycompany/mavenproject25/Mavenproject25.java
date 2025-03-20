package com.mycompany.mavenproject25;

/*25-Uso de super: En una subclase, utiliza super para llamar al 
constructor y a un método de la clase padre.*/
public class Mavenproject25 {

    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", 220);
        miCoche.mostrarDetalles(); // Llama al método que usa super
    }
}
