package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.print("Escriba un numero y le imprimere en pantalla si este numero es positivo o negativo: ");
        int numero = Entrada.entero();
        if (numero < 0) {
            System.out.println("El numero " + numero + " es negativo. ");
        } else {
            System.out.println("El numero " + numero + " es positivo. ");
        }
    }
}
