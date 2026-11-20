
import java.time.LocalDate;

public class Reproduccion {

    private int idReproduccion;
    private LocalDate fecha;
    private String tipoEvento;
    private String observaciones;
    private Ganado ganado;

    public Reproduccion(int idReproduccion, LocalDate fecha,
                        String tipoEvento, String observaciones,
                        Ganado ganado) {
        this.idReproduccion = idReproduccion;
        this.fecha = fecha;
        this.tipoEvento = tipoEvento;
        this.observaciones = observaciones;
        this.ganado = ganado;
    }

    public int getIdReproduccion() {
        return idReproduccion;
    }

    public void setIdReproduccion(int idReproduccion) {
        this.idReproduccion = idReproduccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Ganado getGanado() {
        return ganado;
    }

    public void setGanado(Ganado ganado) {
        this.ganado = ganado;
    }
}

