package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio19 {


    public static void main(String[] args) {

        /*
        *
        * 19. Realizar un programa que pida un número entero por teclado y visualice el dia de la
            semana correspondiente.
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: (1-7)");
        int numero=sc.nextInt();
        switch(numero){

            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");






        };

    }
}
