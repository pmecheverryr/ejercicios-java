package com.pedroecheverry.ejercicios;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio16 {
    /**
     * 16) Escribe una aplicación con un String que contenga una contraseña cualquiera.
     * Después se te pedirá que introduzcas la contraseña, con 3 intentos.
     * Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo
     * “Enhorabuena”. Piensa bien en la condición de salida
     * (3 intentos y si acierta sale, aunque le queden intentos).
     */

    public static void informacion(){
        System.out.println(""
                + "16) Escribe una aplicación con un String que contenga una contraseña cualquiera.\n"
                + "Después se te pedirá que introduzcas la contraseña, con 3 intentos.\n"
                + "Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo\n"
                + "“Enhorabuena”. Piensa bien en la condición de salida\n"
                + "(3 intentos y si acierta sale, aunque le queden intentos).\n"
        );
    }    
    
    public static void ejercicio(){
        int intentos = 3, intento = 0;
        String contrasenia, password;
        Scanner leer = new Scanner(System.in);
        System.out.print("Contraseña a guardar: ");
        contrasenia = leer.nextLine();
        
        do {
            try {
                System.out.print("Ingresa la contraseña: ");
                password = leer.nextLine();
                intento+=1;
                if (password.equals(contrasenia)){
                    System.out.println("Enhorabuena");
                    break;
                } else {
                    if (intento == intentos){
                        System.out.println("Ha llegado al numero de intentos permitidos.");
                    }
                }
            } catch (NoSuchElementException e){
                System.out.println("Error en la solicitud de contraseña");
                leer.next();
            }

        } while (intento < 3);

    }
}
