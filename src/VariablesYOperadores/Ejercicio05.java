package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        /*
        * 5. Escribe un programa que lea un valor entero n de la entrada estándar y muestre el
            resultado de la siguiente expresión aritmética:
        *
        *           ((n + 1) * n + 2) * n + 3
        *
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Mete un número entero : ");

        int n = sc.nextInt();

        int resultado = ((n + 1)*n+2)*n+3;

        System.out.println("El resuñtado de ((n + 1) * n + 2) * n + 3 es : " +resultado);

    } // MAIN


} // CLASS
