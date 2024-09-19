package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.print("Escriba un numero y le escribire en pantalla si este es par o impar: ");
        int numero = Entrada.entero();
        System.out.println(escribirParImpar(numero));
    }

    private static String escribirParImpar(int a) {
        String mensaje;
        mensaje = ((a % 2) == 0) ? "El numero " + a + " es par" : "El numero " + a + " es impar";
        return mensaje;
    }
}
