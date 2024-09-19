package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.secuenciales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio6 {
    public static void main(String[] args) {
        double area;
        System.out.print("Escriba el radio de su circulo y le imprimire su area en pantalla: ");
        double radio = Entrada.realDoble();
        area = hallarAreaCirculo(radio);
        System.out.println("El area de su circulo es: " + area + " cm^2. ");
    }

    private static double hallarAreaCirculo(double a) {
        double resultado;
        a *= a;
        resultado = (Math.PI * a);
        return resultado;
    }
}
