package com.pedroecheverry.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Utilidades {
    public static void esperarTeclado() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nPulsa enter para continuar...");
        try {
            teclado.nextLine();
        } catch (Exception e) {
            teclado.next();
        }
    }

    public static void limpiarPantalla() {
        final String sistema = System.getProperty("os.name");
        for (int i = 0; i < 50; ++i)
            System.out.println();
        try {
            if (sistema.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }

    public static void bienvenida() {
        /**
         * http://patorjk.com/software/taag http://www.asciiartfarts.com/index.html
         * https://www.asciiart.eu/books/harry-potter
         */

        String cadena;
        String archivo = "bienvenida.txt";
        limpiarPantalla();
        // Path currentDir = Paths.get(".");
        // Path fullPath = currentDir.toAbsolutePath();
        // System.out.println(fullPath);

        try {
            FileReader f = new FileReader(archivo);
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                System.out.println(cadena);
            }
            b.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }

    public static boolean isNumeric(String str) {

        if (str == null || str.length() == 0) {
            return false;
        }

        try {

            Integer.parseInt(str);
            return true;

        } catch (NumberFormatException e) {
            return false;
        }

    }

}
