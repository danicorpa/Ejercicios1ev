package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {

        /*
        * 9. Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se
        comparan con dos valores guardados previamente. Si coinciden, se indica “Has
        entrado al sistema”, en caso contrario se da un error.
        *
        * */

        String usuario = "BenitoCamelas";
        String password = "yustedqueopinadelabortodelagallina";
        Scanner sc = new Scanner(System.in);
        System.out.println("Mete tu usuario: ");
        String user = sc.nextLine();
        System.out.println("Mete tu password: ");
        String pass = sc.nextLine();

        user.equals(usuario);




    }
}
