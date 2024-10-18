public class Taxi extends VehiculoTransportePublico implements MantenimientoVehiculo {
    private String numeroLicencia;

    public Taxi(int capacidadPasajeros, double velocidadMaxima, String tipoCombustible, String numeroLicencia) {
        super(capacidadPasajeros, velocidadMaxima, tipoCombustible);
        this.numeroLicencia = numeroLicencia;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    // Implementación de los métodos abstractos de VehículoTransportePublico
    @Override
    public double calcularTarifa() {
        return 20.0; // Ejemplo de tarifa fija para el taxi
    }

    @Override
    public void iniciarRuta() {
        System.out.println("Taxi con licencia " + numeroLicencia + " iniciando ruta.");
    }

    @Override
    public void detener() {
        System.out.println("Taxi detenido.");
    }

    // Implementación de los métodos de MantenimientoVehiculo
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento del taxi.");
    }

    @Override
    public void verificarEstado() {
        System.out.println("Verificando estado del taxi.");
    }
}

