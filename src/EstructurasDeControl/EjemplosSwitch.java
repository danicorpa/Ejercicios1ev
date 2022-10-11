package EstructurasDeControl;

import java.util.Scanner;

public class EjemplosSwitch {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //System.out.println("Elije una acción: (1-4)");
        //int accion=sc.nextInt();
        String dia =sc.nextLine()

                ;
       /* if(accion == 1){
            System.out.println("Comenzar partida.");

        }else if (accion == 2){

            System.out.println("Cargando Partida.");

        }else if(accion==3){

            System.out.println("Mostrar ayuda.");

        }else if(accion == 4){

            System.out.println("Salir.");

        }else {

            System.out.println("Accion incorrecta.");

        }*/

        // Esto se puede poner de otra manera
        // Cuando en el if tienes == o equals --> evaluas el valor de una variable y según sea haces una cosa u otra


       /* switch(accion){

            case 1:
                System.out.println("Comenzar partida.");
             //   break;
            case 2:
                System.out.println("Cargando Partida.");
             //   break;
            case 3:
                System.out.println("Mostrar ayuda.");
             //   break;
            case 4:
                System.out.println("Salir.");
               break;
            default:
               System.out.println("Accion incorrecta.");
                break;

        }*/

        int contador = 0;
        /*switch (dia) {
            case "Lunes":
                contador = 1;
                break;
            case "Martes":
                contador = 2;
            case "Miércoles":
                contador = 3;
            case "Jueves":
                contador = 4;
            case "Viernes":
                contador = 5;
            default:
                contador = -1;
        };
        System.out.println(contador); // imprime 1

       contador = 0;
        switch (dia) {
            case "Lunes" -> contador = 1;
            case "Martes"-> contador = 2;
            case "Miércoles" -> contador = 3;
            case "Jueves" -> contador = 4;
            case "Viernes" -> contador = 5;
            default -> contador = -1;
        };
        System.out.println(contador);*/

        contador = switch (dia) {
            case "Lunes":
                yield 1;
            case "Martes":
                yield 2;
            case "Miércoles":
                yield 3;
            case "Jueves":
                yield 4;
            case "Viernes":
                yield 5;
            default:
                yield -1;
        };
        System.out.println(contador);

    }
}
