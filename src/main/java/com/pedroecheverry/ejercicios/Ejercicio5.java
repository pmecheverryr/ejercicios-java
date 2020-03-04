package com.pedroecheverry.ejercicios;

import com.sun.jdi.DoubleValue;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Ejercicio5 {
    /**
     * 5) Haz una aplicación que calcule el área de un círculo(pi*R2).
     * El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
     * Usa la constante PI y el método pow de Math.
     */
    
    public static void informacion(){
        System.out.println(""
                + "5) Haz una aplicación que calcule el área de un círculo(pi*R2).\n"
                + "El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).\n"
                + "Usa la constante PI y el método pow de Math.\n"
        );
    }

    public static void ejercicio(){
        String dato;
        Double respuesta;
        Scanner leer = new Scanner(System.in);

        System.out.print("Digitar el radio: ");
        dato = leer.nextLine();

        respuesta = circulo(PI, Double.parseDouble(dato));
        System.out.println("El área del circulo es: " + String.format("%.2f",respuesta));
    }

    public static double circulo(double pi, double radio){
        return pi * Math.pow(radio,2);
    }
}
