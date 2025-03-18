package com.mycompany.mavenproject9;

/*9-Uso de Continue: Usa continue para saltar la impresión de números pares 
dentro de un bucle.*/
public class Mavenproject9 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
