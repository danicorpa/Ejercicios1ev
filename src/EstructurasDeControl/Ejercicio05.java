package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        /*
        * 5. Programa que solicita 10 números por teclado y al concluir escribe el mayor y menor
de ellos.
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 10 numeros y te indico cual es el mayor y cual es el menor: ");
        // Al pedir el primer numero es el mayoy y el menor
        int num1=sc.nextInt();
        int max=num1;
        int min=num1;
        int num2=sc.nextInt();
        if(num2>max){
            max=num2;
        }
        if(num2<max){
            min=num2;
        }

        int num3=sc.nextInt();
        if(num3>max){
            max=num3;
        }
        if(num3<max){
            min=num3;
        }
        int num4=sc.nextInt();
        if(num4>max){
            max=num4;
        }
        if(num4<max){
            min=num4;
        }
        int num5=sc.nextInt();
        if(num5>max){
            max=num5;
        }
        if(num5<max){
            min=num5;
        }
        int num6=sc.nextInt();
        if(num6>max){
            max=num6;
        }
        if(num6<max){
            min=num6;
        }
        int num7=sc.nextInt();
        if(num7>max){
            max=num7;
        }
        if(num7<max){
            min=num7;
        }
        int num8=sc.nextInt();
        if(num8>max){
            max=num8;
        }
        if(num8<max){
            min=num8;
        }
        int num9=sc.nextInt();
        if(num9>max){
            max=num9;
        }
        if(num9<max){
            min=num9;
        }
        int num10=sc.nextInt();
        if(num10>max){
            max=num10;
        }
        if(num10<max){
            min=num10;
        }

        // Usaremos dos variables auxiliares:
        // max : valor mayor
        // min : valor menor

        System.out.println("El numeor más grande es "+ max + " y el numero más pequeño " +min);

    }
}
