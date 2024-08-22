package ejercicio1;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anioActual = Year.now().getValue();
        System.out.print("Ingrese anio de nacimiento para la 1ra persona: ");
        Year anioPersona1 = Year.of(scan.nextInt());
        System.out.print("Ingrese anio de nacimiento para la 2da persona: ");
        Year anioPersona2 = Year.of(scan.nextInt());

        if (anioPersona1.isBefore(anioPersona2)){
            System.out.println("La mayor es la persona 1, actualmente tiene: "+(Year.now().getValue()-anioPersona1.getValue())+" Anios");
            System.out.println("La persona 2, actulmente tiene:"+(Year.now().getValue()-anioPersona2.getValue())+" Anios");
            System.out.println("su diferencia de anios es: "+(anioPersona2.getValue()-anioPersona1.getValue()));
        } else if (anioPersona1.isAfter(anioPersona2)) {
            System.out.println("La mayor es la persona 2, actualmente tiene: "+(Year.now().getValue()-anioPersona2.getValue())+" Anios");
            System.out.println("La persona 1, actulmente tiene:"+(Year.now().getValue()-anioPersona1.getValue())+" Anios");
            System.out.println("su diferencia de anios es: "+(anioPersona1.getValue()-anioPersona2.getValue()));
        } else {
            System.out.println("Ambas persona nacieron en el mismo anio");
        }
    }
}
