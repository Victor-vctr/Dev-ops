package com.mycompany.mavenproject13;

/*13-Suma con While: Realiza la suma de los números del 1 al 100 utilizando un 
bucle while.*/
public class Mavenproject13 {

    public static void main(String[] args) {
        int i = 1;
        int suma = 0;
        while (i <= 100) {
            suma += i;
            i++;
        }
        System.out.println("La suma de los números del 1 al 100 es: " + suma);
    }
}
