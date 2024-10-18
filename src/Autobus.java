public class Autobus extends VehiculoTransportePublico implements MantenimientoVehiculo {
    private String ruta;

    public Autobus(int capacidadPasajeros, double velocidadMaxima, String tipoCombustible, String ruta) {
        super(capacidadPasajeros, velocidadMaxima, tipoCombustible);
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    // Implementación de los métodos abstractos de VehículoTransportePublico
    @Override
    public double calcularTarifa() {
        return 10.0; // Ejemplo de tarifa fija para el autobús
    }

    @Override
    public void iniciarRuta() {
        System.out.println("Autobús iniciando ruta: " + ruta);
    }

    @Override
    public void detener() {
        System.out.println("Autobús detenido.");
    }

    // Implementación de los métodos de MantenimientoVehiculo
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento del autobús.");
    }

    @Override
    public void verificarEstado() {
        System.out.println("Verificando estado del autobús.");
    }
}

