/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.servicios;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import libreriajpa.entidades.Autor;
import libreriajpa.entidades.Editorial;
import libreriajpa.entidades.Libro;
import libreriajpa.persistencia.LibroDAO;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioLibro {

    // RECORDAR QUE SIEMPRE, LA LOGICA DEBE ESTAR EN EL SERVICIO CORRESPONDIENTE
    private final LibroDAO daoLibro;
    private final ServicioEditorial servicioEditorial;
    private final ServicioAutor servicioAutor;

    public ServicioLibro() {
        this.daoLibro = new LibroDAO();
        this.servicioEditorial = new ServicioEditorial();
        this.servicioAutor = new ServicioAutor();
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

            Autor nuevoAutor = servicioAutor.crearAutor(autor);
            Editorial nuevaEditorial = servicioEditorial.crearEditorial(editorial);

            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplares - ejemplaresPrestados);
            libro.setAutor(nuevoAutor);
            libro.setEditorial(nuevaEditorial);

            //Dejo independiente el SET de cargar mascotas, no obligo q cuando se log cargue su mascota
            daoLibro.guardarLibro(libro);
        } catch (Exception e) {
            System.out.println("No se creeo el libro" + e.getMessage());
        }
    }

    public void modificarTitulo(Long isbn, String tituloActual, String nuevoTitulo) throws Exception {

        try {
            //Validamos
            if (isbn == null) {
                throw new Exception("Debe indicar isbn");
            }
            if (tituloActual == null || tituloActual.trim().isEmpty()) {
                throw new Exception("Debe indicar la clave actual");
            }
            if (nuevoTitulo == null || nuevoTitulo.trim().isEmpty()) {
                throw new Exception("Debe indicar la clave nueva");
            }
            //Buscamos
            Libro libro = buscarLibroPorIsbn(isbn);

            //Validamos
            if (!libro.getTitulo().equals(tituloActual)) {
                throw new Exception("El titulo actual no es el regsitrado en el sistema ");
            }
            //Modificamos
            libro.setTitulo(nuevoTitulo);
            daoLibro.modificarLibro(libro);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
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

    public Libro buscarLibroPorAutor(String nombreA) throws Exception {
        try {

            //Validamos
            if (nombreA == null || nombreA.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del Autor");
            }

            Libro libro = daoLibro.buscarLibroPorAutor(nombreA);
            return libro;
        } catch (Exception e) {
            throw e;
        }

    }

     public Libro buscarLibroPorEditorial(String nombreE) throws Exception {
        try {

            //Validamos
            if (nombreE == null || nombreE.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre de la Editorial");
            }

            Libro libro = daoLibro.buscarLibroPorEditorial(nombreE);
            return libro;
        } catch (Exception e) {
            throw e;
        }

    }
     
    public Libro buscarLibroPorIsbn(Long isbn) throws Exception {

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
                    System.out.println("*****************************************");
                    System.out.println("Isbn:" + l.getIsbn()
                            + "\n Titulo:" + l.getTitulo()
                            + "\n Año de publicacion:" + l.getAnio()
                            + "\n Numero de ejemplares:" + l.getEjemplares()
                            + "\n Ejemplares Prestados:" + l.getEjemplaresPrestados()
                            + "\n Ejemplares Restantes:" + l.getEjemplaresRestantes()
                            + "\n Alta:" + l.isAlta()
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
    
    public void imprimirLibroISBN(Long isbn) throws Exception {
        System.out.println(daoLibro.buscarLibroPorIsbn(isbn));
        
    }
    
     public void imprimirLibroAutor(String nombreA) throws Exception {
        System.out.println(daoLibro.buscarLibroPorAutor(nombreA));
        
    }
    
      public void imprimirLibroEditorial(String nombreE) throws Exception {
        System.out.println(daoLibro.buscarLibroPorEditorial(nombreE));
        
    }

    /*  public void cargarMascotaUsuario(String apodo,String raza,String idUsuario) throws Exception{
          Usuario usuario = daoUsuario.buscarUsuarioPorId(idUsuario);
          Mascota nueva = mascotaService.crearMascota(apodo, raza);
          usuario.setMascota(nueva);
          daoUsuario.modificarUsuario(usuario);// Utilizo el metodo del DAO           
    }
     */
}
