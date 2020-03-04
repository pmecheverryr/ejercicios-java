package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    /**
     * 17) Crea una aplicación que nos pida un día de la semana
     * y que nos diga si es un dia laboral o no.
     * Usa un switch para ello.
     */
    
    public static void informacion(){
        System.out.println(""
                + "17) Crea una aplicación que nos pida un día de la semana\n"
                + "y que nos diga si es un dia laboral o no.\n"
                + "Usa un switch para ello.\n"
        );
    }

    public static void ejercicio(){
        int dia;
        boolean laboral = true;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un dia de la semana (1-7)");
        dia = leer.nextInt();

        switch (dia){
            case 6: case 7:
                System.out.println("Dia de la semana "+ dia +" no es laboral");
                break;
            default:
                System.out.println("Dia de la semana "+ dia +" es laboral");
                break;
        }

    }
}
