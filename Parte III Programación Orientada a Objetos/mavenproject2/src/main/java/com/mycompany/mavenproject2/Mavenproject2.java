package com.mycompany.mavenproject2;

/*2-Sobrecarga de Constructores: Amplía la clase Persona implementando al menos 
dos constructores con diferentes parámetros.*/
public class Mavenproject2 {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Juan", "Pérez");
        Persona persona3 = new Persona("María", "Gómez", 25);

        persona1.mostrarInformacion();
        persona2.mostrarInformacion();
        persona3.mostrarInformacion();
    }
}
