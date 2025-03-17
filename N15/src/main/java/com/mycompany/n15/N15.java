package com.mycompany.n15;

/*15-Convenciones de Nombres: Declara variables siguiendo las convenciones 
camelCase y UPPER_CASE, y explica en comentarios la diferencia.*/
public class N15 {
    // UPPER_CASE: Se usa para constantes, separando palabras con guion bajo.
    public static final double PI_VALUE = 3.1416;
    public static final int MAX_USERS = 100;
    public static void main(String[] args) {
        // Convención camelCase
        int entero = 10;
        double doble = 10.5;
        boolean booleano = true;
        String cadena = "Hola";
        
        // Convención UPPER_CASE
        final int ENTERO = 10;
        final double DOBLE = 10.5;
        final boolean BOOLEANO = true;
        final String CADENA = "Hola";

        // camelCase: Se usa para variables y métodos, iniciando con minúscula.
        int userAge = 25;
        String userName = "Juan";

        // Llamada a un método con convención camelCase
        printUserInfo(userName, userAge);
        
        // La diferencia entre camelCase y UPPER_CASE es que camelCase
        // es una convención de nombres en la que la primera letra de la
        // primera palabra es minúscula y la primera letra de las palabras
        // siguientes es mayúscula. UPPER_CASE es una convención de nombres
        // en la que todas las letras son mayúsculas y las palabras se separan
        // con guiones bajos.
    }
    // Métodos también usan camelCase, iniciando con minúscula
    public static void printUserInfo(String name, int age) {
        System.out.println("Nombre: " + name + ", Edad: " + age);
    }
}
