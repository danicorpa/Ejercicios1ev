package VariablesYOperadores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        /*
        *
        * 17. Calcular el área de un triangulo ( base * altura)/2. Resuelve el ejercicio primero con
variables de tipo entero y después con variables de tipo float.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Te voy a calcular el área de un triángulo, para ello voy a necesitar que me des la base y la altura: ");
        int base = sc.nextInt();
        int altura = sc.nextInt();

        System.out.println("El área es (base * altura )/2, donde base es: " + base + " y la altura es : "+ altura +" con int : "+ ((base*altura)/2));
        System.out.println("El área es (base * altura )/2, donde base es: " + base + " y la altura es : "+ altura + " con float " + (((float)base * (float)altura)/2));

    }


}
