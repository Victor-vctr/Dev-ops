package com.mycompany.mavenproject10;

/*10-Recorrido de Array: Crea un array de enteros y recórrelo con un bucle 
for-each para sumar sus elementos.*/
public class Mavenproject10 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int suma = 0;
        for (int i : array) {
            suma += i;
        }
        System.out.println("La suma de los elementos del array es: " + suma);
    }
}
