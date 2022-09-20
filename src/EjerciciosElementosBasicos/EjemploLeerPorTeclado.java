package EjerciciosElementosBasicos;

import java.util.Scanner;

public class EjemploLeerPorTeclado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Ahora podemos meter datos por teclado
        // Para poder utilizarlos en el programa tengo que guardarlos en una variable
        // Las variables que guardan palabras o cadenas de textos son de tipo String
        System.out.println("Introduce tu nombre : ");
        // String nombre = sc.nextLine();
        String cadena = sc.nextLine();  // Escribe el nombre en la variable y lo pone en la variable
        System.out.print("Hola " + cadena);


    }

}
