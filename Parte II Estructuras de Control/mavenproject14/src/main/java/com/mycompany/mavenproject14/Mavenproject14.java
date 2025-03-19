package com.mycompany.mavenproject14;

import java.util.Scanner;

/*14-Menú con Switch: Crea un menú interactivo con un switch que permita al 
usuario elegir entre diferentes opciones y ejecutar acciones.*/
public class Mavenproject14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Salir");
            System.out.print("Por favor, seleccione una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("¡Hola!");
                    break;
                case 2:
                    System.out.println("¡Adiós!");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (option != 3);
    }
}
