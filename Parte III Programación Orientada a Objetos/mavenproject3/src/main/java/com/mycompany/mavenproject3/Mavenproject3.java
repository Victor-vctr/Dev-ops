package com.mycompany.mavenproject3;

/*3-Getters y Setters: Agrega métodos getters y setters a 
la clase Persona para controlar el acceso a sus atributos.*/
public class Mavenproject3 {

    public static void main(String[] args) {
        Persona persona = new Persona("Ana", "Martínez", 30);
        persona.mostrarInformacion(); // Muestra los datos iniciales

        // Modificar valores con setters
        persona.setNombre("Carlos");
        persona.setApellido("López");
        persona.setEdad(25);

        // Mostrar datos actualizados
        persona.mostrarInformacion();
    }
}
