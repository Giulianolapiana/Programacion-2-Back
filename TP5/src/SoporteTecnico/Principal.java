package SoporteTecnico;

public class Principal {
    public static void main(String[] args) {
        // Crear un ticket de soporte
        TicketSoporte ticket = new TicketSoporte(1, "No se puede acceder al sistema.");

        // Mostrar detalles iniciales
        System.out.println("📝 DETALLE DEL TICKET:");
        ticket.mostrarDetalle();
        System.out.println(ticket.toString());
        /*System.out.println(ticket.mostrarDetalle());*/

        // Cerrar el ticket
        ticket.cerrarTicket();

        // Mostrar detalles después de cerrar
        System.out.println("\n🔒 TICKET CERRADO:");
        ticket.mostrarDetalle();
        System.out.println(ticket.toString());
        /*System.out.println(ticket.mostrarDetalle());*/
    }
}
