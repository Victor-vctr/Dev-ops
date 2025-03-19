package com.mycompany.mavenproject9;

/*9-Clases Abstractas: Define una clase abstracta Figura con un método abstracto 
calcularArea(), y crea las clases Circulo y Rectangulo que la implementen.*/
public class Mavenproject9 {

    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}
