package EjercicioAbstracta;

public class Gato extends Animal {

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Gato(){
        super();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
    @Override// Sobreescribo el metodo abstracto / OBLIGADA
    public void alimentarse() {
        System.out.println("El Gato se alimenta de " + this.alimento + " y el gatito hace Miauuu");
    }

    @Override
    public String toString() {// Sobreescribo el metodo para imprimir
        return "Gato{" + super.toString()+'}';
    }

    

}
