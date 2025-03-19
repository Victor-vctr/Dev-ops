package com.mycompany.mavenproject18;

/*18-Números Primos: Utiliza un bucle while para contar cuántos números primos 
existen en un rango dado (por ejemplo, 1-100)*/
public class Mavenproject18 {

    public static void main(String[] args) {
        int inicio = 1;
        int fin = 100;
        int contador = 0;

        while (inicio <= fin) {
            if (esPrimo(inicio)) {
                contador++;
            }
            inicio++;
        }

        System.out.println("Cantidad de números primos entre " + inicio + " y " + fin + ": " + contador);
    }
}
