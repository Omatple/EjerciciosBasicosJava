package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.print("Escriba un numero y le escribire en pantalla el valor absoluto de este: ");
        int numero = Entrada.entero();
        System.out.println("El valor absoluto de " + numero + " es: " + numeroValorAbsoluto(numero));
    }

    private static int numeroValorAbsoluto(int a) {
        if (a < 0) {
            a = -a;
        }
        return a;
    }
}
