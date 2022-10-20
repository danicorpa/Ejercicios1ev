package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {


        /***
         *33. Escribe un programa que, dados dos números, uno real (base) y un entero positivo
         * (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el
         * método el método Math.pow()
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 numeros enteros, uno será la base y el segundo el exponente: ");
        System.out.println("Base: ");
        int base = sc.nextInt();
        System.out.println("Exponente: ");
        int exponente = sc.nextInt();
        int ac = 1;

        for(int i = 0;i<exponente;i++){

            ac *= base;

        }

        System.out.println("El resultado es "+ ac);
    }
}
