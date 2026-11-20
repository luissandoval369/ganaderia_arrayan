
import java.math.BigDecimal;
import java.time.LocalDate;

public class Produccion {

    // Atributos de la clase
    private int idProduccion;
    private LocalDate fecha;
    private BigDecimal litrosLeche;

    // Relaciones con otras clases
    private Ganado ganado;
    private Empleado empleado;

    // Constructor
    public Produccion(int idProduccion, LocalDate fecha,
                      BigDecimal litrosLeche, Ganado ganado,
                      Empleado empleado) {

        this.idProduccion = idProduccion;
        this.fecha = fecha;
        this.litrosLeche = litrosLeche;
        this.ganado = ganado;
        this.empleado = empleado;
    }

    // Métodos getters y setters
    public int getIdProduccion() {
        return idProduccion;
    }

    public void setIdProduccion(int idProduccion) {
        this.idProduccion = idProduccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getLitrosLeche() {
        return litrosLeche;
    }

    public void setLitrosLeche(BigDecimal litrosLeche) {
        this.litrosLeche = litrosLeche;
    }

    public Ganado getGanado() {
        return ganado;
    }

    public void setGanado(Ganado ganado) {
        this.ganado = ganado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
