package VariablesYOperadores;

public class EjemploCasting {

    public static void main(String[] args) {

        /*
        *
        *
        *
        * */
        int num=100;
        long numeroGrande = num; // Puedo asignar un int a un long sin problema, (casting implicito)

        long numeroGrande2 = 101;
        int entero = (int) numeroGrande2; // casting explicito

        short numeroCorto = (short) num;

        char letra = 'a';
        int letraASCII = letra;
        System.out.println(letraASCII);
        float decimal = 3.1416f;
        double decimalDouble = decimal;
        double decimalDoble2 = 3.141654545454545;
        float decimal2= (float) decimalDoble2;
        System.out.println(decimal2);

        // Pasar de double a int
        int entero32bits= (int) decimalDoble2;

        System.out.println(entero32bits);
    }
}
