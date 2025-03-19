package com.mycompany.mavenproject5;

public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " dice: ¡Guau, guau!");
    }
    
}
