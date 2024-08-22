package ejercicio4;
abstract class Empleado {
    protected String nombre;
    protected int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public abstract double calcularSalario();

    public void mostrarInfo(){
        System.out.printf("""
                ID: %d
                Nombre: %s
                Salario: %.2f
                """, id, nombre,calcularSalario());
    }
}
