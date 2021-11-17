/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01_libro;

import Ejercicio01_libro.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio01_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
        Autor, Número de páginas, y un constructor con todos los atributos pasados por
        parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
        datos al usuario y luego informar mediante otro método el número de ISBN, el título,
        el autor del libro y el numero de páginas. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Libro l1 = new Libro();
        
        //Llenado de objeto mediante constructor
        Libro l2 = new Libro(12, "La Niebla", "Stephen King", 278);
        
        System.out.println("Ingrese el ISBN del Libro ");
        int ISBN = leer.nextInt();

        System.out.println("Ingrese el Titulo del libro ");
        String Titulo = leer.next();

        System.out.println("Ingrese Autor del libro ");
        String Autor = leer.next();

        System.out.println("Ingrese numero de paginas ");
        int NumPaginas = leer.nextInt();

        //LLenado de objeto mediante funcion
        l1.llenarLibro(ISBN,Titulo,Autor,NumPaginas);
        
        l1.mostrarLibro();
        System.out.println(l2.toString());
    }
    
}
