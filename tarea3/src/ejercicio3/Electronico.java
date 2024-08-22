package ejercicio3;

public class Electronico extends Producto{

    public Electronico(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    @Override
    public void agregarCantidad(int cantidad) {
        this.cantidad +=cantidad;
        System.out.println("Cantidad agregada la cantidad disponible actual es: "+this.cantidad);
    }

    @Override
    public void vender(int cantidad) {
        if (this.cantidad>= cantidad){
            this.cantidad -= cantidad;
        }else System.out.println("no cuentas con la cantidad disponible para la venta");
    }
}