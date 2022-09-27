package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        /*
        *
        * 18. Hacer un programa que lea una temperatura en grados centígrados, y la calcule y
visualice en las escalas: (reamur, Fahrenheit y kelvin). Teniendo en cuenta:
Reamur = Centígrados x 0.8
Fahenheit = (Centígrados * 9/5)+32
Kelvin = Centígrados + 273
        *
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una temperatura y decvuelvo su equivalencia en reamur, Fahrenheit y Kelvin: ");
        double t = sc.nextDouble();

        double r = t * 0.8;
        double f = (t * (9/5)) + 32;
        double k = t + 273;

        System.out.println("Centígrados a Reamur " + r);
        System.out.println("Centígrados a Fahrenheit " + f);
        System.out.println("Centígrados a Kelvin" + k);
        ;
    }

}
