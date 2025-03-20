package com.mycompany.mavenproject24;

public class Apartamento extends Inmueble{
    private int piso;
    private boolean tieneAscensor;

    public Apartamento(String direccion, double precio, int piso, boolean tieneAscensor) {
        super(direccion, precio);
        this.piso = piso;
        this.tieneAscensor = tieneAscensor;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Piso: " + piso);
        System.out.println("Tiene ascensor: " + (tieneAscensor ? "Sí" : "No"));
    }
}
