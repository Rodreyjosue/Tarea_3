package ejercicio5;

public class MainEjercicio5 {
    public static void main(String[] args) {
        Figura circulo = new Circulo(10.5);
        Figura rectangulo = new Rectangulo(10,10);
        System.out.println("Datos Circulo");
        circulo.mostrarInfo();
        System.out.println("Datos Rectangulo");
        rectangulo.mostrarInfo();
    }
}