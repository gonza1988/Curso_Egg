/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria2jpa.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import libreria2jpa.entidades.Autor;

/**
 *
 * @author Gonza Cozzo
 */
public class AutorDAO {
    
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreria2JPA_PU");
    private final EntityManager em = emf.createEntityManager();
                
    public void guardarAutor(Autor autor) throws Exception {
        em.getTransaction().begin();
        em.persist(autor);       
        em.getTransaction().commit();
    }

    public void modificarAutor(Autor autor) throws Exception {
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
    }

    public void eliminarAutorID(Integer id) throws Exception {
        Autor autor = buscarAutorId(id);
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();
    }


    public Autor buscarAutorId(Integer id) throws Exception {
        Autor autor = em.find(Autor.class, id); // Esto que envio es la llave primaria
        return autor;
    }
    
     public Autor buscarAutorPorNombre(String nombre) throws Exception {
         // Para traer objeto con el nombre
         try{
         Autor autor = (Autor) em.createQuery("SELECT d "
                + " FROM Autor d"
                + " WHERE d.nombre LIKE :nombre").
                setParameter("nombre", nombre).
                getSingleResult(); 
        return autor;
         } catch (NoResultException e){
             System.out.println(e.getMessage()); 
             return null;
         } catch (Exception e) {
             throw new Exception("Error al buscar un Autor por Nombre");
         }
    }
    
     public List<Autor> listarAutor() throws Exception {
        List<Autor> autores = em.createQuery("SELECT d FROM Autor d")
                .getResultList();
        return autores;
    }
    
     public void eliminarPorNombre(String nombre) throws Exception {
        Autor autor = buscarAutorPorNombre(nombre);
        em.getTransaction().begin(); 
        em.remove(autor);
        em.getTransaction().commit();    
    }
    
}
