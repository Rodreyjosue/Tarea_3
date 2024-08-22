package ejercicio5;

abstract class Figura {

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    public void mostrarInfo(){
        System.out.printf("""
                Area: %.2f
                Perimetro: %.2f
                
                """, calcularArea(), calcularPerimetro());
    }
}
