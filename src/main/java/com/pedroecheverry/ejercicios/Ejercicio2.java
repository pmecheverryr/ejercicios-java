package com.pedroecheverry.ejercicios;

public class Ejercicio2 {
    /**
     * 2) Declara 2 variables numéricas (con el valor que desees), e indica cual es mayor de los dos.
     * Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
     */
    
    public static void informacion(){
        System.out.println(""
                + "2) Declara 2 variables numéricas (con el valor que desees), e indica cual es mayor de los dos.\n"
                + "Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.\n"
        );
    }

    public static void ejercicio(){
        int a = 5, b = 3;

        if (a > b){
            System.out.println("El numero "+ a + " es mayor al numero " + b);
        } else if(a < b){
            System.out.println("El numero "+ b + " es mayor al numero " + a);
        } else if (a == b){
            System.out.println("El numero "+ a + " es igual al numero " + b);
        }
    }
}
