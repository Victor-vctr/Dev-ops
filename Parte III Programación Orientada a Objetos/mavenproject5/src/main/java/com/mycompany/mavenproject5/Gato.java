package com.mycompany.mavenproject5;

public class Gato extends Animal {
    
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " dice: ¡Miau, miau!");
    }
}
