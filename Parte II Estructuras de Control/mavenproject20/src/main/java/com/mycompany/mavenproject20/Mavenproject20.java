package com.mycompany.mavenproject20;

/*20-Validación de Datos: Desarrolla un programa que utilice estructuras de 
control para validar la entrada de datos y manejar entradas erróneas.*/
public class Mavenproject20 {

    public static void main(String[] args) {
        int numero = 0;
        boolean valido = false;
        while (!valido) {
            try {
                numero = Integer.parseInt(args[0]);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un número entero.");
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Introduce un número entero.");
                break;
            }
        }
        System.out.println("Número: " + numero);
    }
}
