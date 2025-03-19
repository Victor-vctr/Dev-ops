package com.mycompany.mavenproject18;


public class Perro extends Animal{
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " dice: ¡Guau, guau!");
    }
}
