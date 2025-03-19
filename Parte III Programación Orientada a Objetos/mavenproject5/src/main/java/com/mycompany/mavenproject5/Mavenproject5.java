package com.mycompany.mavenproject5;

/*5-Herencia de Animales: Define una clase Animal con un 
método emitirSonido() y crea subclases Perro y Gato que sobreescriban dicho método.*/
public class Mavenproject5 {

    public static void main(String[] args) {
        Animal miPerro = new Perro("Firulais");
        Animal miGato = new Gato("Misu");

        miPerro.emitirSonido(); // Firulais dice: ¡Guau, guau!
        miGato.emitirSonido();  // Misu dice: ¡Miau, miau!
    }
}
