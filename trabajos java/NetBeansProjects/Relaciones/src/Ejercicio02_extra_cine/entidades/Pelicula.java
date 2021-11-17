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
public class Pelicula {
    
    private String titulo;

    private int duracion_min;

    private int edad_minima;

    private String director;

    private float precio;

    public Pelicula(String titulo, int duracion_min, int edad_minima, String director, float precio) {
        this.titulo = titulo;
        this.duracion_min = duracion_min;
        this.edad_minima = edad_minima;
        this.director = director;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion_min() {
        return duracion_min;
    }

    public void setDuracion_min(int duracion_min) {
        this.duracion_min = duracion_min;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
