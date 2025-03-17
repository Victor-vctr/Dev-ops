package com.mycompany.n5;

/*5-Conversión de Tipos: Convierte un valor int a double y luego realiza el 
proceso inverso mediante casting.*/
public class N5 {

    public static void main(String[] args) {
        int entero = 10;
        double doble = (double) entero;
        System.out.println("Entero: " + entero);
        System.out.println("Doble: " + doble);
        
        double doble2 = 10.5;
        int entero2 = (int) doble2;
        System.out.println("Doble: " + doble2);
        System.out.println("Entero: " + entero2);
    }
}
