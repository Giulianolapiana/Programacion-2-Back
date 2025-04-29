package parcial;

import java.util.ArrayList;

public class Libro extends Publicacion{
    private String isbn;
    private Editorial editorial;
    private ArrayList<Autor> autores ;

    public Libro(String titulo, int anio, Genero genero, Editorial editorial) {
        super(titulo, anio, genero);
        this.editorial = editorial;
        this.autores = new ArrayList<>();
    }

    public void agregarAutor(Autor a){
        this.autores.add(a);
    }

    @Override
    public String toString() {
        return "Libro" +
                ": editorial=" + editorial +
                ", autores=" + autores +
                '}';
    }
}
