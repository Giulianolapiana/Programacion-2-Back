package parcial;

import java.util.ArrayList;
import java.util.Date;

public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private ArrayList<LineaPrestamos> lineas;

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.lineas = new ArrayList<>();
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public ArrayList<LineaPrestamos> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LineaPrestamos> lineas) {
        this.lineas = lineas;
    }

    public void agregarLineaPrestamo(Ejemplar ejemplar) {
        LineaPrestamos linea = new LineaPrestamos();
        linea.setEjemplar(ejemplar);
        linea.setFechaDevolucionEstimada(new Date());
        lineas.add(linea);
    }


}
