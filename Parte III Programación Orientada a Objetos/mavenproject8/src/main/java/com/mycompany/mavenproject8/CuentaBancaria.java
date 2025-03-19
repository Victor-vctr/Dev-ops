package com.mycompany.mavenproject8;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private static int totalCuentas = 0; // Variable estática para contar cuentas

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        totalCuentas++; // Incrementa el contador de cuentas creadas
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que 0.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else if (cantidad > saldo) {
            System.out.println("Fondos insuficientes. Saldo disponible: $" + saldo);
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que 0.");
        }
    }

    // Método para consultar el saldo
    public void consultarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }

    // Método estático para obtener el total de cuentas creadas
    public static int getTotalCuentas() {
        return totalCuentas;
    }

}
