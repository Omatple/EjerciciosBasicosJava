package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.secuenciales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.print("Escriba un numero real doble y le dire que numero corresponde al cuadrado de este: ");
        double numero = Entrada.realDoble();
        numero = cuadradoNumeroRealDoble(numero);
        System.out.println("El cuadrado de su numero real doble es: " + numero);
    }

    private static double cuadradoNumeroRealDoble(double a) {
        a *= a;
        return a;
    }
}
