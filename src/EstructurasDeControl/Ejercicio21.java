package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {

        /**
         *
         * 21. Escribe un programa que responda a un usuario que quiere comprar un helado en
         * una conocida marca de comida rápida cuanto le costará en función del topping que
         * elija.
         * • El helado sin topping cuesta 1.90€.
         * • El topping de oreo cuesta 1€.
         * • El topping de KitKat cuesta 1.50€.
         * • El topping de brownie cuesta 0.75€.
         * • El topping de lacasitos cuesta 0.95€.
         * • En caso de no disponer del topping solicitado por el usuario el programa escribirá
         * por pantalla «no tenemos este topping, lo sentimos. » y a continuación informará
         * del precio del helado sin ningún topping.
         * Finalmente, el programa escribe por pantalla el precio del helado con el topping
         * seleccionado (o ninguno).
         *
         *
         * */


        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que topping quieres: ");

        System.out.println("Sin topping       1,90€");
        System.out.println("Topping Oreo      1€");
        System.out.println("Topping KitKat    1,50€");
        System.out.println("Topping Brownie   0,75€");
        System.out.println("Topping Lacasitos 0,95€");

        String topping = sc.nextLine();

        case(topping){
            case "sin"     -> System.out.println("Precio  1,90€");
            case "oreo"    -> System.out.println("Precio  1€");
            case "kitkat"  -> System.out.println("Precio  1,50€");
            case "brownie" -> System.out.println("Precio  0,50€");


        };


    }
}
