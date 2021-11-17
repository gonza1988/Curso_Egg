/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01_extra_alqBarco.entidades;

/**
 *
 * @author Gonza Cozzo
 */
public class Persona {
    
    private String nombre;
    private long dni;
    private Barco nave;

    public Persona() {
    }

    public Persona(String nombre, long dni, Barco nave) {
        this.nombre = nombre;
        this.dni = dni;
        this.nave = nave;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public Barco getNave() {
        return nave;
    }

    public void setNave(Barco nave) {
        this.nave = nave;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

    
}
