package com.mycompany.mavenproject15;

public class MathUtil {
    // Método estático para calcular el MCD usando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Asegura que el resultado sea positivo
    }
}
