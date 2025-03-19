package com.mycompany.mavenproject19;

/*19-Factorial: Emplea un bucle for para calcular el factorial de un número 
ingresado.*/
public class Mavenproject19 {

    public static void main(String[] args) {
        int numero = 5;
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
