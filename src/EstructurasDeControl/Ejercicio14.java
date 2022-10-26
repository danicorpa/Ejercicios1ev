package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        /***
         *
         * 14. El director de una escuela está organizando un viaje de estudios, y requiere
         * determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de
         * viajes por el servicio. La forma de cobrar es la siguiente:
         * a. si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
         * b. de 50 a 99 alumnos, el costo es de 70 euros,
         * c. de 30 a 49, de 95 euros,
         * d. y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin
         * importar el número de alumnos.
         * Escribe un programa que permita determinar el pago a la compañía de autobuses
         * y lo que debe pagar cada alumno por el viaje.
         *
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuántos alumnos irán a la excurisón? ");
        int numAlumnos=sc.nextInt();
        int costoAlumno=0;
        if(numAlumnos>=100){
            costoAlumno=65;
            System.out.println("El precio del viaje saldrá por "+(costoAlumno*numAlumnos)+", cada alumno pagará " + costoAlumno);
        }else if(numAlumnos>=50 && numAlumnos<=99){
            costoAlumno=70;
            System.out.println("El precio del viaje saldrá por "+(costoAlumno*numAlumnos)+", cada alumno pagará " + costoAlumno);
        }else if(numAlumnos>=30 && numAlumnos<=49){
            costoAlumno=95;
            System.out.println("El precio del viaje saldrá por "+(costoAlumno*numAlumnos)+", cada alumno pagará " + costoAlumno);
        }else{
            System.out.println("El costo del viaje será de 4000napos");

        }
    }
}
