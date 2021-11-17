package ejemplo.entidades;

public class Auto {

    //ATRIBUTOS
    private String marca;
    private String modelo;
    private Integer anioFabricacion;
     

    //CONSTRUCTOR VACIO
    public Auto() {
    }

    //CONSTRUCTOR PARAMETRIZADO
    public Auto(String marca, String modelo, Integer anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    //GETTERS Y SETTERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", anioFabricacion=" + anioFabricacion + '}';
    }
    
    

}
