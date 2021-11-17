/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.servicios;

import java.util.Collection;
import java.util.List;
import libreriajpa.entidades.Autor;
import libreriajpa.entidades.Editorial;
import libreriajpa.entidades.Libro;
import libreriajpa.persistencia.EditorialDAO;
import libreriajpa.persistencia.LibroDAO;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioEditorial {

    private final EditorialDAO daoEditorial;
    private final LibroDAO daoLibro;

    public ServicioEditorial() {
        this.daoEditorial = new EditorialDAO();
        this.daoLibro = new LibroDAO();
    }

    public Editorial crearEditorial(String nombre) throws Exception {

        try {
            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre de la editorial");
            }

            //Creamos el libro
            Editorial nuevaEditorial = new Editorial();

            nuevaEditorial.setNombre(nombre);

            daoEditorial.guardarEditorial(nuevaEditorial);

            return nuevaEditorial;

        } catch (Exception e) {
            System.out.println("No se creeo la Editorial" + e.getMessage());
            return null;
        }
    }

    public void modificarEditorial(String nombre, String nuevoNombre) {
        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre de la Editorial");
            }
            if (nuevoNombre == null || nuevoNombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nuevo nombre de la Editorial a editar");
            }
            Editorial editorial = daoEditorial.buscarEditorialPorNombre(nombre);
            editorial.setNombre(nuevoNombre);
            daoEditorial.modificarEditorial(editorial);

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

     public void eliminarEditorialPorNombre(String nombre) {

        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre de la Editorial");
            }
            daoEditorial.eliminarPorNombre(nombre);
            System.out.println("EDITORIAL ELIMINADO CON EXITO");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     
     

    public Editorial buscarEditorialPorNombre(String nombre) throws Exception {
        try {

            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre de la editorial");
            }

            Editorial editorial = daoEditorial.buscarEditorialPorNombre(nombre);
            return editorial;
        } catch (Exception e) {
            throw e;
        }
    }

    public Editorial buscarEditorialPorId(Integer id) throws Exception {

        try {
            //Validamos
            if (id == null) {
                throw new Exception("Debe indicar el id de la editorial");
            }
            Editorial editorial = daoEditorial.buscarEditorialId(id);
            return editorial;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Editorial> listaEditorial() throws Exception {

        try {
            List<Editorial> listaEditoriales = daoEditorial.listarEditorial();
            return listaEditoriales;
        } catch (Exception e) {
            throw e;
        }
    }

}
