package com.mycompany.n17;

/*17-Autoboxing/Unboxing: Escribe un ejemplo donde conviertas un tipo primitivo 
a su clase envolvente (autoboxing) y viceversa (unboxing)*/
public class N17 {

    public static void main(String[] args) {
        // Autoboxing
        int primitivo = 10;
        Integer envolvente = primitivo;
        System.out.println("Autoboxing: " + envolvente);
        
        // Unboxing
        Integer envolvente2 = 20;
        int primitivo2 = envolvente2;
        System.out.println("Unboxing: " + primitivo2);
    }
}
