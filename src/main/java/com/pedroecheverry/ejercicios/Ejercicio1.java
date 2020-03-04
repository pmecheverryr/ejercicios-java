package com.pedroecheverry.ejercicios;

public class Ejercicio1 {

    /**
     * 1) Declara dos variables numéricas (con el valor que desees), muestra por consola la
     * suma, resta, multiplicación, división y módulo (resto de la división).
    */
    
    public static void informacion(){
        System.out.println(""
                + "1) Declara dos variables numéricas (con el valor que desees), muestra por consola la\n"
                + "suma, resta, multiplicación, división y módulo (resto de la división).\n"
        );
    }

    public static void ejercicio(){
        float a = 5, b = 3;

        System.out.println("Resultado de la suma: " + suma(a, b));
        System.out.println("Resultado de la resta: " + resta(a, b));
        System.out.println("Resultado de la producto: " + producto(a, b));
        System.out.println("Resultado de la division: " + divide(a, b));
        System.out.println("Resultado de la resto: " + resto(a, b));
    }

    public static float suma(float n1, float n2){
        return n1 + n2;
    }

    public static float resta(float n1, float n2){
        return n1 - n2;
    }

    public static float producto(float n1, float n2){
        return n1 * n2;
    }

    public static float divide(float n1, float n2){
        return n1 / n2;
    }

    public static float resto(float n1, float n2){
        return n1 % n2;
    }
    
}
