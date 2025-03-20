package com.mycompany.mavenproject21;

/*21-Patrón Singleton: Crea una clase con un constructor privado y un 
método estático que devuelva una única instancia de la clase.*/
public class Mavenproject21 {

    public static void main(String[] args) {
        // Intentamos crear varias instancias
        Singleton obj1 = Singleton.getInstancia();
        Singleton obj2 = Singleton.getInstancia();

        // Llamamos a un método de la instancia
        obj1.mostrarMensaje();

        // Verificamos que ambas referencias son la misma instancia
        if (obj1 == obj2) {
            System.out.println("Ambas variables apuntan a la misma instancia de Singleton.");
        } else {
            System.out.println("Se han creado múltiples instancias (¡Error!).");
        }
    }
}
