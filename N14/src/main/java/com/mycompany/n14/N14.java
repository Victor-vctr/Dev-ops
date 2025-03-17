package com.mycompany.n14;

/*14-Expresión Compuesta: Crea una expresión que combine operadores 
aritméticos y relacionales y muestra su resultado.*/
public class N14 {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 15;
        
        // Expresión compuesta
        boolean resultado = a + b < c;
        System.out.println("Resultado: " + resultado);
    }
}
