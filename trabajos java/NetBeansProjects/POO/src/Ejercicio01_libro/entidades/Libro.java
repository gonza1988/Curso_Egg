/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01_libro.entidades;

/**
 *
 * @author Gonza Cozzo
 */
public class Libro {

    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumPaginas;

    //Constructor vacio
    public Libro() {

    }

    //Constructor parametrizado(con todos sus atributos)
    public Libro(int ISBN, String Titulo, String Autor, int NumPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }

     // Super setter o metodo llenar 
    public void llenarLibro(int ISBN, String Titulo, String Autor, int NumPaginas) {

        // Se usa el this para diferenciar variable de atributo, ya que tienen el mismo nombre
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }

    //Mostrar libros mediante un metodo
    public void mostrarLibro() {

        System.out.println("ISBN: " + ISBN);
        System.out.println("El titulo del libro es: " + Titulo);
        System.out.println("El autor es: " + Autor);
        System.out.println("Su numero de paginas es: " + NumPaginas);

    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumPaginas=" + NumPaginas + '}';
    }

    
}
