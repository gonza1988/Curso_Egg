/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria2jpa.servicios;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import libreria2jpa.entidades.Autor;
import libreria2jpa.entidades.Editorial;
import libreria2jpa.entidades.Libro;
import libreria2jpa.persistencia.LibroDAO;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioLibro {

    private LibroDAO daoLibro;
    private final ServicioEditorial servicioEditorial;
    private final ServicioAutor servicioAutor;

    public ServicioLibro() {

        daoLibro = new LibroDAO();
        this.servicioAutor = new ServicioAutor();
        this.servicioEditorial = new ServicioEditorial();

    }

    public void crearLibro(String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, String editorial, String autor) throws Exception {

        try {
            //Validamos
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new Exception("Debe indicar el titulo del libro");
            }

            if (anio == null || anio < 1440) {
                throw new Exception("Ingrese un anio valido");
            }
            if (ejemplares < 0) {
                throw new Exception("Ingrese cantidad de ejmplares valido");
            }

            if (ejemplaresPrestados > ejemplares || ejemplaresPrestados < 0) {
                throw new Exception("No se pueden prestar Libros que no existen");
            }

            //Creamos el libro
            Libro libro = new Libro();

            libro.setIsbn(UUID.randomUUID().toString());
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setNroEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplares - ejemplaresPrestados);
            libro.setAlta(Boolean.TRUE);
            
            Autor autorB = servicioAutor.buscarAutorPorNombre(autor);
            if (autorB == null)
            {
                autorB = servicioAutor.crearAutor(autor);
               //libro.setAutor(autorB);
                System.out.println("Autor no existente en la BD,se creara uno nuevo");   
            } 
                
             libro.setAutor(autorB);
            
             Editorial editorialB = servicioEditorial.buscarEditorialPorNombre(editorial);
            if (editorialB == null)
            {
                editorialB = servicioEditorial.crearEditorial(editorial);
                System.out.println("Editorial no existente en la BD,se creara una nueva");   
            }
            libro.setEditorial(editorialB);

            daoLibro.guardarLibro(libro);
            System.out.println("!Libro creado con exito!");
        } catch (Exception e) {
            throw new Exception("No se creeo el libro" + e.getMessage());
        }
    }

    public void modificarTitulo(String tituloActual, String nuevoTitulo) throws Exception {

        try {
            //Validamos

            if (tituloActual == null || tituloActual.trim().isEmpty()) {
                throw new Exception("Debe indicar Titulo actual");
            }
            if (nuevoTitulo == null || nuevoTitulo.trim().isEmpty()) {
                throw new Exception("Debe indicar Titulo nuevo");
            }
            //Buscamos
            Libro libro = buscarLibroPorTitulo(tituloActual);

            //Validamos
            if (!libro.getTitulo().equals(tituloActual)) {
                throw new Exception("El titulo actual no es el regsitrado en el sistema ");
            }
            //Modificamos
            libro.setTitulo(nuevoTitulo);
        
            daoLibro.modificarLibro(libro);
            System.out.println("¡Libro modificado con exito!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarLibro(String titulo) throws Exception {

        try {
            //Validamos 
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new Exception("Debe indicar el titulo del libro");
            }
            daoLibro.eliminarLibroTitulo(titulo);
            System.out.println("LIBRO ELIMINADO CON EXITO");
        } catch (Exception e) {
            throw e;
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) throws Exception {
        try {

            //Validamos
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new Exception("Debe indicar el titulo del libro");
            }

            Libro libro = daoLibro.buscarLibroPorTitulo(titulo);
            
            //Verificamos
            if (libro == null) {
                throw new Exception("No se econtró Libro para el titulo indicado");
            }
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List <Libro> buscarLibrosPorAutor(String nombreA) throws Exception {
        try {

            //Validamos
            if (nombreA == null || nombreA.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del Autor");
            }

            List <Libro> libros = daoLibro.buscarLibrosPorAutor(nombreA);
            return libros;
        } catch (Exception e) {
            throw e;
        }

    }

     public List<Libro> buscarLibrosPorEditorial(String nombreE) throws Exception {
        try {

            //Validamos
            if (nombreE == null || nombreE.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre de la Editorial");
            }

            List<Libro> libros = daoLibro.buscarLibrosPorEditorial(nombreE);
            return libros;
        } catch (Exception e) {
            throw e;
        }

    }
     
    public Libro buscarLibroPorIsbn(String isbn) throws Exception {

        try {
            //Validamos
            if (isbn == null) {
                throw new Exception("Debe indicar el isbn del libro");
            }
            Libro libro = daoLibro.buscarLibroPorIsbn(isbn);
            return libro;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Libro> listaLibros() throws Exception {

        try {
            List<Libro> listaDeLibros = daoLibro.listarLibros();
            return listaDeLibros;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirLibros() throws Exception {
        try {
            //Listamos los usuarios
            Collection<Libro> libros = listaLibros();

            //Imprimimos los usuarios - Solo algunos atributos....
            if (libros.isEmpty()) {
                throw new Exception("No existen libros para imprimir");
            } else {
                for (Libro l : libros) {
                    System.out.println("************ LISTA LIBROS *******************");
                    System.out.println("Isbn:" + l.getIsbn()
                            + "\n Titulo:" + l.getTitulo()
                            + "\n Año de publicacion:" + l.getAnio()
                            + "\n Numero de ejemplares:" + l.getNroEjemplares()
                            + "\n Ejemplares Prestados:" + l.getEjemplaresPrestados()
                            + "\n Ejemplares Restantes:" + l.getEjemplaresRestantes()
                            + "\n Alta:" + l.getAlta()
                            + "\n Editorial:" + l.getEditorial().getNombre()
                            + "\n Autor:" + l.getAutor().getNombre());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void imprimirLibroTitulo(String titulo) throws Exception {
        System.out.println(daoLibro.buscarLibroPorTitulo(titulo));
        
    }
    
    public void imprimirLibroISBN(String isbn) throws Exception {
        System.out.println(daoLibro.buscarLibroPorIsbn(isbn));
        
    }
    
    /* public void imprimirLibroAutor(String nombreA) throws Exception {
        System.out.println(daoLibro.buscarLibrosPorAutor(nombreA));
        
    }*/
    
     public void imprimirLibrosAutor(String nombre) throws Exception {
        try {
            //Listamos los usuarios
            Collection<Libro> libros = buscarLibrosPorAutor(nombre);

            //Imprimimos los usuarios - Solo algunos atributos....
            if (libros.isEmpty()) {
                throw new Exception("No existen libros para imprimir");
            } else {
                for (Libro l : libros) {
                    System.out.println("************ LISTA LIBROS POR AUTOR ****************");
                    System.out.println("Isbn:" + l.getIsbn()
                            + "\n Titulo:" + l.getTitulo()
                            + "\n Año de publicacion:" + l.getAnio()
                            + "\n Numero de ejemplares:" + l.getNroEjemplares()
                            + "\n Ejemplares Prestados:" + l.getEjemplaresPrestados()
                            + "\n Ejemplares Restantes:" + l.getEjemplaresRestantes()
                            + "\n Alta:" + l.getAlta()
                            + "\n Editorial:" + l.getEditorial().getNombre()
                            + "\n Autor:" + l.getAutor().getNombre());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       public void imprimirLibrosEditorial(String nombre) throws Exception {
        try {
            //Listamos los usuarios
            Collection<Libro> libros = buscarLibrosPorEditorial(nombre);

            //Imprimimos los usuarios - Solo algunos atributos....
            if (libros.isEmpty()) {
                throw new Exception("No existen libros para imprimir");
            } else {
                for (Libro l : libros) {
                    System.out.println("************ LISTA LIBROS POR EDITORIAL ****************");
                    System.out.println("Isbn:" + l.getIsbn()
                            + "\n Titulo:" + l.getTitulo()
                            + "\n Año de publicacion:" + l.getAnio()
                            + "\n Numero de ejemplares:" + l.getNroEjemplares()
                            + "\n Ejemplares Prestados:" + l.getEjemplaresPrestados()
                            + "\n Ejemplares Restantes:" + l.getEjemplaresRestantes()
                            + "\n Alta:" + l.getAlta()
                            + "\n Editorial:" + l.getEditorial().getNombre()
                            + "\n Autor:" + l.getAutor().getNombre());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
