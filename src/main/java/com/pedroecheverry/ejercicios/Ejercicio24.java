package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
    /**
     * String “La lluvia en Sevilla es una maravilla” 
     * 24) Recorre el String del ejercicio 22 y transforma cada carácter a su código ASCII.
     * Muestralos en linea recta, separados por un espacio entre cada carácter.
     */
    
    public static void informacion(){
        System.out.println(""
                + "String “La lluvia en Sevilla es una maravilla”\n"
                + "24) Recorre el String del ejercicio 22 y transforma cada carácter a su código ASCII.\n"
                + "Muestralos en linea recta, separados por un espacio entre cada carácter.\n"
        );
    }
    
    public static void ejercicio(){
        String frase;
        
        frase = "La lluvia en Sevilla es una maravilla";
        System.out.println("Frase: ");
        System.out.println(frase);
        System.out.println("ASCII: ");
        
        for (int r = 0; r < frase.length(); r++){
            int ascii = (int) frase.charAt(r);
            System.out.print(ascii + " ");
        }
        
        System.out.println("");
        
    }

}
