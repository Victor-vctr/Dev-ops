package com.mycompany.mavenproject29;

/*29-Método toString(): Crea una clase Registro y sobreescribe el método 
toString() para mostrar de forma clara el estado de sus atributos.*/
public class Mavenproject29 {

    public static void main(String[] args) {
        // Crear una instancia de Registro
        Registro usuario1 = new Registro("Juan Pérez", 25, "juanperez@email.com");
        Registro usuario2 = new Registro("María López", 30, "marialopez@email.com");

        // Imprimir los objetos, toString() se llama automáticamente
        System.out.println(usuario1);
        System.out.println(usuario2);
    }
}
