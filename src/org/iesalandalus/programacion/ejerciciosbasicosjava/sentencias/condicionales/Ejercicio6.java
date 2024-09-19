package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("A continuacion escriba dos numeros y le imprimire en pantalla si estos son iguales o no: ");
        System.out.print("1º Numero: ");
        int numero = Entrada.entero();
        System.out.print("2º Numero: ");
        int numero2 = Entrada.entero();
        if (numero == numero2) {
            System.out.println("Los numeros " + numero + " y " + numero2 + " son iguales. ");
        } else {
            System.out.println("Los numeros " + numero + " y " + numero2 + " no son iguales. ");
        }
    }
}
