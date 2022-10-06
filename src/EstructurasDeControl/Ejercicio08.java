package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        /*
        * 8. Haz el ejercicio anterior, pero de forma que el usuario responda con un “sí” o con un
        “no” (en vez de true/false).
        *
        * */
            Scanner sc = new Scanner(System.in);
        System.out.println("Eeres culpable [Si/No]: ");
        String  respuesta = sc.nextLine();

        if(respuesta.equals("si")){
            System.out.println("Al talego!!");

        }else if(respuesta.equals("no")){

            System.out.println("A tu kelly!!");

        }else{

            System.out.println("No me baciles!!"
            );

        }
    }
}
