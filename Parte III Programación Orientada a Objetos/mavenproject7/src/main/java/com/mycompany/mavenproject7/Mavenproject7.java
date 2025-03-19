package com.mycompany.mavenproject7;

/*7-Cuenta Bancaria: Diseña una clase CuentaBancaria con métodos para depositar,
 retirar y consultar el saldo.*/
public class Mavenproject7 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000);

        cuenta.consultarSaldo();
        cuenta.depositar(500);
        cuenta.retirar(300);
        cuenta.retirar(1500); // Intento de retiro con fondos insuficientes
        cuenta.consultarSaldo();
    }
}
