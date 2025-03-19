/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject11;

/**
 *
 * @author dev-ops
 */
public class Gerente extends Empleado{
    private double bonus;

    // Constructor
    public Gerente(String nombre, double salario, double bonus) {
        super(nombre, salario); // Llamada al constructor de la superclase
        this.bonus = bonus;
    }

    // Método para obtener el salario total (salario base + bonus)
    public double calcularSalarioTotal() {
        return salario + bonus;
    }

    // Sobreescribir el método para incluir el bonus
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llamar al método de la superclase
        System.out.println("Bonus: $" + bonus);
        System.out.println("Salario Total: $" + calcularSalarioTotal());
    }
}
