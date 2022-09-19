package EjerciciosElementosBasicos;

public class LasVariables {

    public static void main(String[]  args) {
        // Variables
        int a = 5; // Declara la variable a y a continuación guarda en ella el valor 5
        System.out.println("La variable vale " + a);
        // Su valor puede ser modificado en cualquier momento
        a = 7;
        System.out.println("La variable vale " + a);
        // Las variables se declaran en minúscula

        // Reglas para nombrar variables
        // No pueden empezar por caracteres especiales excepto _ o $
        //int % q= 5;
        // No puede empezar por ningún dígito
        //int 5c = 5; // No compila
        // Puede contener cualquier letra o dígitoo puede contener espacios.
        System.out.println("TIPOS DE VARIABLES");
        System.out.println("===================");
        System.out.println("Las variables se declaran poniendo el tipo que lleva y el nombre que le damos.");
        System.out.print("Variables para números enteros byte y short.");
        System.out.println("Tipo byte:");
        byte variableBytePos = 127; // es el núnero más grande que puedo guardar en una variable tipo byte
        byte variableByteNeg = -128; // es el núnero más pequeño que puedo guardar en una variable tipo byte
        System.out.println("variableBytePos " + variableBytePos);
        System.out.println("variableByteNeg " + variableByteNeg);



    }
}
