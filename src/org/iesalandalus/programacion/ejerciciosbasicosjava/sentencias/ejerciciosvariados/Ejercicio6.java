package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.ejerciciosvariados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio6 {
    public static void main(String[] args) {
        int cociente, resto;
        System.out.print("Escriba un numero mayor que 0 y le imprimire en pantalla el numero reverso de este mismo: ");
        int numero = Entrada.entero();
        while (numero <= 0) {
            System.out.print("ERROR: El numero escrito no es mayor que 0, intentelo de nuevo: ");
            numero = Entrada.entero();
        }
        cociente = numero;
        System.out.print("EL numero reverso que corresponde al " + numero + " es el: ");
        while (cociente > 0) {
            resto = (int) (cociente % (Math.pow(10, 1)));
            cociente -= resto;
            System.out.print(resto);
            cociente = (int) ((cociente) / (Math.pow(10, 1)));
        }
    }
}
