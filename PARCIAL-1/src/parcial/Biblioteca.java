package parcial;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Publicacion> publicaciones ;
    private ArrayList<Usuario> usuarios ;

    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion a){
        this.publicaciones.add(a);
    }
    public void agregarUsuarios(Usuario u){
        this.usuarios.add(u);
    }
}
