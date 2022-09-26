package VariablesYOperadores;


import java.util.Scanner;

public class EjemplosDecimales {

    public static void main(String[] args) {

        // tipo double
        double ceroComaCero = 0.0;
        double unoComaCero = 1.0;
        double decimalNegativo = -1.4507;

        // tipo float
        float decimalFloat = 1.3f;
        float decimalLargo = -3.1234567577675756765474868f;
        System.out.println(decimalLargo ); // perdemos precision
        // notacion cientifica
        double eps = 5e-3; // es lo mismo que 5 * 10⁻³ = 0.003
        System.out.println(eps);
        double n = 0.01e2; // es lo mismo que 0,101 *10² = 1.0
        System.out.println(n);

        // Operaciones aritmeticas
        System.out.println("Suma : " + (eps + n));
        System.out.println("Resta : " + (eps - n));
        System.out.println("Producto . " + (eps * n));
        System.out.println("Division = " + (eps / n));
        // no tiene sentido hacer el % resto

        // ¿Que ocurre si divides numeros int y los guardas en variable decimal?
        double d1 = 5 / 4;
        System.out.println("División 1:" + d1);
        double d2 = 5.0 / 4.0;
        System.out.println("Division 2:  " + d2);

        // falta de precision a veces con las variables primitivas decimales
        System.out.println(3.3 / 3); // Imprime 1.999999999999

        double d = 0.1 + 0.1 + 0.1 + 0.1 +0.1 + 0.1 +0.1 + 0.1 +0.1 + 0.1;
        System.out.println(d); // imprime 0.999999999999

        // Leer desde teclado
        Scanner sc = new Scanner(System.in);
        float decimalPorTeclado = sc.nextFloat(); // los numeros decimales
        System.out.println(decimalPorTeclado);
        double doublePorTeclado = sc.nextDouble();
        System.out.println(doublePorTeclado);
    }
}
