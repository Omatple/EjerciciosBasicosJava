package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("A continuacion escriba dos numeros reales y se los ordenare de mayor a menor: ");
        System.out.print("1º Numero: ");
        float numero = Entrada.real();
        System.out.print("2º Numero: ");
        float numero2 = Entrada.real();
        if (numero == numero2) {
            System.out.println("El numero " + numero + " es igual que " + numero2);
        } else if (numero > numero2) {
            System.out.println("El numero " + numero + " es mayor que " + numero2);
        } else {
            System.out.println("El numero " + numero2 + " es mayor que " + numero);
        }
    }
}
