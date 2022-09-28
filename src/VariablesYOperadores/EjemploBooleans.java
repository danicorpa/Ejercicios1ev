package VariablesYOperadores;

public class EjemploBooleans {

    public static void main(String[] args) {

        boolean apto = false;
        System.out.println("Es apto? " + apto);


        // Operadores lógicos
        // Pueden ser unario si acepta solo una variable
        // Binarios si aceptan dos variables
        // Unario: ! --> not
        // Unario
        // NOT o !
        System.out.println(!apto);
        // Binarios
        // AND o &&
        boolean v1 = true;
        boolean v2 = true;
        System.out.println("AND");
        System.out.println("===");
        boolean v3 = v1 && v2;
        System.out.println(v3);

        // OR o ||
        System.out.println("OR");
        System.out.println("==");
        boolean v4 = v1 || v2;
        System.out.println(v4);

        // XOR o ^
        System.out.println("XOR");
        System.out.println("===");
        boolean v5 = v1 ^ v2;
        System.out.println(v5);

        boolean frío = false; // no hace frío
        boolean seco = true; // hace tiempo seco
        boolean verano = false; // no estamos en verano
        boolean trekking = seco && (!frío || verano);
        System.out.println(trekking);

    }

}
