package EstructurasDeControl;

public class EjemploForAnidado {


    public static void main(String[] args) {

        //un for anidado es un for que se utiliza dentro de otro
        //Tendremos un for interno cuya variable suele llamarse i
        // y metemos un for interno cuya variable suele llamarse j

        // La logica que sigue es: por cada vuelta del bucle externo
        // el bucle interno ejecuta todas sus repeticiones


        for(int i=0;i<5;i++){
            System.out.println("i = "+i);
            for(int j=0;j <10;j++){

                System.out.println("\t j = "+j);
            }


        }


    }
}
