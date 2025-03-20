package com.mycompany.mavenproject2;
import java.util.HashSet;

/*2-HashSet sin Duplicados: Usa un HashSet para almacenar nombres, intenta agregar duplicados
y muestra el conjunto final.*/
public class Mavenproject2 {

    public static void main(String[] args) {
        // Crear un HashSet de nombres
        HashSet<String> nombres = new HashSet<>();

        // Agregar nombres al HashSet
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Pedro");

        // Intentar agregar duplicados
        nombres.add("Juan");
        nombres.add("Ana");

        // Mostrar el contenido del HashSet
        System.out.println("Nombres en el HashSet:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
