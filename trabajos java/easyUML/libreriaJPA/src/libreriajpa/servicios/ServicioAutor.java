/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.servicios;

import java.util.Collection;
import java.util.List;
import libreriajpa.entidades.Autor;
import libreriajpa.persistencia.AutorDAO;
import libreriajpa.persistencia.LibroDAO;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioAutor {

    private final AutorDAO daoAutor;

    public ServicioAutor() {
        this.daoAutor = new AutorDAO();

    }

    public Autor crearAutor(String nombre) throws Exception {

        try {
            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del autor");
            }

            //Creamos el libro
            Autor nuevoAutor = new Autor();

            nuevoAutor.setNombre(nombre);

            daoAutor.guardarAutor(nuevoAutor);

            return nuevoAutor;

        } catch (Exception e) {
            System.out.println("No se creeo el Autor" + e.getMessage());
            return null;
        }
    }

    public void eliminarAutorPorNombre(String nombre) {

        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del autor");
            }
            daoAutor.eliminarPorNombre(nombre);
            System.out.println("AUTOR ELIMINADO CON EXITO");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void modificarAutor(String nombre, String nuevoNombre) {
        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del autor");
            }
            if (nuevoNombre == null || nuevoNombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nuevo nombre del autor a editar");
            }
            Autor autor = daoAutor.buscarAutorPorNombre(nombre);
            autor.setNombre(nuevoNombre);
            daoAutor.modificarAutor(autor);

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public Autor buscarAutorPorNombre(String nombre) throws Exception {
        try {
            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del Autor");
            }
            Autor autor = daoAutor.buscarAutorPorNombre(nombre);
            //Verificamos
            if (autor == null) {
                throw new Exception("No se econtró Autor para el nombre indicado");
            }
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public Collection<Autor> listaAutor() throws Exception {

        try {
            List<Autor> listaAutores = daoAutor.listarAutor();
            return listaAutores;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirAutorNombre(String nombre) throws Exception {
        System.out.println(daoAutor.buscarAutorPorNombre(nombre));
        
    }

}
