package com.mycompany.mavenproject12;

/*12-Recorrido de String: Usa un bucle for para recorrer un String carácter por 
carácter y mostrar cada uno.*/
public class Mavenproject12 {

    public static void main(String[] args) {
        String text = "Hola Mundo!";
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
