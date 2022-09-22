package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio04 {

/*
*
* 4. Escribir un programa en el cual se piden cuatro números y se calcule e imprima la
suma de los dos primeros y el producto del tercero y el cuarto.
* */

    public static void main(String[] args) {


        // Pedimos 4 numeros por teclado.

        Scanner sc = new Scanner(System.in);

        System.out.println("Mete primer número entero : ");
        int a = sc.nextInt();
        System.out.println("Mete segundo número entero : ");
        int b = sc.nextInt();
        System.out.println("Mete tercero número entero : ");
        int c = sc.nextInt();
        System.out.println("Mete cuarto número entero : ");
        int d = sc.nextInt();

        System.out.println("La suma del primer y segundo número es : " + (a + b));
        System.out.println("El producto del tercero y cuarto número es : " + (c * d));

    } // MAIN


} // CLASS


