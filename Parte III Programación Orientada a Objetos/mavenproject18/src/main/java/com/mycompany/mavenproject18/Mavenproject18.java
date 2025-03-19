package com.mycompany.mavenproject18;

/*18-Arreglo de Animales: Crea un arreglo de objetos de tipo Animal y recórrelo para llamar al método sobreescrito emitirSonido()*/
public class Mavenproject18 {

    public static void main(String[] args) {
        // Crear un arreglo de objetos de tipo Animal
        Animal[] animales = {
            new Perro("Rex"),
            new Gato("Whiskers"),
            new Perro("Bruno"),
            new Gato("Mimi"),
            new Perro("Luna")
        };

        // Recorrer el arreglo y llamar a emitirSonido()
        System.out.println("🎵 Los animales hacen ruido:");
        for (Animal animal : animales) {
            animal.emitirSonido();
        }
    }
}
