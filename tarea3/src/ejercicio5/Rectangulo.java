package ejercicio5;

public class Rectangulo extends Figura{
    public double largo;
    public double altura;

    public Rectangulo(double largo, double altura) {
        this.largo = largo;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.largo*this.altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2*this.largo)+(2*this.altura);
    }
}