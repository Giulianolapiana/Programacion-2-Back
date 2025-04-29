package parcial;

import java.util.ArrayList;

public class Publicacion {
    private String titulo;
    private int anio;
    private Genero genero;
    private ArrayList<Ejemplar> ejemplares ;

    public Publicacion(String titulo, int anio, Genero genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
        this.ejemplares = new ArrayList<>();
    }

    public void agregarEjemplar(Ejemplar e){
        this.ejemplares.add(e);
    }

    public ArrayList<Ejemplar> getEjemplaresDisponibles(){
        ArrayList<Ejemplar> disponibles = new ArrayList<>();
        for (Ejemplar e : ejemplares) {
            if (e.estaDisponible()) {
                disponibles.add(e);
            }
        }
        return disponibles;
    }

}
