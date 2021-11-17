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
import libreria2jpa.entidades.Editorial;

/**
 *
 * @author Gonza Cozzo
 */
public class EditorialDAO {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreria2JPA_PU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarEditorial(Editorial editorial) throws Exception {
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
    }

    public void modificarEditorial(Editorial editorial) throws Exception {
        em.getTransaction().begin();
        em.merge(editorial);
        em.getTransaction().commit();
    }

    public void eliminarEditorialID(Integer id) throws Exception {
        Editorial editorial = buscarEditorialId(id);
        em.getTransaction().begin();
        em.remove(editorial);
        em.getTransaction().commit();
    }

    public void eliminarPorNombre(String nombre) throws Exception {
        Editorial editorial = buscarEditorialPorNombre(nombre);
        em.getTransaction().begin();
        em.remove(editorial);
        em.getTransaction().commit();
    }

    public Editorial buscarEditorialId(Integer id) throws Exception {
        Editorial editorial = em.find(Editorial.class, id); // Esto que envio es la llave primaria
        return editorial;
    }

    public Editorial buscarEditorialPorNombre(String nombre) throws Exception {
        try {
            Editorial editorial = (Editorial) em.createQuery("SELECT t "
                    + " FROM Editorial t"
                    + " WHERE t.nombre LIKE :nombre").
                    setParameter("nombre", nombre).
                    getSingleResult();
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Editorial> listarEditorial() throws Exception {
        try {
            List<Editorial> editoriales = em.createQuery("SELECT d FROM Editorial d")
                    .getResultList();
            return editoriales;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
