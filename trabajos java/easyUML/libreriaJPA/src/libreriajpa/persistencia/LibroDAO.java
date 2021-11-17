/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreriajpa.entidades.Libro;

/**
 *
 * @author Gonza Cozzo
 */
public final class LibroDAO {
    /*try {
            em.getTransaction().begin();
            em.persist(persona);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al persitir una persona");
        }*/
    
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreriaJPA_PU");
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
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
    }

    public void eliminarLibroIsbn(Long isbn) throws Exception {
        Libro libro = buscarLibroPorIsbn(isbn);
        em.getTransaction().begin();
        libro.setAlta(false);
        em.remove(libro);
        em.getTransaction().commit();
    }


    public Libro buscarLibroPorIsbn(Long isbn) throws Exception {
        Libro libro = em.find(Libro.class, isbn); // Esto que envio es la llave primaria
        return libro;
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
    
     public Libro buscarLibroPorAutor(String nombreA) throws Exception {
        Libro libro = (Libro) em.createQuery("SELECT t "
                + " FROM Libro t"
                + " INNER JOIN Autor a"
                + " WHERE t.isbn = a.id"
                + " AND a.nombre LIKE :nombreA").
                setParameter("nombreA", nombreA).
                getSingleResult();      
        return libro;
    } 
     
      public Libro buscarLibroPorEditorial(String nombreE) throws Exception {
        Libro libro = (Libro) em.createQuery("SELECT t "
                + " FROM Libro t"
                + " INNER JOIN Editorial e"
                + " WHERE t.isbn = e.id"
                + " AND e.nombre LIKE :nombreE").
                setParameter("nombreE", nombreE).
                getSingleResult();      
        return libro;
    } 
}
