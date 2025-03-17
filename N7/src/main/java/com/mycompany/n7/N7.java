package com.mycompany.n7;

/*7-Par o Impar: Desarrolla un programa que determine si un número ingresado 
por el usuario es par o impar.*/
public class N7 {

    public static void main(String[] args) {
        int num = 10;
        
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par.");
        } else {
            System.out.println("El número " + num + " es impar.");
        }
    }
}
