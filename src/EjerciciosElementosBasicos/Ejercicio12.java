package EjerciciosElementosBasicos;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

/*
* 12. Escribe un programa que lea tres cadenas de texto y las muestre en orden
inverso, cada una en una nueva línea.
* */
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra1 = sc.nextLine();
        System.out.println("Introduce una palabra: ");
        String palabra2 = sc.nextLine();
        System.out.println("Introduce una palabra: ");
        String palabra3 = sc.nextLine();

        System.out.println(palabra3);
        System.out.println(palabra2);
        System.out.println(palabra1);



    }
}
