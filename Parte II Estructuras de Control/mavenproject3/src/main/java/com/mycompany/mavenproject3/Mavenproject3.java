package com.mycompany.mavenproject3;

/*3-Switch para Días: Crea un switch que asigne un mensaje a cada día de la 
semana según un número (1-7).*/
public class Mavenproject3 {

    public static void main(String[] args) {
        int dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido");
        }
    }
}
