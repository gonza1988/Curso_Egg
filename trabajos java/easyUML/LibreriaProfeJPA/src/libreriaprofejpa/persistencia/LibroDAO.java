package libreriaprofejpa.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreriaprofejpa.entidad.Libro;
import libreriaprofejpa.excepcion.MiExcepcion;

public class LibroDAO {

    private EntityManager em;

    public LibroDAO() {
        em = Persistence
                .createEntityManagerFactory("LibreriaProfeJPAPU")
                .createEntityManager();
    }

    public void guardarLibro(Libro libro) throws MiExcepcion {
        try {
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new MiExcepcion("ERROR AL GUARDAR LIBRO");
        }
    }

    public void modificarLibro(Libro libro) throws MiExcepcion {
        try {
            em.getTransaction().begin();
            em.merge(libro);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new MiExcepcion("ERROR AL MODIFICAR LIBRO");
        }
    }

    public void eliminarLibro(Libro libro) throws MiExcepcion {
        try {
            em.getTransaction().begin();
            em.remove(libro);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new MiExcepcion("ERROR AL ELIMINAR LIBRO");
        }
    }

    public Libro buscarLibroPorIsbn(Long isbn) throws MiExcepcion {
        try {
            return em.find(Libro.class, isbn);
        } catch (Exception e) {
            throw new MiExcepcion("ERROR AL BUSCAR AUTOR POR ISBN");
        }
    }

    public List<Libro> buscarLibroPorTitulo(String titulo) throws MiExcepcion {
        try {
            List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo", Libro.class)
                    .setParameter("titulo", titulo)
                    .getResultList();
            return libros;
        } catch (Exception e) {
            throw new MiExcepcion("ERROR AL BUSCAR AUTOR POR ISBN");
        }
    }

    public List<Libro> buscarLibroPorNombreDeAutor(String autor) throws MiExcepcion {
        try {
            return em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre LIKE :autor", Libro.class)
                    .setParameter("autor", autor)
                    .getResultList();
        } catch (Exception e) {
            throw new MiExcepcion("ERROR AL BUSCAR AUTOR POR ISBN");
        }
    }

    public List<Libro> buscarLibroPorNombreDeEditorial(String editorial) throws MiExcepcion {
        try {
            List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre LIKE :editorial", Libro.class)
                    .setParameter("editorial", editorial)
                    .getResultList();
            return libros;
        } catch (Exception e) {
            throw new MiExcepcion("ERROR AL BUSCAR AUTOR POR ISBN");
        }
    }

    public List<Libro> buscarLibros() throws MiExcepcion {
        try {
            List<Libro> libros = em.createQuery("SELECT l FROM Libro l", Libro.class)
                    .getResultList();
            return libros;
        } catch (Exception e) {
            throw new MiExcepcion("ERROR AL BUSCAR LIBROS");
        }
    }
}
