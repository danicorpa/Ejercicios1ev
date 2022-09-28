package VariablesYOperadores;

public class EjemploIncDec {

    public static void main(String[] args) {


        //  Se utilizan cuando queremos que una variable aumente o disminuya en una unidad

        int n = 10;
        System.out.println("1. " + n);
        // quiero aumentar una unidad
        n = n + 1;
        System.out.println("2. " + n);
        n++; // Aumenta n en una unidad despues de su uso
        System.out.println("3. " + n);
        n += 1;
        System.out.println("4. " + n);
        ++n;
        System.out.println("5. " + n);

        // Lo mismo para el decremento
        n = n -1;
        System.out.println("6. " + n);
        n -= 1;
        System.out.println("7. " + n);
        n--;
        System.out.println("8. " + n);
        --n;
        System.out.println("9. " + n);

        // Diferencia entre prefijo y sufijo
        int a = 4;
        int b = a++;
        System.out.println(b);
        System.out.println(a);


    }

}
