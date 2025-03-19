package com.mycompany.mavenproject11;

/*11-Herencia en Empleados: Crea una clase Empleado y luego extiéndela para crear 
una clase Gerente que incluya un atributo extra, como bonus.*/
public class Mavenproject11 {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos Pérez", 2000);
        Gerente gerente1 = new Gerente("Ana Gómez", 3000, 1000);

        System.out.println("Información del Empleado:");
        empleado1.mostrarInformacion();
        System.out.println();

        System.out.println("Información del Gerente:");
        gerente1.mostrarInformacion();
    }
}
