
package entidad;


public class Persona {
     //ATRIBUTOS
    private String nombre;
    private String apellido;
    private Integer edad; // Les agregue un atributo...

     //CONSTRUCTOR PARAMETRIZADO 
    public Persona(String nombre, String apellido,Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
   //CONSTRUCTOR VACIO
    public Persona() {
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override // Recordar ponerlo para evitar ver el espacio en memoria si imprimo el objeto directo
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
    

    
}
