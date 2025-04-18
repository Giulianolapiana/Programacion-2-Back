package SoporteTecnico;

import java.time.LocalDate;

public class TicketSoporte {
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private static int contadorId = 1;
    private Usuario usuario;
    private String tecnico;

    //constructor sin usuario
    public TicketSoporte(int id, String descripcion) {
        this.id = contadorId++;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
    }
    //constructor con usuario sobrecargando

    public TicketSoporte(int id, String descripcion, Usuario usuario) {
        this(id,descripcion);
        this.usuario = usuario;
    }

    public void  cerrarTicket(){
        this.estado = "cerrado";
    }

    public void mostrarDetalle() {
        System.out.println("id "+ id + " " +descripcion+" "+ estado);
    }

    public void aignarTecnico(){
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "TicketSoporte{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
