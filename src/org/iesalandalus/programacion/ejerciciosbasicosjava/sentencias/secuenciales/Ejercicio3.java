package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.secuenciales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.print("Escriba un numero real y le dire que numero corresponde al doble de este: ");
        float numero = Entrada.real();
        numero = dobleNumeroReal(numero);
        System.out.println("El doble de su numero real es: " + numero);
    }

    private static float dobleNumeroReal(float a) {
        a += a;
        return a;
    }
}
