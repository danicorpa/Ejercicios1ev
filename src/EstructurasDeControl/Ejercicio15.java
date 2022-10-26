package EstructurasDeControl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        /**
         * 15. Tenemos un programa que pregunta a los estudiantes qué lenguaje de
         * programación están estudiando. Hay cuatro opciones, una de las cuales es correcta:
         * 1.Java
         * 2.Kotlin
         * 3.Scala
         * 4.Python
         * Tu tarea consiste en leer el número de respuesta de la entrada estándar y generar
         * el resultado de la prueba: " ¡Sí! ", " ¡No! " u "Opción desconocida". La respuesta
         * correcta es Java (obviamente).
         *
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el lenguaje que estudias: (1/4)");
        int num = sc.nextInt();

        switch(num){
            case    1:
                System.out.println("Correcto!!");
                break;
            case    2:
            case    3:
            case    4:
                System.out.println("Incorrecto, Melón!!");
                break;
            default:
                System.out.println("Melón!! Mete un número entre 1 y 4!!");
        }
    }
}
