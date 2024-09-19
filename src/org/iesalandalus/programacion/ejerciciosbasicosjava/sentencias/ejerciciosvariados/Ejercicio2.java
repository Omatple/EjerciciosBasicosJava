package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.ejerciciosvariados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio2 {
    public static void main(String[] args) {
        int cociente, cifras;
        cifras = 1;
        System.out.print("Escriba un numero mayor que 0 y le imprimire en pantalla el numero de cifras que este posee: ");
        int numero = Entrada.entero();
        while (numero <= 0) {
            System.out.print("ERROR: El numero escrito no es mayor que 0, intentelo de nuevo: ");
            numero = Entrada.entero();
        }
        cociente = numero;
        while (cociente >= 10) {
            cociente = cociente / 10;
            cifras++;
        }
        if (numero < 10) {
            System.out.println("El numero " + numero + " contiene una unica cifra. ");
        } else {
            System.out.println("El numero " + numero + " contiene " + cifras + " cifras. ");
        }
    }
}
