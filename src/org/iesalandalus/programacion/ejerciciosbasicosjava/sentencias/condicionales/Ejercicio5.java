package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.print("Escriba su nota y le imprimire en pantalla si esta aprobado o no:");
        int nota = Entrada.entero();
        if ((nota >= 5) && (nota <= 10)) {
            System.out.println("Usted ha aprobado el examen. ");
        } else if ((nota >= 0) && (nota < 5)) {
            System.out.println("Usted ha suspendido el examen. ");
        } else {
            System.out.println("La calificacion obtenida es erronea, ya sea porque la ha escrito mal o porque es España no es valida ese tipo de calificación. ");
        }
    }
}
