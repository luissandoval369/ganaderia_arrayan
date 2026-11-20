
public class Administrador extends Empleado {

    // Atributos propios del administrador
    private String usuario;
    private String contrasena;

    // Constructor
    public Administrador(int idEmpleado, String nombre,
                         String cargo, String telefono,
                         String usuario, String contrasena) {

        super(idEmpleado, nombre, cargo, telefono);

        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    // Métodos getters y setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Método para administrar el sistema
    public void gestionarSistema() {
        System.out.println("Administrador gestionando el sistema.");
    }
}

