package ejemplo02.entidades;

public class Celular {

    //ATRIBUTOS
    private String marca;
    private String modelo;
    private Bateria bateria;

    //CONSTRUCTOR VACIO
    public Celular() {
    }

    //CONSTRUCTOR PARAMETRIZADO
    public Celular(String marca, String modelo, Bateria bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
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

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Celular{" + "marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + '}';
    }

}
