package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        /*
        * 6. A las marmotas les gusta organizar fiestas, y en sus fiestas les gusta comer tazas de
mantequilla de cacahuete. Pero no debe haber muchas, porque si no enferman. Una
fiesta de la marmota exitosa tendrá entre 10 y 20 tazas de mantequilla de cacahuete,
ambas inclusive, a menos que sea fin de semana, en cuyo caso necesitarán de 15 a 25
tazas.
Escribe un programa que lea dos valores:
• El primero es el número de tazas de mantequilla de cacahuete que hay en la
fiesta.
• El segundo es un booleano que indica si es fin de semana.
El programa debe imprimir si la fiesta tiene éxito o no (true o false).
7. Escribe un programa que pregunte al usuario si es culpable o no. Asumiremos que:
•
•
En caso afirmativo el usuario responderá true
En caso contrario responderá false.
Si el usuario responde true se le responderá “a la cárcel”. En caso contrario, “¡a casa!”.
        * */

        boolean finde;
        boolean exito;

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta numero de tazas (10 a 25): ");
        int tazas=sc.nextInt();
        System.out.println("Indoca si es finde: ");
        finde=sc.nextBoolean();

        if(tazas >= 10 && tazas <= 20 && !finde){

            exito=true;

        }else if(finde && tazas >= 15 && tazas <= 25){

            exito = true;
            System.out.println("La fiesta ha sido un exitazo!! ¡a casa!");

        } else{

            exito = false;
            System.out.println("La fiesta ha fracasado!! a la cárcel!!");
        }

    }
}
