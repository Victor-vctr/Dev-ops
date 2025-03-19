package com.mycompany.mavenproject19;


public class Coche extends Vehiculo{
    public Coche(String marca) {
        super(marca);
    }

    // ❌ ERROR: No se puede sobrescribir un método final
    /*
    @Override
    public void arrancar() {
        System.out.println("El coche está arrancando con estilo deportivo...");
    }
    */
}
