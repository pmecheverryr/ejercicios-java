/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedroecheverry.ejercicios;

import java.util.Scanner;

/**
 *
 * @author mecheverry
 */
public class Ejercicio26 {
    /**
     * 26) Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.
    */
    
    public static void informacion(){
        System.out.println(""
                + "26) Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.\n"
        );
    }
    
    public static void ejercicio(){
        Scanner leer = new Scanner(System.in);
        
        int numero = 0, suma = 0;
        
        System.out.println("Introducir un numero: ");
        numero = leer.nextInt();
        
        for (int i = 1; i < numero; i++) {
            suma+= i;
        }
        
        System.out.println("Resultado: "+suma);
        
    }
    
}
