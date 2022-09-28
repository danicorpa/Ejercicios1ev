package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        /*
        *
        * 11. Dado un número de dos cifras, escribe un programa que permita obtener el número
            invertido. Ejemplo, si se introduce 23 que muestre 32.
        *
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de dos cifras y yo te lo invierto: ");
        int n = sc.nextInt();

        //int dec = n / 10;
        //int uni = n % 10;

        System.out.println((n%10)+""+(n/10));


    }
}
