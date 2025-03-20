package com.mycompany.mavenproject24;

/*24-Herencia de Inmuebles: Diseña una clase Inmueble y extiéndela para 
crear subclases como Casa, Apartamento y Oficina, cada una con atributos 
propios.*/
public class Mavenproject24 {

    public static void main(String[] args) {
        Casa casa = new Casa("Calle 123", 150000, 3, true);
        Apartamento apartamento = new Apartamento("Av. Principal 456", 90000, 5, true);
        Oficina oficina = new Oficina("Centro de Negocios 789", 200000, 50, true);

        System.out.println("Información de la Casa:");
        casa.mostrarInfo();

        System.out.println("\nInformación del Apartamento:");
        apartamento.mostrarInfo();

        System.out.println("\nInformación de la Oficina:");
        oficina.mostrarInfo();
    }
}
