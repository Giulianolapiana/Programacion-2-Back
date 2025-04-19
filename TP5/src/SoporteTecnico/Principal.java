package SoporteTecnico;

public class Principal {
    public static void main(String[] args) {
        // Crear un ticket de soporte
        TicketSoporte tck = new TicketSoporte(99,"flojo");
        Usuario usuario = new Usuario(101, "Juan Pérez", "juan.perez@email.com");
        Usuario usuario2 = new Usuario(101, "manuel", "mmm@email.com");
        TicketSoporte ticket = new TicketSoporte(1, "No funciona el correo", usuario);
        TicketSoporte ticket2 = new TicketSoporte(1, "No funciona el correo", usuario2);
        Tecnico tecnico1 = new Tecnico(22,"moto moto ", "motoquero");

        // Mostrar detalles iniciales
        //System.out.println(tck.toString());
        //System.out.println(usuario.toString());
        System.out.println("📝 DETALLE DEL TICKET:");
        System.out.println(ticket.mostrarDetalle());

        // Cerrar el ticket
        ticket.cerrarTicket();
        ticket.asignarTecnico(tecnico1);

        // Mostrar detalles después de cerrar
        System.out.println("\n🔒 TICKET CERRADO:");
        System.out.println(ticket.toString());
        /*System.out.println(ticket.mostrarDetalle());*/

        SistemaSoporte sistema = new SistemaSoporte();
        System.out.println("ARRAY TICKET");
        sistema.agregarTicket(ticket);
        sistema.agregarTicket(ticket2);
        sistema.agregarTicket(tck);


        sistema.listarTickets();
    }
}
