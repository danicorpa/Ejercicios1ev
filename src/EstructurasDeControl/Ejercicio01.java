package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        /*
        * 1. Escribe un programa que pida un número e indique si es par o impar (un número es
par si al dividirlo entre 2 el resto es 0).
        *
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("El numero es par.");

        }else{
            System.out.println("El numero no es par");
        }


    }
}
