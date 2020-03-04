package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
    /**
     * 18) Pide por teclado dos número y genera 10 números aleatorios entre esos números.
     * Usa el método Math.random para generar un número entero aleatorio
     * (recuerda el casting de double a int).
     */
    
    public static void informacion(){
        System.out.println(""
                + "18) Pide por teclado dos número y genera 10 números aleatorios entre esos números.\n"
                + "Usa el método Math.random para generar un número entero aleatorio\n"
                + "(recuerda el casting de double a int).\n"
        );
    }

    public static void ejercicio(){
        int n1, n2, n0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa el numero minimo: ");
        n1 = leer.nextInt();
        System.out.print("Ingresa el numero maximo: ");
        n2 = leer.nextInt();

        n0 = (int) (Math.random() * (n2 - n1 +1) + n1);
        System.out.println("Numero: " + n0);
    }
}
