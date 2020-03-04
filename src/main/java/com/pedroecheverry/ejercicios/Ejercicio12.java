package com.pedroecheverry.ejercicios;

public class Ejercicio12 {
    /**
     * 12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
     * Utiliza el bucle que desees.
     */
    
    public static void informacion(){
        System.out.println(""
                + "12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.\n"
                + "Utiliza el bucle que desees."
        );
    }

    public static void ejercicio(){
        int contador = 0;
        String texto = "";
        for(int i = 1; i <=100; i++){
            contador = 0;
            texto = "";
            if(i % 2 == 0){
                texto+= "divisible por 2";
                contador++;
            } else if(i % 3 == 0){
                if (contador > 0){
                    texto+= " y 3";
                } else {
                    texto+= "divisible por 3";
                }
                contador++;
            }
            if (contador > 0){
                System.out.print("Numero " + i + " es "+texto+"\n");
            }
        }
    }
}
