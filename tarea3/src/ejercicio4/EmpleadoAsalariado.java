package ejercicio4;

public class EmpleadoAsalariado extends Empleado{
    private double salarioMensual;

    public EmpleadoAsalariado(String nombre, int id, double salarioMensual) {
        super(nombre, id);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return this.salarioMensual;
    }
}
