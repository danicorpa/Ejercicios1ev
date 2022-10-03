package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {


        /*
        *
        * 20. Realizar un programa que lea cuatro valores numéricos e imprima su suma y su
            media. Ten en cuenta que la media puede contener decimales.
        *
         *
         */

            Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 4 numeros y te doy sus suma y su media: ");
            int num1= sc.nextInt();
            int num2= sc.nextInt();
            int num3= sc.nextInt();
            int num4= sc.nextInt();
            int suma = num1 +num2+num3+num4;
            double media = suma / 4;
        System.out.println("La suma total es " +suma+" y su media es "+ media);

    }
}
