package EstructurasDeControl;

import java.security.SignatureSpi;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        /**
         *
         * 13. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
         * la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la
         * venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto
         * recibirá un productor por la uva que entrega en un embarque, considerando lo
         * siguiente:
         * a. Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño
         *      1; y 30 céntimos si es de tamaño 2.
         * b. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos
         *      cuando es de tamaño 2.
         *
         * Variables:
         * precioInicial = double
         * precioAnadido = double
         * preciototal = double
         * tipo = char
         * tamaño = int
         *
         *
         *
         *
         *
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del kg de uvas: ");
        double precioInicial = sc.nextDouble();
        System.out.println("Introduce tipo de UVA: (A/B)");
        char tipo = sc.next().charAt(0);
        System.out.println("Inserta tamaño de uva: (1/2)");
        int size = sc.nextInt();
        System.out.println("Inserta cantidad de uvas: (kg)");
        int kg = sc.nextInt();

        double precioTotal = 0;
        double precioAnadidio = 0;
        if((tipo=='A' || tipo=='a') && size==1){
            precioAnadidio = precioInicial + 0.20;

        }else if((tipo=='A' || tipo=='a') && size==2){
            precioAnadidio = precioInicial + 0.30;


        }else if((tipo=='B' || tipo=='b') && size==1){
            precioAnadidio = precioInicial - 0.30;

        }else if((tipo=='B' || tipo=='b') && size==2){
            precioAnadidio = precioInicial - 0.50;

        }else{
            System.out.println("Introduce los datos bien, Melón!!");


        }

        System.out.printf("A pagar %.2f", (precioAnadidio*kg));

    }
}
