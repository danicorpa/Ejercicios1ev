package VariablesYOperadores;

import java.sql.SQLOutput;

public class Ejercicio27 {

    /*
    * 27. Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha
calificación se compone de los siguientes porcentajes:
a. 55% del promedio de sus tres calificaciones parciales.
b. 30% de la calificación del examen final.
c. 15% de la calificación de un trabajo final.
    * */

    public static void main(String[] args) {

        double cal1 = 5;
        double cal2 = 7.5;
        double cal3 = 9.75;
        double promedio = (cal1+cal2+cal3)/3;
        double  examen = 8;
        double job = 9;

        double porcentaje1 = promedio* 0.55;
        double porcentaje2 = examen  * 0.3;
        double porcentaje3 = job     * 0.15;

        double total = porcentaje1+porcentaje2+porcentaje3;
        System.out.printf("La nota total es de %.2f ", total);

    }
}
