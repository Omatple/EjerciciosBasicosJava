package org.iesalandalus.programacion.ejerciciosbasicosjava.sentencias.ejerciciosvariados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Escriba dos numero que esten comprendido entre 0 y 50(ambos incluidos) y al menor comenzare a sumarle 5 y al mayor comenzare a restarle 2. Los resultados los ire mostrando en pantalla hata que el menor sea mayor que el mayor. ");
        int numero1, numero2, aux;
        System.out.print("1º Numero: ");
        numero1 = Entrada.entero();
        while (!((numero1 >= 0) && (numero1 <= 50))) {
            System.out.print("ERROR: El numero escrito no se encuentra dentro de los valores establecidos: ");
            numero1 = Entrada.entero();
        }
        System.out.print("2º Numero: ");
        numero2 = Entrada.entero();
        while (!((numero2 >= 0) && (numero2 <= 50))) {
            System.out.print("ERROR: El numero escrito no se encuentra dentro de los valores establecidos: ");
            numero2 = Entrada.entero();
        }
        if (numero2 < numero1) {
            aux = numero2;
            numero2 = numero1;
            numero1 = aux;
        }
        do {
            System.out.print("El numero menor '" + numero1 + "' + 5 = ");
            numero1 += 5;
            System.out.print(numero1);
            System.out.print(". El numero mayor '" + numero1 + "' + 2 = ");
            numero2 -= 2;
            System.out.println(numero2);
        } while (numero1 <= numero2);
        System.out.println("El numero inicial menor al sumarle 5 y restarle 2 al numero mayor, el menor ha acabado siendo mayor que el propio numero mayor. \n" + numero1 + " > " + numero2);
    }
}
