package libreriaprofejpa.servicio;

import java.util.List;
import libreriaprofejpa.entidad.Editorial;
import libreriaprofejpa.excepcion.MiExcepcion;
import libreriaprofejpa.persistencia.EditorialDAO;
import libreriaprofejpa.utilidad.Utilidad;

public class EditorialServicio {

    private EditorialDAO editorialDAO;

    public EditorialServicio() {
        editorialDAO = new EditorialDAO();
    }

    public Editorial crearEditorial(String nombre) throws MiExcepcion {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new MiExcepcion("EL NOMBRE DE LA EDITORIAL ES OBLIGATORIO");
            }

            Editorial editorial = new Editorial();
            editorial.setNombre(nombre);
            editorialDAO.guardarEditorial(editorial);

            return editorial;
        } catch (MiExcepcion e) {
            throw e;
        }
    }

    public void modificarEditorial(Editorial editorial, String nombre) throws MiExcepcion {
        try {
            if (editorial == null) {
                throw new MiExcepcion("LA EDITORIAL NO PUEDE SER NULA");
            }

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new MiExcepcion("EL NOMBRE DE LA EDITORIAL ES OBLIGATORIO");
            }

            editorial.setNombre(nombre);
            editorialDAO.modificarEditorial(editorial);
        } catch (MiExcepcion e) {
            throw e;
        }
    }

    public void eliminarEditorial(Editorial editorial) throws MiExcepcion {
        try {
            if (editorial == null) {
                throw new MiExcepcion("LA EDITORIAL NO PUEDE SER NULA");
            }

            editorial.setAlta(false);
            editorialDAO.modificarEditorial(editorial);
        } catch (MiExcepcion e) {
            throw e;
        }
    }

    public List<Editorial> obtenerEditoriales() throws MiExcepcion {
        try {
            List<Editorial> editoriales = editorialDAO.buscarEditoriales();
            return editoriales;
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER EDITORIALES");
        }
    }

    public void mostrarEditoriales() throws MiExcepcion {
        try {
            List<Editorial> editoriales = editorialDAO.buscarEditoriales();

            if (editoriales.isEmpty()) {
                System.out.println("NO EXISTEN EDITORIALES");
            } else {
                for (int i = 0; i < editoriales.size(); i++) {
                    System.out.printf("%s) %s\n", (i + 1), editoriales.get(i).getNombre());
                }
            }
        } catch (MiExcepcion e) {
            throw e;
        }
    }

    public Editorial lecturaDeDatos() throws MiExcepcion {
        Editorial editorial = null;
        String nombre = null;

        try {
            do {
                System.out.println("INGRESE EL NOMBRE DE LA EDITORIAL: ");
                nombre = Utilidad.obtenerCampo();
            } while (editorialDAO.buscarEditorialPorNombre(nombre) != null);

            editorial = crearEditorial(nombre);
        } catch (MiExcepcion e) {
            throw e;
        }

        return editorial;
    }
}
