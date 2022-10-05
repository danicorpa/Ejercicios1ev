package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio23 {

    /*
    * 23. Realiza un programa que pida un número y un porcentaje, y
a. Calcule y muestre ese número incrementado en ese porcentaje.
b. Calcule y muestre ese número decrementado en ese porcentaje.
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce un porcentaje: ");
        double num2 = sc.nextDouble();
        double num3 = num1*(num2/100);
        double aumento = num3+num1;
        double decremento = num1-num3;

        System.out.println("Aumento "+ num1 +" en un "+num2+"% es "+ aumento );
        System.out.println("Decremento "+num1 +"en un "+num2+"% es "+ decremento);


    }
}
