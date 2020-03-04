package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    /**
     * 3) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
     * Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.
     */
    
    public static void informacion(){
        System.out.println(""
                + "3) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.\n"
                + "Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.\n"
        );
    }

    public static void ejercicio(){
        String nombre = "";
        Scanner leer = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        nombre = leer.nextLine();

        System.out.println("Bienvenido " + nombre);
    }
}
