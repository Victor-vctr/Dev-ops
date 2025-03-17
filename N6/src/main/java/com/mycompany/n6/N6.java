package com.mycompany.n6;

/*6-Operadores Lógicos: Escribe una expresión que combine operadores 
lógicos (&&, ||, !) para determinar i dos condiciones se cumplen simultáneamente.*/
public class N6 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        
        boolean resultado = num1 > num2 && num1 < num2;
        System.out.println("Resultado: " + resultado);
        
        boolean resultado2 = num1 > num2 || num1 < num2;
        System.out.println("Resultado: " + resultado2);
        
        boolean resultado3 = !(num1 > num2);
        System.out.println("Resultado: " + resultado3);
    }
}
