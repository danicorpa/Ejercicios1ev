package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio25b {


    public static void main(String[] args) {


        /**
         *
         * 25. Hacer el ejercicio anterior, pero sin asumir que el primer número es menor que el
         * segundo. Es decir, pedir dos números enteros por teclado e imprimir la suma de todos
         * los números enteros desde el menor hasta el mayor, ambos inclusive.
         *
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un numero emtero: ");
        int a = sc.nextInt();
        System.out.println("Inserta otro numero entero: ");
        int b = sc.nextInt();
        int suma = 0;
        int menor, mayor;

        if (a < b) {

            menor = a;
            mayor = b;


        } else {

            menor = b;
            mayor = a;

        }


        for (int i = menor; i <= mayor; i++) {

            suma += i;
            System.out.println(suma);

        }
    }

}
