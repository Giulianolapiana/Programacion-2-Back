public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 1900 && anioPublicacion < 2025){
            this.anioPublicacion = anioPublicacion;
        }else {
            System.out.println("Error");
        }
    }

    public void mostrar(){
        System.out.println(titulo+" "+autor+" "+anioPublicacion);
    }

    public static void main(String[] args) {
        Libro libro = new Libro("narnia","san martin",2000);
        libro.mostrar();
        libro.setAnioPublicacion(700);
        libro.setAnioPublicacion(2010);
        libro.mostrar();
    }
}
