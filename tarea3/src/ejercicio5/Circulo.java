package ejercicio5;

public class Circulo extends Figura{
    public double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return (Math.PI)*(Math.pow(radio,2));
    }

    @Override
    public double calcularPerimetro() {
        return (Math.PI)*(radio*2);
    }
}
