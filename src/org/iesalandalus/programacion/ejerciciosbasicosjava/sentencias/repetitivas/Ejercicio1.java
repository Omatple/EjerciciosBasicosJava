package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.repetitivas;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio1 {
    public static void main(String[] args) {
        int resultado;
        resultado = 0;
        System.out.print("Escriba un numero y le dare la tabla de multiplicar hasta 12 de dicho numero: ");
        int numero = Entrada.entero();
        for (int i = 0; i < 13; i++) {
            System.out.println(i + " X " + numero + " = " + resultado);
            resultado += numero;
        }
    }
}
