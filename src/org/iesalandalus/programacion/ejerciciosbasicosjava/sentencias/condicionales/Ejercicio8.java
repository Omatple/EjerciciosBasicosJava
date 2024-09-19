package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("A continuacion escriba tres numeros reales y se los ordenare de mayor a menor: ");
        System.out.print("1º Numero: ");
        float numero1 = Entrada.real();
        System.out.print("2º Numero: ");
        float numero2 = Entrada.real();
        System.out.print("3º Numero: ");
        float numero3 = Entrada.real();
        if ((numero1 > numero2) && (numero2 > numero3)) {
            System.out.println(numero1 + " es mayor que " + numero2 + " y " + numero2 + " es mayor que " + numero3 + ".\n" + numero1 + " > " + numero2 + " > " + numero3);
        } else if ((numero1 > numero3) && (numero3 > numero2)) {
            System.out.println(numero1 + " es mayor que " + numero3 + " y " + numero3 + " es mayor que " + numero2 + ".\n" + numero1 + " > " + numero3 + " > " + numero2);
        } else if ((numero2 > numero3) && (numero3 > numero1)) {
            System.out.println(numero2 + " es mayor que " + numero3 + " y " + numero3 + " es mayor que " + numero1 + ".\n" + numero2 + " > " + numero3 + " > " + numero1);
        } else if ((numero2 > numero1) && (numero1 > numero3)) {
            System.out.println(numero2 + " es mayor que " + numero1 + " y " + numero1 + " es mayor que " + numero3 + ".\n" + numero2 + " > " + numero1 + " > " + numero3);
        } else if ((numero3 > numero1) && (numero1 > numero2)) {
            System.out.println(numero3 + " es mayor que " + numero1 + " y " + numero1 + " es mayor que " + numero2 + ".\n" + numero3 + " > " + numero1 + " > " + numero2);
        } else if ((numero3 > numero2) && (numero2 > numero1)) {
            System.out.println(numero3 + " es mayor que " + numero2 + " y " + numero2 + " es mayor que " + numero1 + ".\n" + numero3 + " > " + numero2 + " > " + numero1);
        } else if ((numero1 == numero2) && (numero2 > numero3)) {
            System.out.println(numero1 + " es igual que " + numero2 + " y " + numero2 + " es mayor que " + numero3 + ".\n" + "(" + numero1 + " = " + numero2 + ")" + " y " + "(" + numero2 + " > " + numero3 + ")");
        } else if ((numero1 == numero2) && (numero3 > numero2)) {
            System.out.println(numero3 + " es mayor que " + numero2 + " y " + numero2 + " es igual que " + numero1 + ".\n" + "(" + numero3 + " > " + numero2 + ")" + " y " + "(" + numero2 + " = " + numero1 + ")");
        } else if ((numero2 == numero3) && (numero3 > numero1)) {
            System.out.println(numero2 + " es igual que " + numero3 + " y " + numero3 + " es mayor que " + numero1 + ".\n" + "(" + numero2 + " = " + numero3 + ")" + " y " + "(" + numero3 + " > " + numero1 + ")");
        } else if ((numero2 == numero3) && (numero1 > numero3)) {
            System.out.println(numero1 + " es mayor que " + numero3 + " y " + numero3 + " es igual que " + numero2 + ".\n" + "(" + numero1 + " > " + numero3 + ")" + " y " + "(" + numero3 + " = " + numero2 + ")");
        } else if (numero1 > numero2) {
            System.out.println(numero3 + " es igual que " + numero1 + " y " + numero1 + " es mayor que " + numero2 + ".\n" + "(" + numero3 + " = " + numero1 + ")" + " y " + "(" + numero1 + " > " + numero2 + ")");
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es mayor que " + numero1 + " y " + numero1 + " es igual que " + numero3 + ".\n" + "(" + numero2 + " > " + numero1 + ")" + " y " + "(" + numero1 + " = " + numero3 + ")");
        } else {
            System.out.println("El valor de los tres numeros es el mismo " + numero1 + " por lo cual son todos iguales.\n" + numero1 + " = " + numero2 + " = " + numero3);
        }
    }
}
