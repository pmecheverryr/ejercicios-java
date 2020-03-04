package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio25 {
    
    public static void informacion(){
        System.out.println(""
                + "25) Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), \n"
                + "según este último se realizara la operación correspondiente. Al final mostrara el resultado en un cuadro de dialogo.\n" 
                + "\n" 
                + "Los signos aritméticos disponibles son:\n" 
                + "\n" 
                + "    +: suma los dos operandos.\n" 
                + "    -: resta los operandos.\n" 
                + "    *: multiplica los operandos.\n" 
                + "    /: divide los operandos, este debe dar un resultado con decimales (double)\n" 
                + "    ^:  1º operando como base y 2º como exponente.\n" 
                + "    %:  módulo, resto de la división entre operando1 y operando2.\n"
        );
    }
    
    public static void ejercicio(){
        int n1, n2;
        String operador = "";
        double resultado = 0;
        
        Scanner leerNumero = new Scanner(System.in);
        Scanner leerOperador = new Scanner(System.in);
        
        System.out.println("Ingrese el numero 1: ");
        n1 = leerNumero.nextInt();
        
        System.out.println("Ingrese el numero 2: ");
        n2 = leerNumero.nextInt();
        
        System.out.println("Ingresa el operador: ");
        
        operador = leerOperador.nextLine();
        
        switch (operador) {
            case "+":
                resultado = suma(n1, n2);
                System.out.println("Resultado de la suma es: " + resultado);
                break;
            case "-":
                resultado = resta(n1, n2);
                System.out.println("Resultado de la resta es: " + resultado);
                break;
            case "*":
                resultado = producto(n1, n2);
                System.out.println("Resultado de la multiplicacion es: " + resultado);
                break;
            case "/":
                resultado = divide(n1, n2);
                System.out.println("Resultado de la division es: " + resultado);
                break;
            case "^":
                resultado = potencia(n1, n2);
                System.out.println("Resultado de la potencia es: " + resultado);
                break;
            case "%":
                resultado = resto(n1, n2);
                System.out.println("Resultado del modulo (resto) es: " + resultado);
                break;
        }
//        */
        System.out.println(resultado);
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
    
    public static float potencia(float n1, float n2){
        return (float) Math.pow(n1, n2);
    }

    public static float resto(float n1, float n2){
        return n1 % n2;
    }

}
