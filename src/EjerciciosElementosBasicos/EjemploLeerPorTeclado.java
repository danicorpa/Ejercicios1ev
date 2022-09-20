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
        String nombre = sc.nextLine();  // Escribe el nombre en la variable y lo pone en la variable
        System.out.println("Introduce tu apellido : ");
        String apellido = sc.nextLine();
        System.out.println("Cuantos años tienes ? ");
        int edad = sc.nextInt();
        /* El método nexInt() de scanner tiene un problema, que hace un retorno de carro y hace que el siguiente metodo que vayamos a usar de scanner se lo salte.
        * Para solucionarlo hay que meter un comando adicional nextline() para resetear el retorno de carro.*/
        String c = sc.nextLine();
        System.out.print("Hola " + nombre + " " + apellido + "! Como te va??" +  "Con esta edad " + edad + " estas hecho un chaval!!");
        System.out.println("Tienes mascotas ?? ");
        String mascota = sc.nextLine();
        System.out.println("Vaya que d'abutten!!");
        System.out.println("Cuanto dinero tienes ?? ");
        double pasta = sc.nextDouble();
        System.out.println("Vaya paston tienes, pirata!!" + pasta);
        // Los decimales se escriben en el código se pone con punto .
        // Cuando ponemos los datos por teclado se pone con coma ,
    }

}
