package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {

        /***
         *
         * 26. Hacer un programa que pida diez números por teclado y calcule su media.
         */
    Scanner sc = new Scanner(System.in);
        System.out.println("Se te irán pidiendo 10 numeros para sacar la media: ");
        double suma=0;
        int cont=0;
        for(int i = 0;i < 10;i++ ){

            double a = sc.nextDouble();
            suma += a;
            cont++;
        }
        System.out.printf("Media aritmética de los 10 números que me has dado: %.2f", (suma/cont) );


    }

}
