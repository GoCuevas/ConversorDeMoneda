public class Moneda {
    public static void main(String[] args) {
        ConsultaDivisas consulta = new ConsultaDivisas();
        Divisas divisa = consulta.buscaDivisa("USD");

        // Obtenemos CLP desde el mapa de tasas
        double clp = divisa.conversion_rates().get("CLP");

        System.out.println("1 USD equivale a " + clp + " CLP");
        System.out.println("Última actualización: " + divisa.time_last_update_utc());
    }
}