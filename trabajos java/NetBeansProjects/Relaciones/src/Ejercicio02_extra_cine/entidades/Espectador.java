/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_extra_cine.entidades;

/**
 *
 * @author Gonza Cozzo
 */
public class Espectador {
    
    private String nombre;

    private Integer edad;

    private float dinero_disponible;

    public Espectador(String nombre, Integer edad, float dinero_disponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero_disponible = dinero_disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public float getDinero_disponible() {
        return dinero_disponible;
    }

    public void setDinero_disponible(float dinero_disponible) {
        this.dinero_disponible = dinero_disponible;
    }
    
    
}
