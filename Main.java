
import dao.GanadoDAO;
import dao.VacunacionDAO;
import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);
    static GanadoDAO ganadoDAO = new GanadoDAO();
    static VacunacionDAO vacunacionDAO = new VacunacionDAO();

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n================================");
            System.out.println("     GANADERIA ARRAYAN");
            System.out.println("================================");
            System.out.println("1. Registrar ganado");
            System.out.println("2. Consultar ganado");
            System.out.println("3. Actualizar ganado");
            System.out.println("4. Eliminar ganado");
            System.out.println("--------------------------------");
            System.out.println("5. Registrar vacunacion");
            System.out.println("6. Consultar vacunaciones");
            System.out.println("7. Actualizar vacunacion");
            System.out.println("8. Eliminar vacunacion");
            System.out.println("--------------------------------");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1 -> registrarGanado();
                case 2 -> ganadoDAO.consultar();
                case 3 -> actualizarGanado();
                case 4 -> eliminarGanado();
                case 5 -> registrarVacunacion();
                case 6 -> vacunacionDAO.consultar();
                case 7 -> actualizarVacunacion();
                case 8 -> eliminarVacunacion();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);

        teclado.close();
    }

    static void registrarGanado() {
        System.out.println("\n--- REGISTRAR GANADO ---");

        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Raza: ");
        String raza = teclado.nextLine();

        System.out.print("Sexo: ");
        String sexo = teclado.nextLine();

        System.out.print("Fecha de nacimiento (AAAA-MM-DD): ");
        String fecha = teclado.nextLine();

        System.out.print("Peso: ");
        double peso = Double.parseDouble(teclado.nextLine());

        System.out.print("Estado: ");
        String estado = teclado.nextLine();

        if (ganadoDAO.registrar(nombre, raza, sexo, fecha, peso, estado)) {
            System.out.println("Ganado registrado correctamente.");
        }
    }

    static void actualizarGanado() {
        System.out.println("\n--- ACTUALIZAR GANADO ---");

        System.out.print("ID del animal: ");
        int id = Integer.parseInt(teclado.nextLine());

        System.out.print("Nuevo nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Nueva raza: ");
        String raza = teclado.nextLine();

        System.out.print("Nuevo sexo: ");
        String sexo = teclado.nextLine();

        System.out.print("Nueva fecha de nacimiento (AAAA-MM-DD): ");
        String fecha = teclado.nextLine();

        System.out.print("Nuevo peso: ");
        double peso = Double.parseDouble(teclado.nextLine());

        System.out.print("Nuevo estado: ");
        String estado = teclado.nextLine();

        if (ganadoDAO.actualizar(id, nombre, raza, sexo, fecha, peso, estado)) {
            System.out.println("Ganado actualizado correctamente.");
        } else {
            System.out.println("No se encontro el animal.");
        }
    }

    static void eliminarGanado() {
        System.out.println("\n--- ELIMINAR GANADO ---");

        System.out.print("ID del animal: ");
        int id = Integer.parseInt(teclado.nextLine());

        if (ganadoDAO.eliminar(id)) {
            System.out.println("Ganado eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el animal.");
        }
    }

    static void registrarVacunacion() {
        System.out.println("\n--- REGISTRAR VACUNACION ---");

        System.out.print("ID del animal: ");
        int idAnimal = Integer.parseInt(teclado.nextLine());

        System.out.print("ID del veterinario: ");
        int idVeterinario = Integer.parseInt(teclado.nextLine());

        System.out.print("Tipo de vacuna: ");
        String vacuna = teclado.nextLine();

        System.out.print("Fecha de vacunacion (AAAA-MM-DD): ");
        String fecha = teclado.nextLine();

        System.out.print("Observacion: ");
        String observacion = teclado.nextLine();

        if (vacunacionDAO.registrar(
                idAnimal, idVeterinario, vacuna, fecha, observacion)) {
            System.out.println("Vacunacion registrada correctamente.");
        }
    }

    static void actualizarVacunacion() {
        System.out.println("\n--- ACTUALIZAR VACUNACION ---");

        System.out.print("ID de la vacunacion: ");
        int id = Integer.parseInt(teclado.nextLine());

        System.out.print("ID del animal: ");
        int idAnimal = Integer.parseInt(teclado.nextLine());

        System.out.print("ID del veterinario: ");
        int idVeterinario = Integer.parseInt(teclado.nextLine());

        System.out.print("Tipo de vacuna: ");
        String vacuna = teclado.nextLine();

        System.out.print("Fecha de vacunacion (AAAA-MM-DD): ");
        String fecha = teclado.nextLine();

        System.out.print("Observacion: ");
        String observacion = teclado.nextLine();

        if (vacunacionDAO.actualizar(
                id, idAnimal, idVeterinario, vacuna, fecha, observacion)) {
            System.out.println("Vacunacion actualizada correctamente.");
        } else {
            System.out.println("No se encontro la vacunacion.");
        }
    }

    static void eliminarVacunacion() {
        System.out.println("\n--- ELIMINAR VACUNACION ---");

        System.out.print("ID de la vacunacion: ");
        int id = Integer.parseInt(teclado.nextLine());

        if (vacunacionDAO.eliminar(id)) {
            System.out.println("Vacunacion eliminada correctamente.");
        } else {
            System.out.println("No se encontro la vacunacion.");
        }
    }
}
