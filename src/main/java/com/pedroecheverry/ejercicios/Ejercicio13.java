package com.pedroecheverry.ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    /**
     * 13) Realiza una aplicación que nos pida un número de ventas a introducir,
     * después nos pedirá tantas ventas por teclado como número de ventas se hayan
     * indicado. Al final mostrara la suma de todas las ventas. Piensa que es lo que
     * se repite y lo que no.
     */

    public static void informacion() {
        System.out.println("" + "13) Realiza una aplicación que nos pida un número de ventas a introducir,\n"
                + "después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado."
                + "Al final mostrara la suma de todas las ventas." + "Piensa que es lo que se repite y lo que no.");
    }

    public static void ejercicio() {
        int ventas = 0, cantidad = 0;
        double suma = 0, valor = 0, total = 0;

        Scanner leer = new Scanner(System.in);
        System.out.print("Numero de ventas: ");
        ventas = leer.nextInt();

        for (int venta = 1; venta <= ventas; venta++) {
            System.out.println("Venta " + venta + ". ");
            System.out.print("\tCantidad: ");
            cantidad = leer.nextInt();
            System.out.print("\tValor Unidad: €");
            valor = leer.nextDouble();
            total = cantidad * valor;
            System.out.println("\tTotal:" + (total));
            suma += total;
        }

        System.out.println("\nTotales ventas: " + suma);
    }
}
