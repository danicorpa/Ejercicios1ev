package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {


        /*
        *
        * 8. Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este
tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos
son 3 horas, 30 minutos y 10 segundos.
        *
        * */
        int minutos = 0;
        int horas   = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mete una cantidad de segundos y te saco las horas:minutos.segudos: ");
        int segundos = sc.nextInt();

        minutos = segundos / 60;
        horas   = minutos / 60;

        System.out.println(segundos + " Da como resultado "+ horas + " horas " + ( minutos % 60) + " minutos "+ (segundos % 60)+" segundos" );
        System.out.println(minutos);

    }
}
