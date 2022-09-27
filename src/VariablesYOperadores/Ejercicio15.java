package VariablesYOperadores;

public class Ejercicio15 {

    public static void main(String[] args) {

        /*
        *
        * 15 - Realiza un programa que calcule el área de una circunferencia de radio 5,2
centímetros.
        * */

        double r = 5.2;
        double a = Math.PI * Math.pow(r,2);

        System.out.print("EL area de un círculo es PI * r², siendo r = 5,2cm : ");
        System.out.printf("%.2f", a);
        System.out.print("cm");
    }
}
