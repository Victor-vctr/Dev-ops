package com.mycompany.mavenproject15;

/*15-Patrón de Asteriscos: Usa bucles anidados para imprimir un patrón en forma 
de triángulo con asteriscos.*/
public class Mavenproject15 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
