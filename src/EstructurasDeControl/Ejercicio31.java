package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {


        /**
         *
         * 31. Hacer un programa que calcule el factorial de un número pedido por teclado. (Ejemplo:
         * el factorial de 5 sería 5 * 4 * 3 * 2 * 1; el de 4 sería 4* 3 * 2 * 1, etc.)
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número y te saco el fatorial de ese número.");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i = num;i > 0;i--){

            factorial *= i;


        }
        System.out.println("El factorial de " + num +" es " + factorial);
    }
}
