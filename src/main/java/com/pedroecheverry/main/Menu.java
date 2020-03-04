package com.pedroecheverry.main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static int opciones = 0;
    public static int pagina = 1;

    public static void menuOpciones() {
        double paginas = Math.ceil((double) opciones / 17);

        int registro = 1;

        if (pagina < 1)
            pagina = 1;
        else if (pagina >= paginas)
            pagina = (int) paginas;

        registro = ((pagina - 1) * 16) + 1;

        Utilidades.limpiarPantalla();
        System.out.println("PROGRAMACION DE SISTEMAS INFORMATICOS");
        System.out.println("* MENU DE OPCIONES * " + opciones + " Pag. " + pagina + "/" + (int) paginas + "\n");

        System.out.println("0/q. Salir \t\t\t x. Acerca de... \t\t\t p. Menu \t\t\t ?. Ayuda");
        int contador = 0;
        for (int i = registro; i <= opciones; i++) {
            if (contador > 16) {
                // System.out.print("Ejercicios " + i +"..." + opciones);
                break;
            } else {
                System.out.println(i + ". Ejercicio " + i);
            }
            if (paginas > 1 && (registro + 16 == i || i == opciones)) {
                if (pagina > 1) {
                    System.out.print("b. Pagina Atras");
                    if (pagina < paginas) {
                        System.out.print(" | ");
                    }
                }
                if (pagina < paginas) {
                    System.out.print("n. Pagina Siguiente");
                }
            }
            contador += 1;
        }

        System.out.print("\n?: ");
    }

    public static void menu() {
        Scanner leer = new Scanner(System.in);
        boolean salir = false, esperarOpcion = true, ayuda = false;
        int opcion = 0;
        String captura = "", ayudaCaptura = ":h";

        menuOpciones();
        while (!salir) {
            try {
                ayuda = false;
                if (opcion != 0 || (captura.length() > 0)) {
                    if (esperarOpcion) {
                        esperarOpcion();
                    }
                }
                esperarOpcion = true;
                captura = leer.nextLine();

                if (captura.contains(ayudaCaptura)) {
                    String[] capturaAyuda = captura.split(ayudaCaptura);
                    if (capturaAyuda.length > 0) {
                        for (int i = 0; i < capturaAyuda.length; i++) {
                            captura = capturaAyuda[i];
                        }
                        ayuda = true;
                    }
                }

                if (Utilidades.isNumeric(captura)) {
                    opcion = Integer.parseInt(captura);

                    if (opcion == 0) {
                        salir = salir();
                    }

                    try {
                        System.out.println("Ejercicio " + opcion + ".\n");
                        Class clase = Class.forName("com.pedroecheverry.ejercicios.Ejercicio" + opcion);
                        String nombreMetodo = "ejercicio";
                        if (ayuda) {
                            nombreMetodo = "informacion";
                            System.out.println("Que hace el ejercicio?\n");
                        }
                        Method metodo = clase.getMethod(nombreMetodo);
                        metodo.invoke(null);
                    } catch (NoSuchMethodException e1) {
                        System.out.println("\nMetodo del ejercicio no esta creado!.\n");
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        System.out.println("\nError!.\n");
                    } catch (ClassNotFoundException e) {
                        if (opcion == 99) {
                            Utilidades.bienvenida();
                        } else {
                            System.out.println("\nEjercicio no esta creado!.\n");
                        }
                    }
                } else {
                    switch (captura) {
                        case "q":
                        case "Q":
                            salir = salir();
                            ;
                            break;
                        case "x":
                            Utilidades.bienvenida();
                            break;
                        case "p":
                            menuOpciones();
                            break;
                        case "?":
                            ayuda();
                            break;
                        case "b":
                            pagina -= 1;
                            esperarOpcion = false;
                            menuOpciones();
                            break;
                        case "n":
                            pagina += 1;
                            esperarOpcion = false;
                            menuOpciones();
                            break;
                        default:
                            System.out.println("\nEjercicio no esta creado!.\n");
                    }
                }

            } catch (InputMismatchException e) {

                System.out.println("No es un opción valida, intenta de nuevo.");
                leer.next();
                esperarOpcion();

            }

        }

    }

    private static boolean salir() {
        Utilidades.bienvenida();
        System.out.println("Saliendo!...");
        return true;
    }

    private static void esperarOpcion() {
        Utilidades.esperarTeclado();
        Utilidades.limpiarPantalla();
        menuOpciones();
    }

    private static void ayuda() {
        System.out.println("Ayuda\n");
        System.out.println("Programa donde contiene todos los ejercicios de Java realizados en el Curso de");
        System.out.println("Programación de Sistemas Informàticos");
        System.out.println("");
        System.out
                .println("Para ver información de què debe hacer el ejercicio y como se realizó puede consultar así:");
        System.out.println("");
        System.out.println("#opcion:h");
        System.out.println("");
        System.out.println("Si deseamos consultar información del ejercicio 1, seria así:");
        System.out.println("");
        System.out.println("1:h");
    }
}
