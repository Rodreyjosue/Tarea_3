package ejercicio2;

public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestar(){
        if (disponible){
            disponible = false;
            System.out.println("El libro: "+this.titulo+" Ha sido prestado");
        }else {
            System.out.println("El libro: "+this.titulo+" NO esta disponible para prestamo");
        }
    }

    public void devolver(){
        if (!disponible){
            disponible = true;
            System.out.println("El libro: "+this.titulo+" Ha sido Devuelto");
        }else {
            System.out.println("El libro: "+this.titulo+" Ya ha sido ingresado previamente");
        }
    }
    public void consultarDisponibilidad(){
        if (disponible) System.out.println("El libro: "+this.titulo+" Esta disponible");
            else System.out.println("El libro: "+this.titulo+" NO Esta disponible");
    }
}
