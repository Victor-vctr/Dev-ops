package com.mycompany.mavenproject6;

/*6-Uso de this: En una clase, demuestra el uso de this para diferenciar entre 
variables de instancia y parámetros del constructor.*/
public class Mavenproject6 {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos", 25);
        persona1.mostrarInformacion();

        persona1.actualizarEdad(30); // Usamos this para actualizar la edad
        persona1.mostrarInformacion();
    }
}
