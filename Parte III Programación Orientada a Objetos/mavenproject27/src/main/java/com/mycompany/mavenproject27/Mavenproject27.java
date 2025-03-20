package com.mycompany.mavenproject27;

/*27-Calculadora con Sobrecarga: Implementa una clase Calculadora con 
métodos sobrecargados para realizar sumas, restas, multiplicaciones y 
divisiones con distintos tipos de parámetros.*/
public class Mavenproject27 {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Probando los métodos sobrecargados
        System.out.println("Suma de enteros: " + calc.sumar(5, 3));
        System.out.println("Suma de decimales: " + calc.sumar(5.5, 3.2));

        System.out.println("Resta de enteros: " + calc.restar(10, 4));
        System.out.println("Resta de decimales: " + calc.restar(10.5, 4.3));

        System.out.println("Multiplicación de enteros: " + calc.multiplicar(6, 4));
        System.out.println("Multiplicación de decimales: " + calc.multiplicar(6.5, 4.2));

        System.out.println("División de enteros: " + calc.dividir(8, 2));
        System.out.println("División de decimales: " + calc.dividir(8.4, 2.1));
        System.out.println("División por cero: " + calc.dividir(10, 0)); // Prueba de manejo de error
    
    }
}
