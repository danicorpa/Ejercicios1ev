package VariablesYOperadores;

import java.util.Scanner;

public class EjemplosOperadoresRelacionales {

    public static void main(String[] args) {

        // Sireven para comparar dos numeros y dan como resultado un boolean

        int num1 = 25;
        int num2 = 23;

        num2 = num1; // Asignacion de num1 a num2

        boolean comparacion = num2 == num1; // Comparacion de dos valores y el resultado se asigna en la variable comparacion

        boolean otra_comparacion = num1 != num2;  //

        int nueve = 9;
        int otronueve = 9;
        int diez = 10;

        System.out.println(nueve > otronueve);
        System.out.println(nueve >= otronueve);

        int edad = 18;
        System.out.println("¿Mayor de edad? " +(edad > 17));
        System.out.println("¿Mayor de edad? " +(edad >= 18));

        // Cuando apaarecen operadores mezclados
        // 1. parentesis
        // 2. Inc-dec
        // 3. Operaciones aritmeticas
        // 4. Operadores relacionales
        // 5. Operacores logicos

        int num = 1000;
        boolean resultado = num +10 > num +9;
        System.out.println(resultado);

        // Unir operaciomes relacionales usando operadores logicos

        int a = 5;
        int b = 6;
        int c = 7;
        // Quiero saber si a <= b <= c
        // System.out.println(a<=b<=c);
        // Hay que hacer la comparacion de dos en dos con un and
        System.out.println(a <= b && b <= c);

        // Ejemplo : pedimos tres estaturas por teclado y queremos ver si estan en orden ascendente

        // Tambien comprobamos si estan en orden descendente

        Scanner sc = new Scanner(System.in);
        int estatura1 = sc.nextInt();
        int estatura2 = sc.nextInt();
        int estatura3 = sc.nextInt();

        boolean ordenascendente = (estatura3 >= estatura2 && estatura2 >= estatura1);
        boolean ordendescendente =  (estatura1 <= estatura2 && estatura2 <= estatura3);;

        System.out.println("Orden ascendente = " + ordenascendente);
        System.out.println("Orden descendente = " + ordendescendente);


    }

}
