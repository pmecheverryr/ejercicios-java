package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    /**
     * 20) Pide un número por teclado e indica si es un número primo o no.
     * Un número primo es aquel solo puede dividirse entre 1 y si mismo.
     * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
     * 17 si es primo.
     * Un buen truco para calcular la raíz cuadrada del numero e ir comprobando
     * que si es divisible desde ese numero hasta 1.
     * NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
     */
    
    public static void informacion(){
        System.out.println(""
                + "20) Pide un número por teclado e indica si es un número primo o no.\n"
                + "Un número primo es aquel solo puede dividirse entre 1 y si mismo.\n"
                + "Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,\n"
                + "17 si es primo."
                + "Un buen truco para calcular la raíz cuadrada del numero e ir comprobando\n"
                + "que si es divisible desde ese numero hasta 1.\n"
                + "NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.\n"
        );
    }
    
    public static void ejercicio(){
        int numero;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        numero = leer.nextInt();
        if (esPrimo(numero)){
            System.out.println(numero + " es numero primo.");
        } else {
            System.out.println(numero + " no es numero primo.");
        }
    }

    public static boolean esPrimo(int numero){
        for (int i = 2; i <= Math.sqrt(numero); i++)
        {
            if (numero % i == 0)
            {
                return false;
            }
        }
        return true;
    }

}
