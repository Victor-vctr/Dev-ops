package com.mycompany.mavenproject30;
/*30-Jerarquía de Dispositivos: Diseña una jerarquía de clases para 
dispositivos electrónicos (por ejemplo, Dispositivo → Smartphone, Tablet,
Laptop) y demuestra polimorfismo en un método que los encienda.*/
public class Mavenproject30 {

    public static void main(String[] args) {
        // Arreglo de dispositivos
        Dispositivo[] dispositivos = {
            new Smartphone("Samsung"),
            new Tablet("Apple"),
            new Laptop("Dell")
        };

        // Recorrer el arreglo y encender cada dispositivo (Polimorfismo)
        for (Dispositivo dispositivo : dispositivos) {
            dispositivo.encender();
        }
    }
}
