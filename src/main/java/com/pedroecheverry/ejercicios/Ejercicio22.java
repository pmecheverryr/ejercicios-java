package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio22 {
    /**
     * 22) Del siguiente String “La lluvia en Sevilla es una maravilla” 
     * cuenta cuantas vocales hay en total (recorre el String con charAt).
     */
    
    public static void informacion(){
        System.out.println(""
                + "22) Del siguiente String “La lluvia en Sevilla es una maravilla”\n"
                + "cuenta cuantas vocales hay en total (recorre el String con charAt)."
        );
    }
    
    public static void ejercicio(){
        String frase;
        int vocales = 0, a = 0, e = 0, i = 0, o = 0, u = 0;
        
        frase = "La lluvia en Sevilla es una maravilla";
        System.out.println("Frase: ");
        System.out.println(frase);
        
        for (int r = 0; r < frase.length(); r++){
            switch (frase.charAt(r)) {
                case 'a':
                    vocales+=1;
                    a+=1;
                    break;
               case 'e':
                    vocales+=1;
                    e+=1;
                    break;
               case 'i':
                    vocales+=1;
                    i+=1;
                    break;
               case 'o':
                    vocales+=1;
                    o+=1;
                    break;
               case 'u':
                    vocales+=1;
                    u+=1;
                    break;
            }
        }
        System.out.println("Vocales encontradas: " + vocales);
        System.out.println("Vocal a: " + a);
        System.out.println("Vocal e: " + e);
        System.out.println("Vocal i: " + i);
        System.out.println("Vocal o: " + o);
        System.out.println("Vocal u: " + u);
    }

}
