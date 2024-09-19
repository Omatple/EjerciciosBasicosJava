package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.ejerciciosvariados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio7 {
    public static void main(String[] args) {
        int cociente, resultado, resto, cifras, contador;
        contador = 0;
        cifras = 1;
        resultado = 0;
        System.out.print("Escriba un numero mayor que 0 y le imprimire en pantalla el numero capicua de este mismo: ");
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
            resto = (int) (cociente % (Math.pow(10, i)));
            cociente = (int) (cociente / (Math.pow(10, i)));
            if (i == (cifras - 1)) {
                contador++;
                resultado += cociente;
            } else {
                resultado += (cociente * (Math.pow(10, contador)));
                contador++;
            }
            cociente = resto;
        }
        if (numero == resultado) {
            System.out.println("EL numero " + numero + " es capicua. ");
        } else {
            System.out.println("EL numero " + numero + " no es capicua. ");
        }
    }
}
