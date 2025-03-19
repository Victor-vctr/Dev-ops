package com.mycompany.mavenproject17;

/*17-Jerarquía de Vehículos: Crea una jerarquía de clases para vehículos 
(por ejemplo, Vehiculo → Coche y Camion) e implementa métodos comunes.*/
public class Mavenproject17 {

    public static void main(String[] args) {
        // Crear instancias de Coche y Camion
        Coche miCoche = new Coche("Toyota", "Corolla", 2022, 4);
        Camion miCamion = new Camion("Volvo", "FH16", 2020, 18.5);

        // Mostrar información y probar métodos
        System.out.println("🚗 Información del Coche:");
        miCoche.mostrarInformacion();
        miCoche.arrancar();
        miCoche.abrirMaletero();
        System.out.println();

        System.out.println("🚛 Información del Camión:");
        miCamion.mostrarInformacion();
        miCamion.arrancar();
        miCamion.cargarMercancia();
    }
}
