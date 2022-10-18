package EstructurasDeControl;


import java.util.Scanner;

public class EjemplosIf {

    public static void main(String[] args) {


        /*
        * Secuencia de control
        * if = condicional que ejecuta las lineas de codigo si se cumple la condicion dentro de los parentesis
        *
        * */

        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        if(edad>100){

            System.out.println("Eres una persona con  mucha experiencia.");
        }


        // Si la condicion es de tipo boolean, podemos simplificar poniendo solo la variable sin poner igualdad
        boolean semaforoAbierto = false;
        if(semaforoAbierto) {
            System.out.println("Abierto, puede pasar");
        } else {
            System.out.println("Detente, por favor.");

        }

         */
        /*
        System.out.println("Introduce un numero: ");

        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("El numero "+num+" es par.");
        }else {
            System.out.println("El numero "+num+" es impar.");
        }

         */

        System.out.println("Tipo de suspcripcion: Basica = 100  Medium = 200 Premium = 300");
        int presupuesto= sc.nextInt();

        if(presupuesto < 100){
            System.out.println("Pirate a tu casa!!");
        }else  if(presupuesto >= 100){
            System.out.println("Tu suscripcion sera Basica. Vamos, chaval, animate!!");
        }else if(presupuesto>=200){
            System.out.println("Tu suscripcion sera Medium. Animate que tendras el porno!!");
        }else {
            System.out.println("Esta noche tiririrí, tiririrí!!");
        }
    }

}
