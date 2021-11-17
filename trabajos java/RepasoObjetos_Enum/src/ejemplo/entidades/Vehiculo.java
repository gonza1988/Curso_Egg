package ejemplo.entidades;

import ejemplo.enums.TipoVehiculo;

public class Vehiculo {

    private String modelo;
    private String marca;
    private Integer anioFabricacion;
    private TipoVehiculo tipo;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, String marca, Integer anioFabricacion, TipoVehiculo tipo) {
        this.modelo = modelo;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "modelo=" + modelo + ", marca=" + marca + ", anioFabricacion=" + anioFabricacion + '}';
    }

}
