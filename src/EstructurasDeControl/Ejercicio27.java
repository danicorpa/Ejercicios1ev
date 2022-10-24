package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio27 {


    public static void main(String[] args) {


        /***
         *
         * 27 . Escribe un programa que, dado un número n introducido por teclado, dibuje un
         * cuadrado de dimensiones n * n, con un carácter también introducido por teclado.
         *
         *
         *  Hay que controlar que nos cuelen solo un número entero
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo: ");

        int num = sc.nextInt();

        if(num <=0 ){

            System.out.println("El número debe ser un número entero!! Melón!!");

        }else {

            // Ahora pedimos un carácter para hacer el cuadrado
            System.out.println("Introduce un carácter: ");
            char c =sc.next().charAt(0);

            // Ahora dibujamos el cuadrado
            // El for externo para las filas
            for(int i=0;i < num; i++){

                for(int j=0;j<num;j++){

                    System.out.print(c+" ");

                }
                System.out.println();
            }

        }



    }
}
