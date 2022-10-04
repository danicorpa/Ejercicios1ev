package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {


        /*
        * 3. Escribe un programa que pida dos números e indique si el primero es mayor que el
segundo o no.
        *
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro numero entero: ");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("El numero "+num1+" es mayor que el numero "+num2);
        }else{
            System.out.println("El numero "+num1+" es menor que el numero "+num2);
        }


    }
}
