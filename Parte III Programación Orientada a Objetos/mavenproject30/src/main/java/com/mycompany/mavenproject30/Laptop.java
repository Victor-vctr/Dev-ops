package com.mycompany.mavenproject30;

public class Laptop extends Dispositivo{
    public Laptop(String marca) {
        super(marca);
    }

    @Override
    public void encender() {
        System.out.println("La laptop " + marca + " está encendiéndose...");
    }
}
