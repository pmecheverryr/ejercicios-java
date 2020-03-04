package com.pedroecheverry.ejercicios;

public class Ejercicio10 {
    /**
     * 10) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
     */
    
    public static void informacion(){
        System.out.println(""
                + "10) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.\n"
        );
    }


    public static void ejercicio10(){

        int contador = 1;

        while (contador <=100){
            System.out.println("Numero: "+contador);
            contador++;
        }
    }
}
