package ejercicio2;

public class MainEjericicio2 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Programacion para pricipiantes", "Josue Rodriguez");
        System.out.println("consulto disponibilidad");
        libro1.consultarDisponibilidad();
        System.out.println("lo presto");
        libro1.prestar();
        System.out.println("lo presto y no lo tengo disponible");
        libro1.prestar();
        System.out.println("lo regreso");
        libro1.devolver();
        System.out.println("consulto disponibilidad final");
        libro1.consultarDisponibilidad();
    }
}
