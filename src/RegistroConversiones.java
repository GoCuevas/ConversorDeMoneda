import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroConversiones {

    private static final String ARCHIVO = "registro_conversiones.txt";

    public void registrar(String origen, String destino, double monto, double resultado, String fechaActualizacion) {
        String fechaHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String linea = String.format("[%s] %.2f %s → %.2f %s (actualizado: %s)",
                fechaHora, monto, origen, resultado, destino, fechaActualizacion);

        // Mostrar en consola
        System.out.println("\nRegistro: " + linea);

        // Guardar en archivo
        try (PrintWriter escritor = new PrintWriter(new FileWriter(ARCHIVO, true))) {
            escritor.println(linea);
        } catch (IOException e) {
            System.out.println("Error al guardar el registro: " + e.getMessage());
        }
    }
}
