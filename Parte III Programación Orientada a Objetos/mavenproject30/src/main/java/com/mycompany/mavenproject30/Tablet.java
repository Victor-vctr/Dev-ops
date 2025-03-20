package com.mycompany.mavenproject30;

public class Tablet extends Dispositivo{
    public Tablet(String marca) {
        super(marca);
    }

    @Override
    public void encender() {
        System.out.println("La tablet " + marca + " está encendiéndose...");
    }
}
