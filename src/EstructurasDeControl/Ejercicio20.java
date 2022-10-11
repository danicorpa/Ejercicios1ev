package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio20 {


    public static void main(String[] args) {

        /**
         * 20. Escribe un programa que lea dos números enteros positivos, y pida la operación que
         * quiere realizar con estos (+, -, *, /). El programa debe realizar la operación pedida y
         * visualizar el resultado. En caso de que el símbolo introducido no sea correcto,
         * visualizar: operación incorrecta.
         *
         *
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Elige operación: (+,-,*,/)");
        char c1 = sc.next().charAt(0);

        switch(c1){

            case '+':
                System.out.println("La suma de "+n1+" + "+n2+" da como resultado "+(n1+n2));
                break;
            case '-':
                System.out.println("La resta de "+n1+" - "+n2+" da como resultado "+(n1-n2));
                break;
            case '*':
                System.out.println("El producto de "+n1+" * "+n2+" da como resultado "+(n1*n2));
                break;
            case '/':
                System.out.println("La division de "+n1+" / "+n2+" da como resultado "+(n1/n2));
                break;
            default:
                System.out.println("Ere un capullo!!");


        };
    }
}
