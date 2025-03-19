package com.mycompany.mavenproject17;

/*17-Contar Vocales: Crea un programa que cuente el número de vocales 
en una cadena utilizando un bucle for-each.*/
public class Mavenproject17 {

    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                contador++;
            }
        }
        System.out.println("El número de vocales en la cadena es: " + contador);
    }
}
