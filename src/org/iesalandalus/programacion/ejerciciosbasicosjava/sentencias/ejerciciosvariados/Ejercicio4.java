package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.ejerciciosvariados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio4 {
    public static void main(String[] args) {
        int cociente, resto, orden;
        orden = 0;
        System.out.print("Escriba un numero mayor que 0 y le imprimire en pantalla las cifras una a una de derecha a izquierda: ");
        int numero = Entrada.entero();
        while (numero <= 0) {
            System.out.print("ERROR: El numero escrito no es mayor que 0, intentelo de nuevo: ");
            numero = Entrada.entero();
        }
        cociente = numero;
        while (cociente > 0) {
            orden++;
            resto = (int) (cociente % (Math.pow(10, 1)));
            cociente -= resto;
            System.out.println("La " + orden + "º cifra leyendo de derecha a izquierda del numero " + numero + " es: " + resto);
            cociente = (int) ((cociente) / (Math.pow(10, 1)));
        }
    }
}
