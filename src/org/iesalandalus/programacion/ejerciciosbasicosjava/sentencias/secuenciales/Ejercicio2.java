package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.secuenciales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numEntero;
        System.out.print("Escriba un numero entero y se lo mostrare en pantalla: ");
        numEntero = Entrada.entero();
        System.out.println("Su numero entero es: " + numEntero);
    }
}
