package ejemplo.enums;

public enum TipoVehiculo {
    AUTO("Auto"), CAMIONETA("Camioneta"), MOTO("Moto");

    private String valorAMostrar;

    private TipoVehiculo(String valorAMostrar) {
        this.valorAMostrar = valorAMostrar;
    }

    public String getValorAMostrar() {
        return valorAMostrar;
    }

    public void setValorAMostrar(String valorAMostrar) {
        this.valorAMostrar = valorAMostrar;
    }

}
