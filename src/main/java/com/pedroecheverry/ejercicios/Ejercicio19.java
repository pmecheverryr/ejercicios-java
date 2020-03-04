package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
    /**
     * 19) Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene.
     * Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras.
     * Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.
     */
    
    public static void informacion(){
        System.out.println(""
                + "19) Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene.\n"
                + "Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras.\n"
                + "Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.\n"
        );
    }

    public static void ejercicio(){
        int numero, cifras;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        numero = leer.nextInt();
        cifras = String.valueOf(numero).length();

        System.out.println("El numero tiene " + cifras + " cifras.");
    }
}
