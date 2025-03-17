package com.mycompany.n19;

/*19-Concatenación de Strings: Demuestra la concatenación de dos o más 
cadenas de texto usando el operador +.*/
public class N19 {

    public static void main(String[] args) {
        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        String concatenacion = cadena1 + " " + cadena2;
        System.out.println("Concatenación: " + concatenacion);

        // Concatenación usando StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(cadena1);
        sb.append(" ");
        sb.append(cadena2);
        System.out.println("Concatenación con StringBuilder: " + sb.toString());

        // Concatenación usando String.format
        String concatenacionFormat = String.format("%s %s", cadena1, cadena2);
        System.out.println("Concatenación con String.format: " + concatenacionFormat);
    }
}
