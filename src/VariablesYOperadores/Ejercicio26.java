package VariablesYOperadores;

public class Ejercicio26 {

    public static void main(String[] args) {

        /*
        * 26. Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el
vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las
tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta
su sueldo base y comisiones.
        * */

        double salarioBase=1000;
        double comision=10;
        double venta1 = (comision/100)*300;
        double venta2 = (comision/100)*500;
        double venta3 = (comision/100)*40;
        double comisionCalculada=venta1+venta2+venta3;
        System.out.printf("El importe de las comisiones es %.2f ", comisionCalculada);
        System.out.printf("Por lo tento cobrará %.2f", salarioBase+comisionCalculada);





    }
}
