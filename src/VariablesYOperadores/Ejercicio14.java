package VariablesYOperadores;

public class Ejercicio14 {

    public static void main(String[] args) {

        /*
        * 14. Realiza un programa que calcule la longitud de una circunferencia de radio 3 metros.
        *
        * formula 2*PI*r
        * */
        double radio = 3;

        // NEW: el numero PI lo tenemos como Math.PI
        double circunferencia = 2 * Math.PI * radio;
        System.out.println(circunferencia);
        // NEW: para mostrar numeros con decimales con precision personalizada
        System.out.printf("La circunferencia tiene %.2f", circunferencia);
    }
}
