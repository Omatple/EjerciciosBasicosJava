package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.ejerciciosvariados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio8 {
    public static void main(String[] args) {
        int respuesta = 0;
        while (respuesta != 3) {
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("MENU");
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.print("1.Abrir\n2.Cerrar\n3.Salir\nElija la opcion que desee realizar: ");
            respuesta = Entrada.entero();
            switch (respuesta) {
                case 1:
                    System.out.println("Ha elegido la opcion 1 la cual es abrir. ");
                    break;
                case 2:
                    System.out.println("Ha elegido la opcion 2 la cual es cerrar. ");
                    break;
                case 3:
                    System.out.println("Ha elegido la opcion 3 la cual es salir. ");
                    break;
                default:
                    System.out.println("No ha elegido ninguna de las opciones  posibles, intentelo de nuevo. ");
                    break;
            }
        }

    }
}
