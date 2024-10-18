public class Main {
    public static void main(String[] args) {
        // Crear un objeto Autobús
        Autobus autobus = new Autobus(50, 80.0, "Diesel", "Ruta 1");
        System.out.println("Capacidad del autobús: " + autobus.getCapacidadPasajeros());
        autobus.iniciarRuta();
        autobus.detener();
        System.out.println("Tarifa del autobús: $" + autobus.calcularTarifa());
        autobus.realizarMantenimiento();
        autobus.verificarEstado();

        // Crear un objeto Taxi
        Taxi taxi = new Taxi(4, 120.0, "Gasolina", "ABC123");
        System.out.println("\nCapacidad del taxi: " + taxi.getCapacidadPasajeros());
        taxi.iniciarRuta();
        taxi.detener();
        System.out.println("Tarifa del taxi: $" + taxi.calcularTarifa());
        taxi.realizarMantenimiento();
        taxi.verificarEstado();
    }
}
