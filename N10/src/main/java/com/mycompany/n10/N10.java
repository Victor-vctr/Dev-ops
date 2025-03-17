package com.mycompany.n10;

/*10-Casting Explícito: Realiza un casting explícito de un double a int 
y explica en comentarios qué ocurre con el valor decimal.*/
public class N10 {

    public static void main(String[] args) {
        double doble = 10.5;
        int entero = (int) doble;
        System.out.println("Doble: " + doble);
        System.out.println("Entero: " + entero);
        
        // El valor decimal se pierde, ya que el casting de double a int
        // elimina la parte decimal del número.
    }
}
