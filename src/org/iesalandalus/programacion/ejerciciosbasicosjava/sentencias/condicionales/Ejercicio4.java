package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Escriba un numero y le imprimere por pantalla si se encuentra comprendido entre 0 y 100: ");
        float numero = Entrada.real();
        String comprendido;
        if ((numero >= 0) && (numero <= 100)) {
            comprendido = "true";
        } else {
            comprendido = "false";
        }
        switch (comprendido) {
            case "true":
                System.out.println("El numero " + numero + " esta comprendido entre 0 y 100. ");
                break;
            case "false":
                System.out.println("El numero " + numero + " no esta comprendido entre 0 y 100. ");
                break;
            default:
                throw new IllegalStateException("ERROR: algo extraño a sucedido con el numero " + comprendido + ". ");
        }
    }
}
