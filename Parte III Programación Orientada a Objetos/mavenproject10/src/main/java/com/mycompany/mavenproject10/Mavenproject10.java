package com.mycompany.mavenproject10;

/*10-Implementación de Interfaces: Crea una interfaz Volador con un método volar() 
y una clase Ave que la implemente.*/
public class Mavenproject10 {

    public static void main(String[] args) {
        Ave aguila = new Ave("Águila");
        aguila.volar(); // Llamada al método volar() de la interfaz
    }
}
