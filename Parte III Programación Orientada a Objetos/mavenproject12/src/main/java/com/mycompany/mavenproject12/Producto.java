package com.mycompany.mavenproject12;

public class Producto {
    // Atributos privados
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getter para obtener el nombre del producto
    public String getNombre() {
        return nombre;
    }

    // Setter para modificar el nombre del producto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener el precio del producto
    public double getPrecio() {
        return precio;
    }

    // Setter para modificar el precio del producto
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio debe ser mayor que 0.");
        }
    }

    // Getter para obtener el stock del producto
    public int getStock() {
        return stock;
    }

    // Setter para modificar el stock del producto
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo.");
        }
    }

    // Método para mostrar la información del producto
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " unidades");
    }
}
