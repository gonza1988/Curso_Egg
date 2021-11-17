/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04_pelicula.entidades;

import java.util.Comparator;

/**
 *
 * @author Gonza Cozzo
 */
public class Pelicula {

    private String titulo;
    private String director;
    private double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

    public static Comparator<Pelicula> compararDuracionAscendente = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Pelicula p1, Pelicula p2) { // Le pasamos dos objetos a comparar
            return Double.compare(p1.getDuracion(), p2.getDuracion()); // Los comparamos usando el get y el compareTo

        }
    };

    public static Comparator<Pelicula> compararDuracionDescendente = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Pelicula p1, Pelicula p2) { // Le pasamos dos objetos a comparar
            return Double.compare(p2.getDuracion(), p1.getDuracion()); // Los comparamos usando el get y el compareTo
        }
    };

    public static Comparator<Pelicula> compararTituloAscendente = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Pelicula p1, Pelicula p2) { // Le pasamos dos objetos a comparar
            return p1.getTitulo().compareTo(p2.getTitulo()); // Los comparamos usando el get y el compareTo

        }
    };

    public static Comparator<Pelicula> compararDirectorAscendente = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Pelicula p1, Pelicula p2) { // Le pasamos dos objetos a comparar
            return p1.getDirector().compareTo(p2.getDirector()); // Los comparamos usando el get y el compareTo

        }
    };
}
