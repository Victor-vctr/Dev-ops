package com.mycompany.mavenproject27;

public class Calculadora {
    
    // Suma de dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Suma de dos números decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    // Resta de dos enteros
    public int restar(int a, int b) {
        return a - b;
    }

    // Resta de dos números decimales
    public double restar(double a, double b) {
        return a - b;
    }

    // Multiplicación de dos enteros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Multiplicación de dos números decimales
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // División de dos enteros (maneja división por cero)
    public double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return Double.NaN; // Devuelve NaN si la división no es válida
        }
        return (double) a / b;
    }

    // División de dos números decimales
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return Double.NaN;
        }
        return a / b;
    }
}
