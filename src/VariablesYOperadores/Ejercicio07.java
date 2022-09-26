package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio07 {


    /*
    * 7. Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a
cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40
minutos.
    *
    * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Mete una cantidad y te saco el numero de horas que hay: ");
        int minutos = sc.nextInt();


        // calculanmos cuantas horas y minutos corresponden a los minutos introducidos
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        // y muestre por pantalla a cuantas horas y minutos corresponde

        System.out.println(minutos + " Corresponde a " + horas + " horas con " + minutosRestantes + " minutos");
    }
}
