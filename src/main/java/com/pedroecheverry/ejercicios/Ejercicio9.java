package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    /**
     * 9) Lee un número por teclado que pida el precio de un producto (puede tener decimales)
     * y calcule el precio final con IVA.
     * El IVA sera una constante que sera del 21%.
     */
    
    public static void informacion(){
        System.out.println(""
                + "9) Lee un número por teclado que pida el precio de un producto (puede tener decimales)\n"
                + "y calcule el precio final con IVA.\n"
                + "El IVA sera una constante que sera del 21%.\n"
        );
    }

    static final float IVA = 21;

    public static void ejercicio(){

        float numero = 0, iva = 0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: € ");

        numero = leer.nextFloat();

        iva = numero * (IVA/100);

        System.out.println("El IVA del producto es: € " + String.format("%.2f", iva));
        System.out.println("El precio del producto con IVA es: € " + String.format("%.2f", (numero+iva)));
    }
}
