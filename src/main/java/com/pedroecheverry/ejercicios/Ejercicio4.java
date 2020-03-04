package com.pedroecheverry.ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio4 {
    /**
     * 4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir
     * (recuerda usar JOptionPane).
     */
    
    public static void informacion(){
        System.out.println(""
                + "4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir\n"
                + "(recuerda usar JOptionPane).\n"
        );
    }

    public static void ejercicio(){
        String nombre = "";
        nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        JOptionPane.showMessageDialog(null, "Bievenido " + nombre);
    }
}
