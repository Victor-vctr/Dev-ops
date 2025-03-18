package com.mycompany.mavenproject4;

/*4-Clasificación por Edad: Emplea if-else anidados para clasificar la edad en 
categorías (niño, adolescente, adulto, anciano).*/
public class Mavenproject4 {

    public static void main(String[] args) {
        int edad = 20;
        if (edad < 13) {
            System.out.println("Niño");
        } else if (edad < 18) {
            System.out.println("Adolescente");
        } else if (edad < 65) {
            System.out.println("Adulto");
        } else {
            System.out.println("Anciano");
        }
    }
}
