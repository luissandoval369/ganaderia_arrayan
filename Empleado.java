
public class Empleado {

    // Atributos de la clase
    private int idEmpleado;
    private String nombre;
    private String cargo;
    private String telefono;

    // Constructor
    public Empleado(int idEmpleado, String nombre,
                    String cargo, String telefono) {

        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.cargo = cargo;
        this.telefono = telefono;
    }

    // Métodos getters y setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

