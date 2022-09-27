package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        /*
        *
        * 10. Dado un número de dos dígitos, imprime su primer número (las decenas).
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Intorduce un numero de dos cifras: ");
        int n = sc.nextInt();

        int d = n / 10;
        int u = n % 10;

        System.out.println("El numero que me has dado está formado por "+ d +" decenas y "+ u +" unidades");

    }
}
