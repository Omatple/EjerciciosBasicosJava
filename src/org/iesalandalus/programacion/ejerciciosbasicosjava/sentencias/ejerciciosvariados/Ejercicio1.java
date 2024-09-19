package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.ejerciciosvariados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero, resto, total;
        total = 0;
        System.out.print("Escriba un numero mayor que 0 y le dire si es un numero perfecto o no: ");
        numero = Entrada.entero();
        while (numero <= 0) {
            System.out.println("ERROR: Este numero es menor que 1, intentelo de nuevo: ");
            numero = Entrada.entero();
        }
        for (int i = 1; i < numero; i++){
            resto = (numero % i);
            if(resto == 0){
                System.out.println(i + " es divisor de " + numero);
                total += i;
            }
        }
        if (numero == total) {
            System.out.println("El numero " + numero + " es perfecto, porque la suma de sus divisores es igual a el. ");
        } else {
            System.out.println("El numero " + numero + " no es perfecto porque la suma de sus divisores no es igual a el. ");
        }
    }
}
