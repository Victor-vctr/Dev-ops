package com.mycompany.mavenproject26;

public class AnimalMulti implements Nadador, Corredor {
    @Override
    public void nadar() {
        System.out.println("El animal está nadando rápidamente.");
    }

    @Override
    public void correr() {
        System.out.println("El animal está corriendo velozmente.");
    }
}
