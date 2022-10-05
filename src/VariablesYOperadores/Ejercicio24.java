package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {

        /*
        * 24. Realiza un programa que pida el precio de venta de un producto, la cantidad de
productos comprados y el porcentaje de IVA aplicado. El programa mostrará el
importe a abonar.
        *
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.println("Inserta cantidad de productos comprados: ");
        int cant = sc.nextInt();
        sc.nextLine();
        double iva = 10;
        double porcentaje = precio*(iva/100);

        System.out.println(porcentaje);
        System.out.println("El precio total es "+((precio+porcentaje)*cant)+"");
    }
}
