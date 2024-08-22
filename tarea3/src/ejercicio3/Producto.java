package ejercicio3;

abstract class Producto {
    public String nombre;
    public double precio;
    public int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public abstract void agregarCantidad(int cantidad);
    public abstract void vender(int cantidad);

    public void consultarInventario(){
        System.out.println("La cantidad disponible para ventas es: "+this.cantidad);
    }
}