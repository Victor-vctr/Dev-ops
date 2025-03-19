package com.mycompany.mavenproject14;

/*14-Polimorfismo Básico: Crea un método que acepte un objeto de tipo Animal 
y llame al método emitirSonido(), demostrando polimorfismo con objetos Perro y Gato.*/
public class Mavenproject14 {
    // Método polimórfico que recibe un Animal y llama a emitirSonido()
    public static void hacerSonar(Animal animal) {
        animal.emitirSonido();
    }
    public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Perro perro = new Perro();
        Gato gato = new Gato();

        // Demostración de polimorfismo
        System.out.println("Sonido del Perro:");
        hacerSonar(perro);

        System.out.println("\nSonido del Gato:");
        hacerSonar(gato);
    }
}
