package com.mycompany.mavenproject20;

/*20-Sobrecarga de Métodos: Define una clase con varios métodos 
sobrecargados que realicen la suma de números enteros, decimales y 
de cadenas (concatenación).*/
public class Mavenproject20 {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Pruebas de sobrecarga
        System.out.println("Suma de enteros (2 + 3): " + calc.sumar(2, 3));
        System.out.println("Suma de enteros (1 + 2 + 3): " + calc.sumar(1, 2, 3));
        System.out.println("Suma de decimales (2.5 + 3.7): " + calc.sumar(2.5, 3.7));
        System.out.println("Suma de decimales (1.1 + 2.2 + 3.3): " + calc.sumar(1.1, 2.2, 3.3));
        System.out.println("Concatenación de cadenas (\"Hola\" + \" Mundo\"): " + calc.sumar("Hola", " Mundo"));
    }
}
