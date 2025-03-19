package com.mycompany.mavenproject19;

/*19-Método Final: Crea una clase con un método marcado como final y 
explica por qué no se puede sobreescribir.*/
public class Mavenproject19 {

    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota");
        miCoche.arrancar(); // Llama al método final de la superclase
    }
}
