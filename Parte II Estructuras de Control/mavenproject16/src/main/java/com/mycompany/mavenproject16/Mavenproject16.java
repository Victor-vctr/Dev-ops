package com.mycompany.mavenproject16;

import java.util.Scanner;

/*16-Validación de Contraseña: Emplea un do-while para solicitar una contraseña 
de al menos 6 caracteres hasta que se cumpla la condición.*/
public class Mavenproject16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        do {
            System.out.println("Introduce una contraseña de al menos 6 caracteres:");
            password = scanner.nextLine();
        } while (password.length() < 6);
        System.out.println("Contraseña válida.");
    }
}
