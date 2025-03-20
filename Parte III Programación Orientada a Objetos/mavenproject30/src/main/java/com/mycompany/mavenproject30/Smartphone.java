package com.mycompany.mavenproject30;

public class Smartphone extends Dispositivo{
    public Smartphone(String marca) {
        super(marca);
    }

    @Override
    public void encender() {
        System.out.println("El smartphone " + marca + " está encendiéndose...");
    }
}
