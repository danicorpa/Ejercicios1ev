package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio16 {

    /*
    *
    * 16. Realiza un programa que pida el lado de un cuadrado, y muestre por pantalla el
perímetro del mismo (El perímetro de un cuadrado se calcula multiplicando el valor
del lado por cuatro).
    *
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el lado de un cuadrado y te devuelvo el perímetro: ");

        int lado = sc.nextInt();

        System.out.println("El perímetro del cadrado de lado " + lado + " es " + (lado*4));


    }
}
