package com.mycompany.n20;

/*20-Entrada del Usuario: Crea un programa que solicite dos 
números al usuario, sume sus valores y muestre el resultado.*/
public class N20 {

    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = teclado.nextInt();
        
        int suma = num1 + num2;
        System.out.println("La suma de los números es: " + suma);
    }
}
