/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria2jpa.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria2jpa.entidades.Libro;

/**
 *
 * @author Gonza Cozzo
 */
public class LibroDAO {
    
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreria2JPA_PU");
    private final EntityManager em = emf.createEntityManager();
                
    public void guardarLibro(Libro libro) throws Exception {
        try {
        em.getTransaction().begin();
        em.persist(libro);       
        em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al persitir un libro");
        }
    }

    public void modificarLibro(Libro libro) throws Exception {
        try {
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al modificar un libro");
        }
    }

    public void eliminarLibroIsbn(String isbn) throws Exception {
        Libro libro = buscarLibroPorIsbn(isbn);
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
    }


    public Libro buscarLibroPorIsbn(String isbn) throws Exception {
        try
        {
        Libro libro = em.find(Libro.class, isbn); // Esto que envio es la llave primaria
        return libro;
        } catch (Exception e){
            throw new Exception("Error al buscar un libro por isbn");
        }
    }
    //CONSULTA CON PARAMETROS

    public Libro buscarLibroPorTitulo(String titulo) throws Exception {
        Libro libro = (Libro) em.createQuery("SELECT t "
                + " FROM Libro t"
                + " WHERE t.titulo LIKE :titulo").
                setParameter("titulo", titulo).
                getSingleResult();      
        return libro;
    }
    //CONSULTA SIN PARAMETROS

    public List<Libro> listarLibros() throws Exception {
        List<Libro> libros = em.createQuery("SELECT d FROM Libro d")
                .getResultList();
        return libros;
    }
    
     public void eliminarLibroTitulo(String titulo) throws Exception {
        Libro libro = buscarLibroPorTitulo(titulo);
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
    }
    
     public List<Libro> buscarLibrosPorAutor(String nombreA) throws Exception {
         try
         {
         List<Libro> libros = em.createQuery("SELECT t "
                + " FROM Libro t"
                + " WHERE t.autor.nombre LIKE :nombreA").
                setParameter("nombreA", nombreA).
                getResultList();      
        return libros;
        } catch (Exception e)
        {
            System.out.println("ERROR al buscar por Autor");
            return null;
        }
    } 
    // SELECT t FROM Libro t WHERE t.autor.nombre LIKE
     
      public List<Libro> buscarLibrosPorEditorial(String nombreE) throws Exception {
        try
         {
         List<Libro> libros = em.createQuery("SELECT t "
                + " FROM Libro t"
                + " WHERE t.editorial.nombre LIKE :nombreE").
                setParameter("nombreE", nombreE).
                getResultList();      
        return libros;
        } catch (Exception e)
        {
            System.out.println("ERROR al buscar por Editorial");
            return null;
        }
    } 
    
}
