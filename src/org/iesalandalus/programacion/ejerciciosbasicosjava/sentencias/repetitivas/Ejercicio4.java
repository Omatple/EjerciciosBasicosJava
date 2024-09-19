package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.repetitivas;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio4 {
    public static void main(String[] args) {
        int suma, numero, orden, media;
        suma = 0;
        orden = 0;
        System.out.println("A continuacion vaya introduciendo numeros y le hare la media de estos, escriba 0 cuando desee saber la media de todos los numeros escritos. ");
        do {
            orden++;
            System.out.print(orden + "º numero: ");
            numero = Entrada.entero();
            suma += numero;
        } while (numero != 0);
        if (suma == 0) {
            System.out.println("No ha escrito ningun numero para poder hacerle la media, por lo cual no tengo ningun resultado para usted. ");
        } else {
            media = (suma / (orden - 1));
            System.out.println("La media final de todos los numeros escritos es: " + media);
        }
    }
}
