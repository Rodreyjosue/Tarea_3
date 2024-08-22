package ejercicio3;

public class MainEjercicio3 {
    public static void main(String[] args) {
        Electronico celular = new Electronico("Samsung fold z3", 5999.99, 5);
        System.out.println("Consulto invetario: ");
        celular.consultarInventario();
        System.out.println("Agrego existencias");
        celular.agregarCantidad(5);
        System.out.println("realizo ventas");
        celular.vender(10);
        System.out.println("realizo venta sin existencias");
        celular.vender(10);
        System.out.println("consulto inventario final");
        celular.consultarInventario();
    }
}