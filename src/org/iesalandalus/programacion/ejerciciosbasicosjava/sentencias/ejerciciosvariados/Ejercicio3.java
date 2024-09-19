package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.ejerciciosvariados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio3 {
    public static void main(String[] args) {
        int cociente, cifras, resto, orden;
        orden = 0;
        cifras = 1;
        System.out.print("Escriba un numero mayor que 0 y le imprimire en pantalla las cifras una a una de izquierda a derecha: ");
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
        cociente = numero;
        for (int i = (cifras - 1); i >= 0; i--) {
            orden++;
            resto = (int) (cociente % (Math.pow(10, i)));
            cociente = (int) (cociente / (Math.pow(10, i)));
            System.out.println("La " + orden + "º cifra leyendo de izquierda a derecha del numero " + numero + " es: " + cociente);
            cociente = resto;
        }
    }
}
