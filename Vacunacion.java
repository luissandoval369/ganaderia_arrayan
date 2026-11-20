
import java.time.LocalDate;

public class Vacunacion {

    // Atributos de la clase
    private int idVacunacion;
    private LocalDate fecha;
    private String vacuna;

    // Relaciones con otras clases
    private Ganado ganado;
    private Veterinario veterinario;

    // Constructor
    public Vacunacion(int idVacunacion, LocalDate fecha,
                      String vacuna, Ganado ganado,
                      Veterinario veterinario) {

        this.idVacunacion = idVacunacion;
        this.fecha = fecha;
        this.vacuna = vacuna;
        this.ganado = ganado;
        this.veterinario = veterinario;
    }

    // Métodos getters y setters
    public int getIdVacunacion() {
        return idVacunacion;
    }

    public void setIdVacunacion(int idVacunacion) {
        this.idVacunacion = idVacunacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public Ganado getGanado() {
        return ganado;
    }

    public void setGanado(Ganado ganado) {
        this.ganado = ganado;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
}
