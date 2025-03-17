package com.mycompany.n9;

/*9-Código ASCII: Declara una variable de tipo char, asígnale un valor 
y muestra su código ASCII (utiliza un casting a int).*/
public class N9 {

    public static void main(String[] args) {
        char caracter = 'A';
        int codigo = (int) caracter;
        System.out.println("Caracter: " + caracter);
        System.out.println("Código ASCII: " + codigo);
    }
}
