/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03_extra_libreria.entidades;

import java.util.Objects;

/**
 *
 * @author Gonza Cozzo
 */
public class Libro implements Comparable<Libro>{
    
    private String titulo;
    private String autor;
    private Integer numEjemplares;
    private Integer numPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer numEjemplares, Integer numPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(Integer numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public Integer getNumPrestados() {
        return numPrestados;
    }

    public void setNumPrestados(Integer numPrestados) {
        this.numPrestados = numPrestados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.titulo);
        hash = 71 * hash + Objects.hashCode(this.autor);
        hash = 71 * hash + Objects.hashCode(this.numEjemplares);
        hash = 71 * hash + Objects.hashCode(this.numPrestados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.numEjemplares, other.numEjemplares)) {
            return false;
        }
        if (!Objects.equals(this.numPrestados, other.numPrestados)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Libro t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numEjemplares=" + numEjemplares + ", numPrestados=" + numPrestados + '}';
    }
    
    
    
}
