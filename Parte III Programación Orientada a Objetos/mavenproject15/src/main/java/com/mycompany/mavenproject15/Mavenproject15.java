package com.mycompany.mavenproject15;

/*15-Método Estático: Define una clase MathUtil con un método estático 
para calcular el máximo común divisor (MCD) entre dos números.*/
public class Mavenproject15 {

    public static void main(String[] args) {
        // Prueba del método estático calcularMCD
        int numero1 = 56, numero2 = 98;
        int mcd = MathUtil.calcularMCD(numero1, numero2);

        System.out.println("El MCD de " + numero1 + " y " + numero2 + " es: " + mcd);

    }
}
