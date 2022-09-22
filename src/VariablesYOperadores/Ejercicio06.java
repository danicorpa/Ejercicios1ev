package VariablesYOperadores;


import java.util.Scanner;

public class Ejercicio06 {


    public static void main(String[] args) {

        /*6. N ardillas encuentran K nueces y deciden dividirlas equitativamente. Escribe un
        programa que calcule (y muestre) cuántas nueces corresponden a cada ardilla y
        cuántas sobrarán tras el reparto.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Mete el número de ardillas : ");
        int n = sc.nextInt();
        System.out.println("Mete el número de nueces : ");
        int k = sc.nextInt();

        System.out.println("Para repartir equitativamente todas las nueces hay que dividirlas ," + (k / n) + " para cada una y sacar el resto " + (k % n) + ", en caso de que sobren." );


    } //MAIN

} // CLASS
