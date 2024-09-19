package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.ejerciciosvariados;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        int resultado, numeroTiradas, contadorCaras, contadorCruces, contadorConsecutivasCaras, contadorConsecutivasCruces, auxConsecutivasCaras, auxConsecutivasCruces;
        contadorCaras = 0;
        contadorConsecutivasCaras = 0;
        contadorCruces = 0;
        contadorConsecutivasCruces = 0;
        auxConsecutivasCaras = 0;
        auxConsecutivasCruces = 0;
        System.out.print("Escriba el numero para defina la cantidad de tiradas de una moneda al aire con minimo de 1 y un maximo de 50. Luego le imprimire en pantalla cada resultado de cada tirada y al final el número de caras, el número de cruces, el número máximo de caras dobles consecutivas y el número máximo de cruces dobles consecutivas, que han salido: ");
        numeroTiradas = Entrada.entero();
        while (!((numeroTiradas > 0) && (numeroTiradas < 51))) {
            System.out.print("ERROR: El valor introducido no esta dentro de los limites establecidos, intentelo de nuevo: ");
            numeroTiradas = Entrada.entero();
        }
        for (int i = 0; i < numeroTiradas; i++) {
            resultado = (int) (Math.random() * 2);
            if (contadorConsecutivasCaras > auxConsecutivasCaras) {
                auxConsecutivasCaras = contadorConsecutivasCaras;
            }
            if (contadorConsecutivasCruces > auxConsecutivasCruces) {
                auxConsecutivasCruces = contadorConsecutivasCruces;
            }
            switch (resultado) {
                case 0:
                    System.out.println("El resultado de la " + (i + 1) + "º tirada es: CARA ");
                    contadorCaras++;
                    contadorConsecutivasCaras++;
                    contadorConsecutivasCruces = 0;
                    break;
                case 1:
                    System.out.println("El resultado de la " + (i + 1) + "º tirada es: CRUZ ");
                    contadorCruces++;
                    contadorConsecutivasCruces++;
                    contadorConsecutivasCaras = 0;
                    break;
                default:
                    System.out.println("ERROR: Esto no deberia haber sucedido. ");
                    break;
            }
        }
        System.out.println("El numero de veces que ha salido CARA en las " + numeroTiradas + " tiradas han sido " + contadorCaras + " veces y de CRUZ han sido un total de " + contadorCruces + " veces. \nDe manera consecutiva la parte CARA ha llegado a salir hasta " + auxConsecutivasCaras + " veces consecutivas y la parte CRUZ ha llegado a salir hasta " + auxConsecutivasCruces + " veces. ");
    }
}
