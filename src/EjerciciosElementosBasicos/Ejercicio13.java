package EjerciciosElementosBasicos;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        /*
        * 13. Imagina que eres un gerente de recursos humanos en un restaurante y necesitas
contratar a un chef. Para hacer eso, necesitas recopilar algunos datos preliminares
sobre los candidatos, concretamente 5 campos: nombre, edad, años de experiencia,
preferencia de cocina. Escribe un programa que lea todas las palabras (o números)
una a una e imprima lo siguiente: "El formulario de <NOMBRE>, de <EDAD> años
y <AÑOS DE EXPERIENCIA> de experiencia, está completo. Nos comunicaremos
con usted si necesitamos a alguien que cocine comida <PREFERENCIA DE
COCINA>"
        * */


        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Inserta tu edad: ");
        short edad = sc.nextShort();
        System.out.println("Inserta años de experiencia: ");
        short experiencia = sc.nextShort();
        sc.nextLine();
        System.out.println("Inserta tu preferencia de cocina: ");
        String tipoCocina = sc.nextLine();


        System.out.println("El formulario de " + nombre + ", de " + edad + " años y " +  experiencia + " años de experiencia, está completo. Nos comunicaremos con usted si necesitamos a alguien que cocine comida " + tipoCocina);



    }
}
