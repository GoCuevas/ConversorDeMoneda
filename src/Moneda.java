public class Moneda {
    public static void main(String[] args) {
        MenuUsuario menu = new MenuUsuario();
        ConsultaDivisas consulta = new ConsultaDivisas();
        RegistroConversiones registro = new RegistroConversiones();

        int opcion;
        do {
            opcion = menu.mostrarMenu();

            String from = "", to = "";

            switch (opcion) {
                case 1 -> { from = "USD"; to = "CLP"; }
                case 2 -> { from = "CLP"; to = "USD"; }
                case 3 -> { from = "USD"; to = "EUR"; }
                case 4 -> { from = "EUR"; to = "USD"; }
                case 5 -> { from = "USD"; to = "GBP"; }
                case 6 -> { from = "GBP"; to = "USD"; }
                case 7 -> {
                    System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
                    menu.cerrarScanner();
                    return;
                }
                default -> {
                    System.out.println("Opción inválida. Intente nuevamente.");
                    continue;
                }
            }

            double cantidad = menu.pedirCantidad(from);
            Divisas datos = consulta.buscaDivisa(from);
            double tasa = datos.conversion_rates().get(to);
            double resultado = cantidad * tasa;

            System.out.printf("\nResultado: %.2f %s = %.2f %s\n", cantidad, from, resultado, to);
            System.out.println("Última actualización: " + datos.time_last_update_utc());
            // Registrar conversión
            registro.registrar(from, to, cantidad, resultado, datos.time_last_update_utc());


        } while (opcion != 7);
    }
}