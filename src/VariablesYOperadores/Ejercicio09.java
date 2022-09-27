package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio09 {


    public static void main(String[] args) {

        /*
        * 9. Escribe un programa que calcule (y muestre) cuántas horas, minutos y segundos han
transcurrido entre dos momentos del mismo día. Para ello, el programa ha de pedir
por teclado seis números enteros: las horas, minutos y segundos para el momento
inicial y lo mismo para el momento final. De momento vamos a considerar que los
números introducidos van a estar en el rango adecuado y que el momento inicial
introducido es menor (o igual) que el momento final. Por ejemplo, si se introducen
los números 1, 2, 30,15, 21, 1 entenderemos que el momento inicial es 1:02:30 am y
el momento final es 15:21:1. El programa debe mostrar por pantalla la diferencia en
el formato: hh:mm:ss.
        *
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("MOMENTO INICIAL");
        System.out.println("===============");
        System.out.println("Introduce la hora: ");
        int hora1 = sc.nextInt();

        System.out.println("Introduce los minutos: ");
        int minutos1 = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int segundos1 = sc.nextInt();

        //Scanner sc = new Scanner(System.in);
        System.out.println("MOMENTO FINAL");
        System.out.println("=============");
        System.out.println("Introduce la hora: ");
        int hora2 = sc.nextInt();

        System.out.println("Introduce los minutos: ");
        int minutos2 = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int segundos2 = sc.nextInt();

        System.out.println("Datos introducidos: Momento inicial : " + hora1 + ":"+ minutos1 + ":" + segundos1 + " \t  Momento Final " + hora2 + ":" + minutos2 +":" + segundos2);

        // Pasamos la hora inicial a segundos:
        int hora_segundos = hora1 * 60 * 60;
        int minutos_segundos = minutos1 * 60;
        int momento_inicial = hora_segundos + minutos_segundos + segundos1;
        //System.out.println(momento_inicial);


        // Pasamos la hora final a segundos:
        int hora_segundos2 = hora2 * 60 * 60;
        int minutos_segundos2 = minutos2 * 60;
        int momento_final = hora_segundos2 + minutos_segundos2 + segundos2;
        //System.out.println(momento_final);

    int diferencia_segundos = momento_final - momento_inicial;
        System.out.println(diferencia_segundos);

        int segundos_diferencia = diferencia_segundos % 60;
        int minutos_total_diferncia = diferencia_segundos / 60;
        int hora_difrencia = minutos_total_diferncia / 60;
        int minutos_diferencia = minutos_total_diferncia % 60;
        System.out.println( "La diferencia entre momentos es " + hora_difrencia + ":" +minutos_diferencia +":" + segundos_diferencia);
    }
}
