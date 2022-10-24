package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {

        /***
         * 28. Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un
         * rectángulo en que la base sea el número mayor y la altura el número menor, con un
         * carácter también introducido por teclado.
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un número entero: ");
        int num1 = sc.nextInt();
        System.out.println("Inserta otro número entero: ");
        int num2 = sc.nextInt();

        if(num1 <=0 || num2 <=0 ){

            System.out.println("El número debe ser un número entero!! Melón!!");

        }else {
                if(num1>num2){
                    // Ahora pedimos un carácter para hacer el cuadrado
                    System.out.println("Introduce un carácter: ");
                    char c =sc.next().charAt(0);

                    // Ahora dibujamos el cuadrado
                    // El for externo para las filas
                    for(int i=0;i < num2; i++){

                        for(int j=0;j<num1;j++){

                            System.out.print(c+" ");

                        }
                        System.out.println();
                    }
                }else{

                    System.out.println("Debes meter primero base y luego altura!! Melón!!");

                }


        }



    }
}
