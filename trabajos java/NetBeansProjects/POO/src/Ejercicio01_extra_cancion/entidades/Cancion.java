/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01_extra_cancion.entidades;

/**
 *
 * @author Gonza Cozzo
 */
public class Cancion {
    
    private String Titulo;
    private String Autor;

    public Cancion() {
        
        this.Titulo = "";
        this.Autor = "";
    }

    public Cancion(String Titulo, String Autor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "Titulo=" + Titulo + ", Autor=" + Autor + '}';
    }
    
    
    
}
