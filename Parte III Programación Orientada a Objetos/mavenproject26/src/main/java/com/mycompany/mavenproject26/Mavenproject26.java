package com.mycompany.mavenproject26;

/*26-Interfaces Múltiples: Crea una clase AnimalMulti que implemente dos 
interfaces, por ejemplo, Nadador y Corredor, definiendo métodos para cada 
comportamiento.*/
public class Mavenproject26 {

    public static void main(String[] args) {
        AnimalMulti animal = new AnimalMulti();
        
        // Llamando a los métodos de ambas interfaces
        animal.nadar();
        animal.correr();
    }
}
