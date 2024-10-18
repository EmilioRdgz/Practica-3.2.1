public abstract class VehiculoTransportePublico {
    protected int capacidadPasajeros;
    protected double velocidadMaxima;
    protected String tipoCombustible;

    public VehiculoTransportePublico(int capacidadPasajeros, double velocidadMaxima, String tipoCombustible) {
        this.capacidadPasajeros = capacidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoCombustible = tipoCombustible;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    // Métodos abstractos
    public abstract double calcularTarifa();
    public abstract void iniciarRuta();
    public abstract void detener();
}
