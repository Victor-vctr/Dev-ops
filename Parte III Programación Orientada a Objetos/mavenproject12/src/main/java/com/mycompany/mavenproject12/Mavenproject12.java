package com.mycompany.mavenproject12;

/*12-Encapsulamiento: Define una clase Producto cuyos atributos sean 
privados y se accedan mediante getters y setters.*/
public class Mavenproject12 {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1200.99, 10);

        // Mostrar información inicial
        producto1.mostrarInformacion();

        // Modificar valores usando setters
        producto1.setPrecio(1100.50);
        producto1.setStock(8);

        System.out.println("\nDespués de actualizar valores:");
        producto1.mostrarInformacion();
    }
}
