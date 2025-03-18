package com.mycompany.mavenproject7;

import java.util.Scanner;

/*7-Do-While con Validación: Implementa un do-while que solicite al usuario 
ingresar un número hasta que sea mayor a 0.*/
public class Mavenproject7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Por favor, ingrese un número mayor a 0: ");
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("El número ingresado no es válido. Intente nuevamente.");
            }
        } while (number <= 0);

        System.out.println("Número válido ingresado: " + number);
    }
}
