package VariablesYOperadores;

public class Ejercicio25 {

    /*
    *
    * 25. Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente
desea saber cuanto deberá pagar finalmente por su compra.
    * */

    public static void main(String[] args) {

        double precio = 345.5;
        double desc = 15;

        double porcentajeCalculado=precio*(desc/100);
        double precioFinal=precio-porcentajeCalculado;

        System.out.printf("El descuento del 15%% de %.2f es %.2f" , precio, porcentajeCalculado);
        System.out.printf(" por lo tanto deberá pagar %.2f", precioFinal);

    }
}
