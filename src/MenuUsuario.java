import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuUsuario {
    private final Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        int opcion = -1;

        while (opcion < 1 || opcion > 7) {
            System.out.println("""
                ╔════════════════════════════════════════════════════╗
                ║              CONVERSOR DE MONEDAS INTERNACIONAL    ║
                ╠════════════════════════════════════════════════════╣
                ║ Elija una opción válida:                           ║
                ║                                                    ║
                ║  1. Dólar Americano  →  Peso Chileno               ║
                ║  2. Peso Chileno     →  Dólar Americano            ║
                ║  3. Dólar Americano  →  Euro                       ║
                ║  4. Euro             →  Dólar Americano            ║
                ║  5. Dólar Americano  →  Libra Esterlina            ║
                ║  6. Libra Esterlina  →  Dólar Americano            ║
                ║  7. Salir                                          ║
                ╚════════════════════════════════════════════════════╝
                """);

            System.out.print("Ingrese su opción (1-7): ");
            try {
                opcion = scanner.nextInt();
                if (opcion < 1 || opcion > 7) {
                    System.out.println("Opción fuera de rango. Intente nuevamente.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Debe ingresar un número entero del 1 al 7.\n");
                scanner.nextLine(); // Limpia el buffer del scanner
            }
        }

        return opcion;
    }

    public double pedirCantidad(String moneda) {
        double cantidad = -1;

        while (cantidad <= 0) {
            System.out.printf("Ingrese el monto en %s (o escriba 7 para salir): ", moneda);

            try {
                String entrada = scanner.next();

                if (entrada.equals("7")) {
                    System.out.println("\nHas elegido salir del conversor. ¡Hasta pronto!");
                    cerrarScanner();
                    System.exit(0);
                }

                cantidad = Double.parseDouble(entrada);

                if (cantidad <= 0) {
                    System.out.println("El monto debe ser mayor a cero. Intente nuevamente.\n");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Ingrese un número válido.\n");
            }
        }

        return cantidad;
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
