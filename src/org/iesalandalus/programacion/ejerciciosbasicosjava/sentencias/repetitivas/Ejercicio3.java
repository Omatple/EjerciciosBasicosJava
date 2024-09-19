package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.repetitivas;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.sql.SQLOutput;

public class Ejercicio3 {
    public static void main(String[] args) {
        int suma, numero, orden;
        suma = 0;
        orden = 0;
        System.out.println("A continuacion vaya introduciendo numeros y se los ire sumando, escriba 0 cuando desee saber la cuenta total de la suma. ");
        do {
            orden++;
            System.out.print(orden + "º numero: ");
            numero = Entrada.entero();
            suma += numero;
        } while (numero != 0);
        if (suma == 0) {
            System.out.println("No ha escrito ningun numero para poder sumarselo, por lo cual no tengo ningun resultado para usted. ");
        } else {
            System.out.println("La suma total de los numeros escritos es: " + suma);
        }
    }
}
