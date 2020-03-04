package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    /**
     * 14) Realiza una aplicación que nos calcule una ecuación de segundo grado.
     * Debes pedir las variables a, b y c por teclado y
     * comprobar antes que el discriminante (operación en la raíz cuadrada).
     * Para la raíz cuadrada usa el método sqlrt de Math.
     * Te recomiendo que uses mensajes de traza.
     * https://www.matesfacil.com/calculadoras/calculadora-online-resolver-ecuacion-cuadratica-segundo-grado.html
     */
    
    public static void informacion(){
        System.out.println(""
                + "14) Realiza una aplicación que nos calcule una ecuación de segundo grado.\n"
                + "Debes pedir las variables a, b y c por teclado y"
                + "comprobar antes que el discriminante (operación en la raíz cuadrada)."
                + "Para la raíz cuadrada usa el método sqlrt de Math."
                + "Te recomiendo que uses mensajes de traza."
                + "https://www.matesfacil.com/calculadoras/calculadora-online-resolver-ecuacion-cuadratica-segundo-grado.html"
        );
    }

    public static void ejercicio(){
        int a, b, c;
        double x1, x2, discriminante;

        Scanner leer = new Scanner(System.in);
        System.out.print("Digite el valor de a: ");
        a = leer.nextInt();
        System.out.print("Digite el valor de b: ");
        b = leer.nextInt();
        System.out.print("Digite el valor de c: ");
        c = leer.nextInt();

        leer.close();

        discriminante = Math.pow(b,2) - (4 * a * c);

        System.out.println("Discriminante: " + discriminante);

        if (discriminante == 0){
            x1 = x2 = - a / (2 * a);
            System.out.println("Discriminante 0");
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else {
            double discrimina = Math.abs(discriminante);
            x1 = (-b + Math.sqrt(discrimina)) / (2 * a);
            x2 = (-b - Math.sqrt(discrimina)) / (2 * a);
            System.out.print("Discriminante ");
            if (discriminante > 0){
                System.out.println("> 0");
            } else {
                System.out.println("< 0");
            }
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }

    }
}
