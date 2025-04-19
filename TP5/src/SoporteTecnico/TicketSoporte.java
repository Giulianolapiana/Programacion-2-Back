package SoporteTecnico;

import java.time.LocalDate;

public class TicketSoporte {
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private static int contadorId = 1;
    private Usuario usuario;
    private Tecnico tecnico;

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

    public String mostrarDetalle() {
        String detalle = "Ticket ID: " + id +
                "\nDescripción: " + descripcion +
                "\nEstado: " + estado +
                "\nFecha de creación: " + fechaCreacion;

        if (usuario != null) {
            detalle += "\nUsuario: " + usuario;
        }

        if (tecnico != null) {
            detalle += "\nTécnico asignado: " + tecnico;
        }

        return detalle;
    }

    public void asignarTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + id +
                "\nDescripción: " + descripcion +
                "\nEstado: " + estado +
                "\nFecha: " + fechaCreacion +
                "\nUsuario: " + (usuario != null ? usuario : "No asignado") +
                "\nTécnico: " + (tecnico != null ? tecnico : "No asignado") +
                "\n----------------------------";
    }
}
