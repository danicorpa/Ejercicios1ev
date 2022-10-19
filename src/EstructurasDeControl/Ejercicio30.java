package EstructurasDeControl;

public class Ejercicio30 {

    public static void main(String[] args) {

        /**
         *
         * 30. Hacer un programa que calcule la suma y el producto de los 30 primeros números
         * naturales.
         *
         */
        int suma = 0;
        int prod = 1;

        System.out.println("La suma de los 30 primeros numeros naturales es: ");
        for(int i = 1;i < 31;i++){

            suma += i;

        }
        System.out.println(suma);
        System.out.println("El producto de los 30 primeros numeros naturales es: ");
        for(int i = 1;i < 31;i++){

            prod = prod * i;

        }
        System.out.println(prod);
    }
}
