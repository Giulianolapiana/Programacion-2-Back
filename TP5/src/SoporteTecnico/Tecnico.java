package SoporteTecnico;

public class Tecnico {
    private int id;
    private String nombre;
    private String especialidad;

    public Tecnico(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad;
    }

    public String getNombre() {
        return nombre;
    }
}
