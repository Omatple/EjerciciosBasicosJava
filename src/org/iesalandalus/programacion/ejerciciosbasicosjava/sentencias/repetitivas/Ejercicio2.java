package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.repetitivas;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.print("Escriba un numero entero positivo y se lo mostrare en pantalla: ");
        int numero = Entrada.entero();
        while (numero < 0) {
            System.out.print("ERROR: El numero entero escrito no es positivo, intentelo de nuevo: ");
            numero = Entrada.entero();
        }
        System.out.println("Su numero positivo es el " + numero);
    }
}
