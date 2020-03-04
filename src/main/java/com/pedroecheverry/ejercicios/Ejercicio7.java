package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    /**
     * 7) Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
     * Por ejemplo: si introduzco un 97, me muestre una a.
     */

    public static void informacion(){
        System.out.println(""
                + "7) Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.\n"
                + "Por ejemplo: si introduzco un 97, me muestre una a.\n"
        );
    }
    
    public static void ejercicio(){
        int valor;
        char[] test;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        valor = leer.nextInt();
        test = Character.toChars(valor);
        
        char letra = (char) valor;
        System.out.println("El resultado es: " + letra);

    }
}
