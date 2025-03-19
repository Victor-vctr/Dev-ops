package com.mycompany.mavenproject11;

public class Empleado {
    protected String nombre;
    protected double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método para obtener información del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}
