package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio38 {


    public static void main(String[] args) {
        /***
         * 38. Escribe un programa que pida numeros entre 1 y 100, ambos inclusive
         *
         *
         *
         */

        Scanner sc = new Scanner(System.in);
        int num=0;
        do{
            System.out.println("Mete números enteros entre 1 y 100, ambos inclusive: ");
            num=sc.nextInt();

        }while(num <1 || num>100);
        System.out.println(num);
    }
}
