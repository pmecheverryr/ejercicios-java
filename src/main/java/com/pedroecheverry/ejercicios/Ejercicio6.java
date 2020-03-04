package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    /**
     * 6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
     * Si no lo es, también debemos indicarlo.
     */
    
    public static void informacion(){
        System.out.println(""
                + "6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0).\n"
                + "Si no lo es, también debemos indicarlo.\n"
        );
    }

    private static void ejercicio(){
        float numero = 0;

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        numero = leer.nextFloat();

        if (numero % 2 == 0){
            System.out.println("El numero " + numero + " es divisible por 2");
        } else {
            System.out.println("El numero " + numero + " no es divisible por 2");
        }
    }
}
