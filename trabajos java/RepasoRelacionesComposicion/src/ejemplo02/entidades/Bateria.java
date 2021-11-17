package ejemplo02.entidades;

public class Bateria {
    
    //ATRIBUTOS
    private Integer capacidad;

    //CONSTRUCTOR VACIO
    public Bateria() {
    }

    //CONSTRUCTOR PARAMETRIZADO
    public Bateria(Integer capacidad) {
        this.capacidad = capacidad;
    }

    //GETTERS Y SETTERS
    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Bateria{" + "capacidad=" + capacidad + '}';
    }

}
