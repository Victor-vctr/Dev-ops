package com.mycompany.mavenproject13;

/*13-Herencia en Estudiantes: Crea una clase Estudiante y define subclases 
(por ejemplo, EstudianteUniversitario) que añadan atributos o métodos específicos.*/
public class Mavenproject13 {

    public static void main(String[] args) {
        // Crear un estudiante genérico
        Estudiante estudiante1 = new Estudiante("Juan Pérez", 18, "STU12345");

        // Crear un estudiante universitario
        EstudianteUniversitario estudiante2 = new EstudianteUniversitario("Ana Gómez", 21, "UNI67890", "Ingeniería Informática", 5);

        System.out.println("Información del Estudiante:");
        estudiante1.mostrarInformacion();
        System.out.println();

        System.out.println("Información del Estudiante Universitario:");
        estudiante2.mostrarInformacion();
        estudiante2.estudiar();
    }
}
