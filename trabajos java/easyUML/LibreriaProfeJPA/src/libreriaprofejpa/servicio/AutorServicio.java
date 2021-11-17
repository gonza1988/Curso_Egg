package libreriaprofejpa.servicio;

import java.util.List;
import libreriaprofejpa.entidad.Autor;
import libreriaprofejpa.excepcion.MiExcepcion;
import libreriaprofejpa.persistencia.AutorDAO;
import libreriaprofejpa.utilidad.Utilidad;

public class AutorServicio {

    private AutorDAO autorDAO;

    public AutorServicio() {
        autorDAO = new AutorDAO();
    }

    public Autor crearAutor(String nombre) throws MiExcepcion {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new MiExcepcion("EL NOMBRE DEL AUTOR ES OBLIGATORIO");
            }

            Autor autor = new Autor();
            autor.setNombre(nombre);
            autorDAO.guardarAutor(autor);

            return autor;
        } catch (MiExcepcion e) {
            throw e;
        }
    }

    public void modificarAutor(Autor autor, String nombre) throws MiExcepcion {
        try {
            if (autor == null) {
                throw new MiExcepcion("EL AUTOR NO PUEDE SER NULO");
            }

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new MiExcepcion("EL NOMBRE DEL AUTOR ES OBLIGATORIO");
            }

            autor.setNombre(nombre);
            autorDAO.modificarAutor(autor);
        } catch (MiExcepcion e) {
            throw e;
        }
    }

    public void eliminarAutor(Autor autor) throws MiExcepcion {
        try {
            if (autor == null) {
                throw new MiExcepcion("EL AUTOR NO PUEDE SER NULO");
            }

            autor.setAlta(false);
            autorDAO.modificarAutor(autor);
        } catch (MiExcepcion e) {
            throw e;
        }
    }

    public List<Autor> obtenerAutores() throws MiExcepcion {
        try {
            List<Autor> autores = autorDAO.buscarAutores();
            return autores;
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER AUTORES");
        }
    }

    public void mostrarAutores() throws MiExcepcion {
        try {
            List<Autor> autores = autorDAO.buscarAutores();

            if (autores.isEmpty()) {
                System.out.println("NO EXISTEN AUTORES");
            } else {
                for (int i = 0; i < autores.size(); i++) {
                    System.out.printf("%s) %s\n", (i + 1), autores.get(i).getNombre());
                }
            }
        } catch (MiExcepcion e) {
            throw e;
        }
    }

    public Autor lecturaDeDatos() throws MiExcepcion {
        Autor autor = null;
        String nombre = null;

        try {
            do {
                System.out.println("INGRESE EL NOMBRE DEL AUTOR: ");
                nombre = Utilidad.obtenerCampo();
            } while (autorDAO.buscarAutorPorNombre(nombre) != null);

            autor = crearAutor(nombre);
        } catch (MiExcepcion e) {
            throw e;
        }

        return autor;
    }
}
