package ejercicio4;

public class MainEjercicio4 {
    public static void main(String[] args) {
        Empleado empleadoAsalariado = new EmpleadoAsalariado("Josue Rodriguez", 001, 12599);
        Empleado empleadoPorHora = new EmpleadoPorHora("Byron Reyes", 002, 10, 25.5);
        System.out.println("Info empleado asalariado: ");
        empleadoAsalariado.mostrarInfo();
        System.out.println("");
        System.out.println("Info empleado por hora: ");
        empleadoPorHora.mostrarInfo();
    }
}
