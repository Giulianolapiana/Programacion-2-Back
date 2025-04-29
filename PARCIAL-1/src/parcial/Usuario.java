package parcial;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private ArrayList<Prestamo> prestamos;

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.prestamos = new ArrayList<>();
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void mostrarHistorialPrestamos() {
        for (Prestamo p : prestamos) {
            System.out.println("Fecha préstamo: " + p.getFechaPrestamo());
            for (LineaPrestamos l : p.getLineas()) {
                System.out.println("  Código ejemplar: " + l.getEjemplar().getCodigo());
                System.out.println("  Fecha devolución estimada: " + l.getFechaDevolucionEstimada());
            }
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", prestamos=" + prestamos +
                '}';
    }


}
