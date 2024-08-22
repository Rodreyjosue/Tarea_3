package ejercicio4;

public class EmpleadoPorHora extends Empleado{
    public int horasTrabajadas;
    public double tarifaHora;
    public double salarioBase;

    public EmpleadoPorHora(String nombre, int id, int horasTrabajadas, double tarifaHora) {
        super(nombre, id);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase = horasTrabajadas*tarifaHora;
    }
}
