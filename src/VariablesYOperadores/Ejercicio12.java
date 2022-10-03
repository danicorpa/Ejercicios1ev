package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        /*
        *12. Escribe un programa que lea un número de tres cifras y muestre el número invertido.
Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si
introducimos 976, el programa debe mostrar 679.
        *
        * */
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero de 3 cifras: ");
    int num = sc.nextInt();
    int num2 = num;
   /* int d = 100;
    int c = 10;
    num = num / d;
    num2 = num2 % c;*/
        System.out.println("El resultado es " + num%10 + ""+ num /10 +"" + num / 100);


    }


}
