package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    /**
     * 15) Lee un número por teclado y comprueba que este numero es mayor o
     * igual que cero, si no lo es lo volverá a pedir (do while),
     * después muestra ese número por consola.
     */
    
    public static void informacion(){
        System.out.println(""
                + "15) Lee un número por teclado y comprueba que este numero es mayor o\n"
                + "igual que cero, si no lo es lo volverá a pedir (do while),"
                + "después muestra ese número por consola."
        );
    }

    public static void ejercicio(){
        int numero;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.print("Ingresa un numero: ");
            numero = leer.nextInt();
        } while(numero < 0);
        System.out.println("El numero ingresado es:  " + numero);
    }
}
