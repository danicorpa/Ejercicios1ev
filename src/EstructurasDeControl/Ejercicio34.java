package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio34 {

    public static void main(String[] args) {

        /***
         * 34. Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de
         * números a introducir). El programa debe informar de cuantos números introducidos
         * son mayores que 0, menores que 0 e iguales a 0.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cantidad de núnmeros que voy a tratar: ");
        int cant = sc.nextInt();
        int cont_pos=0;
        int cont_neg=0;
        int cont_0=0;
        int num=0;

        for(int i=0;i<cant;i++){

            num = sc.nextInt();
            if(num>0){

                cont_pos++;

            }else if(num==0){

                cont_0++;

            }else{

                cont_neg++;
            }


        }

        System.out.println();
        System.out.println("Cantidad de Numeros > que 0: " + cont_pos);
        System.out.println("Cantidad de Numeros = que 0: " + cont_0);
        System.out.println("Cantidad de Numeros < que 0: " + cont_neg);



    }
}
