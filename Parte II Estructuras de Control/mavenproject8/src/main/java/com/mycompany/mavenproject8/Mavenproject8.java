package com.mycompany.mavenproject8;
/*8-Uso de Break: Emplea break en un bucle para salir cuando se encuentre un 
número específico (por ejemplo, 25). */
import java.util.Scanner;

public class Mavenproject8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bucle que imprime números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            
            // Si el número es 25, se detiene el bucle
            if (i == 25) {
                System.out.println("Se encontró el número 25, deteniendo el bucle.");
                break;
            }
        }
    }
}
