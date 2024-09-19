package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.secuenciales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio5 {
    public static void main(String[] args) {
        float perimetro;
        System.out.println("A continuacion escriba la base y la altura de un rectangulo para luego imprimirle en pantalla el numero que corresponde al perimetro de este. ");
        System.out.print("Base: ");
        float base = Entrada.real();
        System.out.print("Altura: ");
        float altura = Entrada.real();
        perimetro = hallarPerimetroRectangulo(base, altura);
        System.out.println("El perimetro de su rectangulo es: " + perimetro + " cm. ");
    }

    private static float hallarPerimetroRectangulo(float a, float b) {
        float resultado;
        a *= 2;
        b *= 2;
        resultado = (a + b);
        return resultado;
    }
}
