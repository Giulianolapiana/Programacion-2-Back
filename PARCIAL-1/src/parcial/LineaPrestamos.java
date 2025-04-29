package parcial;

import java.util.Date;

public class LineaPrestamos {
    private Date fechaDevolucionEstimada;
    private Ejemplar ejemplar;

    public LineaPrestamos(Date fechaDevolucionEstimada, Ejemplar ejemplar) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
        this.ejemplar = ejemplar;
    }

    public Date getFechaDevolucionEstimada() {
        return fechaDevolucionEstimada;
    }

    public void setFechaDevolucionEstimada(Date fechaDevolucionEstimada) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }
}
