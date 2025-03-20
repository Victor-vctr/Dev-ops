package com.mycompany.mavenproject24;

public class Casa extends Inmueble {
    private int numeroHabitaciones;
    private boolean tieneJardin;

    public Casa(String direccion, double precio, int numeroHabitaciones, boolean tieneJardin) {
        super(direccion, precio);
        this.numeroHabitaciones = numeroHabitaciones;
        this.tieneJardin = tieneJardin;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de habitaciones: " + numeroHabitaciones);
        System.out.println("Tiene jardín: " + (tieneJardin ? "Sí" : "No"));
    }
}
