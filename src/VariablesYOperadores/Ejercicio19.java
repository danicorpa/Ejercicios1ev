package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        /*
        * 19. Pide al usuario dos pares de números x 1 ,y 1 y x 2 ,y 2 , que representen dos puntos en el
plano. Calcula y muestra la distancia entre ellos.
(https://www.geometriaanalitica.info/formula-de-la-distancia-entre-dos-puntos-
geometria-ejemplos-y-ejercicios-resueltos/ )
        *
        * */

        System.out.println("Introduce dos pares de coordenadas x e y para calcular la distancia entre ellas: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Coord x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Coord x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Coord y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Coord y2: ");
        double y2 = sc.nextDouble();

        double dist = Math.sqrt((Math.pow(x2,2)-(Math.pow(x1,2)))+(Math.pow(y2,2)-Math.pow(y1,2)));
        System.out.println("La distencia entre x1 y x2, y1 e y2 es: " + dist);


    }
}
