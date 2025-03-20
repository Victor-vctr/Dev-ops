package com.mycompany.mavenproject21;

public class Singleton {
    // Instancia única de la clase (se inicializa en null)
    private static Singleton instancia;

    // Constructor privado para evitar instanciación externa
    private Singleton() {
        System.out.println("Instancia de Singleton creada.");
    }

    // Método estático para obtener la única instancia
    public static Singleton getInstancia() {
        if (instancia == null) { // Se crea solo si aún no existe
            instancia = new Singleton();
        }
        return instancia;
    }

    // Método de ejemplo
    public void mostrarMensaje() {
        System.out.println("Método de Singleton llamado.");
    }
}
