package com.mycompany.mavenproject8;

/*8-Variable Estática: Declara una variable estática en la clase 
CuentaBancaria para contar cuántas cuentas se han creado y muéstrala en consola.*/
public class Mavenproject8 {

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Ana Gómez", 1500);
        CuentaBancaria cuenta3 = new CuentaBancaria("Carlos Ruiz", 2000);

        cuenta1.consultarSaldo();
        cuenta2.depositar(500);
        cuenta3.retirar(300);

        // Mostrar total de cuentas creadas
        System.out.println("Total de cuentas creadas: " + CuentaBancaria.getTotalCuentas());
    }
}
