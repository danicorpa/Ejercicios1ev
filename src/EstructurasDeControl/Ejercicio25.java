package EstructurasDeControl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio25 {


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

        if (a < b) {
            for(int i = a; i <= b; i++) {

                suma += i;
                System.out.println(suma);

            }
        } else {
            for(int i = b; i <= a; i++) {

                suma += i;
                System.out.println(suma);
            }

        }

    }
}
