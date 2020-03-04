package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
    /**
     * 21) Muestra los números primos entre 1 y 100.
     */
    
    public static void informacion(){
        System.out.println(""
                + "21) Muestra los números primos entre 1 y 100.\n"
        );
    }
    
    public static void ejercicio(){
        for (int i = 1; i <= 100; i++){
            if (Ejercicio20.esPrimo(i)){
                System.out.println(i + " es numero primo.");
            }
        }
    }

}
