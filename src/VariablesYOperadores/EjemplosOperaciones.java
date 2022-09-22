package VariablesYOperadores;

import java.util.Scanner;

public class EjemplosOperaciones {

    public static void main(String[] args) {


        // Pedir por teclado dos numeros y guardarlos en dos variables tipo entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Mete un número: ");
        int a = sc.nextInt();
        System.out.println("Mete otro número: ");
        int b = sc.nextInt();

        int suma = a + b;
        System.out.println("La suma de " + a + " + " + b + " da : " + suma);
        int resta = a - b;
        System.out.println("La resta de " + a + " - " + b + " da : " + resta);
        int producto = a * b;
        System.out.println("El producto de " + a + " * " + b + " da : " + producto);
        int cociente = a / b;
        System.out.println("El cociente de " + a + " / " + b + " da : " + cociente);
        int resto = a % b;
        System.out.println("El resto de " + a + " % " + b + " da : " + resto);


        // Crear variables que guarden el resultado de las 5 operaciones posibles
    } // MAIN

} // CLASS
