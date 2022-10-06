package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

     /*
     * 7. Escribe un programa que pregunte al usuario si es culpable o no. Asumiremos que:
•
•
            En caso afirmativo el usuario responderá true
            En caso contrario responderá false.
     *
     * */

        System.out.println("Eres culpable?? Pon true para si y flase para no.");
        Scanner sc = new Scanner(System.in);
        boolean respuesta = sc.nextBoolean();


        if(respuesta){

            System.out.println("Eres culpable!! Al talego!!");

        }else{

            System.out.println("Vete de aqui, eres inocente!!");

        }


    }
}
