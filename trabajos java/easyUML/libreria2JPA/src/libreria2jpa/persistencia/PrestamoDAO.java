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
import libreria2jpa.entidades.Prestamo;

/**
 *
 * @author Gonza Cozzo
 */
public class PrestamoDAO {
    
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreria2JPA_PU");
    private final EntityManager em = emf.createEntityManager();
    
    public void guardarPrestamo(Prestamo prestamo) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(prestamo);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("ERROR AL GUARDAR EL PRESTAMO");
        }
    }

    public void modificarPrestamo(Prestamo prestamo) throws Exception {
        try {
            em.getTransaction().begin();
            em.merge(prestamo);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("ERROR AL MODIFICAR EL PRESTAMO");
        }
    }

    public void eliminarPrestamo(Prestamo prestamo) throws Exception {
        try {
            em.getTransaction().begin();
            em.remove(prestamo);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("ERROR AL ELIMINAR EL PRESTAMO");
        }
    }

    public Prestamo buscarPrestamoPorID(Integer id) throws Exception {
        try {
            return em.find(Prestamo.class, id);
        } catch (Exception e) {
            throw new Exception("ERROR AL BUSCAR PRESTAMO POR ID");
        }
    }
/*
    public List<Prestamo> buscarLibroPorTitulo(String titulo) throws Exception {
        try {
            List<Prestamo> libros = em.createQuery("SELECT l FROM Prestamo l WHERE l.titulo LIKE :titulo", Prestamo.class)
                    .setParameter("titulo", titulo)
                    .getResultList();
            return libros;
        } catch (Exception e) {
            throw new Exception("ERROR AL BUSCAR AUTOR POR ISBN");
        }
    }

    public List<Prestamo> buscarLibroPorNombreDeAutor(String autor) throws Exception {
        try {
            return em.createQuery("SELECT l FROM Prestamo l WHERE l.autor.nombre LIKE :autor", Prestamo.class)
                    .setParameter("autor", autor)
                    .getResultList();
        } catch (Exception e) {
            throw new Exception("ERROR AL BUSCAR AUTOR POR ISBN");
        }
    }

    public List<Libro> buscarLibroPorNombreDeEditorial(String editorial) throws Exception {
        try {
            List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre LIKE :editorial", Libro.class)
                    .setParameter("editorial", editorial)
                    .getResultList();
            return libros;
        } catch (Exception e) {
            throw new Exception("ERROR AL BUSCAR AUTOR POR ISBN");
        }
    }*/

    public List<Prestamo> listarPrestamos() throws Exception {
        try {
            List<Prestamo> prestamos = em.createQuery("SELECT P FROM Prestamo p", Prestamo.class)
                    .getResultList();
            return prestamos;
        } catch (Exception e) {
            throw new Exception("ERROR AL BUSCAR PRESTAMOS ");
        }
    }
    
}
