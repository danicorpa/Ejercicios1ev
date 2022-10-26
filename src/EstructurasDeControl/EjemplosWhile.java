package EstructurasDeControl;

import java.util.Scanner;

public class EjemplosWhile {

    public static void main(String[] args) {
        //vamos a hacer un bucle while que imprima los numeros del 0 al 4

        int i=0;
        while(i < 5){  // mientras i sea menor que 5 , imprimimos i

            System.out.println(i);
            i++;   // es importante que dentor del while haya alguna condición que haga que el bucle pare
                   // normalmente es una variable que cambie de valor

        }
        char letra ='A';
        while (letra <= 'Z'){
            System.out.println(letra);
            letra++;

        }

        int y=1;
        while(y<11){
            System.out.println(y);
            y+=2;

        }


        while(y>=0){
            System.out.println(y);
            y--;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Mete números enteros: ");
        int w=0;
        do{
             w=sc.nextInt();
             System.out.println(w);
        }while (w!=0);

    }
}
