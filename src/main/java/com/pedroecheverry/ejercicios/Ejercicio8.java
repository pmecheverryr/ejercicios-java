package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    /**
     * 8) Modifica el ejercicio anterior, para que en lugar de pedir un número,
     * pida un carácter (char) y muestre su código en la tabla ASCII.
     */

    public static void informacion(){
        System.out.println(""
                + "8) Modifica el ejercicio anterior, para que en lugar de pedir un número,\n"
                + "pida un carácter (char) y muestre su código en la tabla ASCII.\n"
        );
    }

    public static void ejercicio(){

        int valor;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un caracter: ");
        valor = leer.next().charAt(0);

        System.out.println("El resultado es: " + valor);

    }
}
