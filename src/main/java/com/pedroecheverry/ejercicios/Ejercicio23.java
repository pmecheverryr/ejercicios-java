package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
    /**
     * 23) Reemplaza todas las a del String anterior por una e.
     */
    
    public static void informacion(){
        System.out.println(""
                + "23) Reemplaza todas las a del String anterior por una e.\n"
        );
    }
    
    public static void ejercicio(){
        String frase;
        
        frase = "La lluvia en Sevilla es una maravilla";
        System.out.println("Frase: ");

        System.out.println(frase);
        
        frase = frase.replace("a", "e");
        
        System.out.println(frase);
        
    }

}
