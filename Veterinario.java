
public class Veterinario extends Empleado {

    // Atributos propios del veterinario
    private String tarjetaProfesional;
    private String especialidad;

    // Constructor
    public Veterinario(int idEmpleado, String nombre,
                       String cargo, String telefono,
                       String tarjetaProfesional,
                       String especialidad) {

        super(idEmpleado, nombre, cargo, telefono);

        this.tarjetaProfesional = tarjetaProfesional;
        this.especialidad = especialidad;
    }

    // Métodos getters y setters
    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método para realizar controles sanitarios
    public void realizarControlSanitario() {
        System.out.println("Realizando control sanitario del ganado.");
    }
}
