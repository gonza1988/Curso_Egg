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
import libreria2jpa.entidades.Cliente;

/**
 *
 * @author Gonza Cozzo
 */
public class ClienteDAO {
    
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreria2JPA_PU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarCliente(Cliente cliente) throws Exception {
        try
        {
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al crear el cliente" + e.getMessage());
        }
    }

    public void modificarCliente(Cliente cliente) throws Exception {
        try
        {
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
         } catch (Exception e) {
            throw new Exception("Error al modificar al cliente" + e.getMessage());
        }
    }

    public void eliminarClienteId(Integer id) throws Exception {
        try
        {
        Cliente cliente = buscarClienteId(id);
        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
         } catch (Exception e) {
            throw new Exception("Error al eliminar el cliente" + e.getMessage());
        }
    }

    public void eliminarClientePorDni(String dni) throws Exception {
        try
        {
        Cliente cliente = buscarClientePorDni(dni);
        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
         } catch (Exception e) {
            throw new Exception("Error al eliminar el cliente" + e.getMessage());
        }
    }

    public Cliente buscarClienteId(Integer id) throws Exception {
        try
        {
        Cliente cliente = em.find(Cliente.class, id); // Esto que envio es la llave primaria
        return cliente;
         } catch (Exception e) {
            throw new Exception("Error al Buscar el cliente" + e.getMessage());
        }
    }

    public Cliente buscarClientePorDni(String dni) throws Exception {
        try {
            Cliente cliente = (Cliente) em.createQuery("SELECT t "
                    + " FROM Cliente t"
                    + " WHERE t.dni LIKE :dni").
                    setParameter("dni", dni).
                    getSingleResult();
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Cliente> listarClientes() throws Exception {
        try {
            List<Cliente> clientes = em.createQuery("SELECT d FROM Cliente d")
                    .getResultList();
            return clientes;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    
}
