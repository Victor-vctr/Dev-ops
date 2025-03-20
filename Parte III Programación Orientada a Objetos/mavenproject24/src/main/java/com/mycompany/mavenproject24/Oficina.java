package com.mycompany.mavenproject24;

public class Oficina extends Inmueble{
    private int capacidadPersonas;
    private boolean tieneSalaReuniones;

    public Oficina(String direccion, double precio, int capacidadPersonas, boolean tieneSalaReuniones) {
        super(direccion, precio);
        this.capacidadPersonas = capacidadPersonas;
        this.tieneSalaReuniones = tieneSalaReuniones;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de personas: " + capacidadPersonas);
        System.out.println("Tiene sala de reuniones: " + (tieneSalaReuniones ? "Sí" : "No"));
    }
}
