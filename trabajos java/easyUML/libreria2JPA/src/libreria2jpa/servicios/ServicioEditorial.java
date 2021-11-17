/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria2jpa.servicios;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import libreria2jpa.entidades.Editorial;
import libreria2jpa.persistencia.EditorialDAO;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioEditorial {
    
    private final EditorialDAO daoEditorial;

    public ServicioEditorial() {
        this.daoEditorial = new EditorialDAO();

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
            nuevaEditorial.setId(UUID.randomUUID().toString());
            nuevaEditorial.setAlta(Boolean.TRUE);

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
            Editorial editorial = buscarEditorialPorNombre(nombre);
            editorial.setNombre(nuevoNombre);
            daoEditorial.modificarEditorial(editorial);
            System.out.println("¡Nombre Editorial, editado con exito!");

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
            System.out.println(e.getMessage());
            return null;
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
    
    public void imprimirEditoriales() throws Exception {
        try {
            //Listamos los usuarios
            Collection<Editorial> editoriales = listaEditorial();

            //Imprimimos los usuarios - Solo algunos atributos....
            if (editoriales.isEmpty()) {
                System.out.println("No existen editoriales para imprimir");
            } else {
                for (Editorial a : editoriales) {
                    System.out.println("************ LISTA EDITORIALES *******************");
                    System.out.println("Id:" + a.getId()
                            + "\n Nombre:" + a.getNombre()
                            + "\n Alta:" + a.getAlta());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void imprimirEditorialNombre(String nombre) throws Exception {
        System.out.println(daoEditorial.buscarEditorialPorNombre(nombre));

    }
}
