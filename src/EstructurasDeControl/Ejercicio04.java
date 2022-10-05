package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio04 {

    /*
    * 4. Dentro de una clase Joven tenemos las variables enteras edad, nivelDeEstudios e
        ingresos. Necesitamos almacenar en la variable boolean jasp el valor:

        a. true, si la edad es menor o igual a 28 y el nivelDeEstudios es mayor que tres, o
        bien la edad es menor de 30 y los ingresos superan los 28.000 euros.
        b. false, en caso contrario.
Escribe el código necesario.
    * */

    public static void main(String[] args) {

        int edad=29;
        int nivelDeEstudios=4;
        int ingresos=29000;
        boolean jasp;

        if((edad<=28 && nivelDeEstudios>3) | (edad<30 && ingresos>28000)){
            jasp = true;
            System.out.println("Eres de mi generación!! (jasp)");

        }else{
            jasp = false;
            System.out.println("Eres de la generación Z!! Milenial!!");
        }
        if (jasp){
            System.out.println("Eres Joven Aunque Sobradamente Preparado!!");
        }



    }
}
