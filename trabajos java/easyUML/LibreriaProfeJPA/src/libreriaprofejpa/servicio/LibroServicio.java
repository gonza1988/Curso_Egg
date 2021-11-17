package libreriaprofejpa.servicio;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import libreriaprofejpa.entidad.Autor;
import libreriaprofejpa.entidad.Editorial;
import libreriaprofejpa.entidad.Libro;
import libreriaprofejpa.excepcion.MiExcepcion;
import libreriaprofejpa.persistencia.LibroDAO;
import libreriaprofejpa.utilidad.Utilidad;

public class LibroServicio {

    private Scanner entrada;
    private LibroDAO libroDAO;
    private AutorServicio autorServicio;
    private EditorialServicio editorialServicio;

    public LibroServicio() {
        entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        libroDAO = new LibroDAO();
        autorServicio = new AutorServicio();
        editorialServicio = new EditorialServicio();
    }

    public void crearLibro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer prestados, Integer restantes, Autor autor, Editorial editorial) throws MiExcepcion {
        try {
            Libro libro = new Libro();

            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(prestados);
            libro.setEjemplaresRestantes(restantes);
            libro.setAutor(autor);
            libro.setEditorial(editorial);

            libroDAO.guardarLibro(libro);
        } catch (MiExcepcion e) {
            throw e;
        }
    }

    public void lecturaDeDatos() throws MiExcepcion {
        try {
            List<Autor> autores = autorServicio.obtenerAutores();
            List<Editorial> editoriales = editorialServicio.obtenerEditoriales();
            Autor autor = null;
            Editorial editorial = null;
            Long isbn;
            int cantidadDeAutores = autores.size();
            int cantidadDeEditoriales = editoriales.size();
            int respuestaAutor = 0;
            int respuestaEditorial = 0;

            do {
                isbn = Long.parseLong(Utilidad.generarIsbn());
            } while (libroDAO.buscarLibroPorIsbn(isbn) != null);

            System.out.println("INGRESE EL TÍTULO DEL LIBRO: ");
            String titulo = Utilidad.obtenerCampo();

            System.out.println("INGRESE EL AÑO: ");
            Integer anio = Integer.valueOf(Utilidad.obtenerAnio());

            Integer ejemplares = (int) (Math.random() * 4 + 3);
            Integer prestados = (int) (Math.random() * 3 + 1);
            Integer restantes = ejemplares - prestados;

            if (!autores.isEmpty()) {
                respuestaAutor = lecturaDeDatosAutor(cantidadDeAutores);
            }

            if (respuestaAutor == (cantidadDeAutores + 1) || autores.isEmpty()) {
                autor = autorServicio.lecturaDeDatos();
            } else {
                autor = autores.get(respuestaAutor - 1);
            }

            if (!editoriales.isEmpty()) {
                respuestaEditorial = lecturaDeDatosEditorial(cantidadDeEditoriales);
            }

            if (respuestaEditorial == (cantidadDeEditoriales + 1) || editoriales.isEmpty()) {
                editorial = editorialServicio.lecturaDeDatos();
            } else {
                editorial = editoriales.get(respuestaEditorial - 1);
            }

            crearLibro(isbn, titulo, anio, ejemplares, prestados, restantes, autor, editorial);
        } catch (MiExcepcion e) {
            throw e;
        }
    }

    public int lecturaDeDatosAutor(int cantidadDeAutores) throws MiExcepcion {
        int respuesta = 0;

        do {
            try {
                System.out.println("\nOPCIONES");
                autorServicio.mostrarAutores();
                System.out.println((cantidadDeAutores + 1) + ") INGRESAR AUTOR\n");
                System.out.println("SELECCIONE UN AUTOR O INGRESE UNO: ");
                respuesta = entrada.nextInt();

                if (respuesta < 1 || respuesta > (cantidadDeAutores + 1)) {
                    System.out.println("LA OPCIÓN SELECCIONADA ES INVÁLIDA");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                entrada.next();
            } catch (MiExcepcion e) {
                throw e;
            }
        } while (respuesta < 1 || respuesta > (cantidadDeAutores + 1));

        return respuesta;
    }

    public int lecturaDeDatosEditorial(int cantidadDeEditoriales) throws MiExcepcion {
        int respuesta = 0;

        do {
            try {
                System.out.println("\nOPCIONES");
                editorialServicio.mostrarEditoriales();
                System.out.println((cantidadDeEditoriales + 1) + ") CREAR EDITORIAL\n");
                System.out.println("SELECCIONE UNA EDITORIAL O INGRESE UNA: ");
                respuesta = entrada.nextInt();

                if (respuesta < 1 || respuesta > (cantidadDeEditoriales + 1)) {
                    System.out.println("LA OPCIÓN SELECCIONADA ES INVÁLIDA");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                entrada.next();
            } catch (MiExcepcion e) {
                throw e;
            }
        } while (respuesta < 1 || respuesta > (cantidadDeEditoriales + 1));

        return respuesta;
    }

    public void mostrarLibros() throws MiExcepcion {
        try {
            List<Libro> libros = libroDAO.buscarLibros();

            if (libros.isEmpty()) {
                System.out.println("NO EXISTEN LIBROS");
            } else {
                System.out.println("\nLIBROS");
                System.out.printf("%-16s%-40s%-25s%-15s%-8s%-12s%-12s%-12s%n", "ISBN", "TÍTULO",
                        "AUTOR", "EDITORIAL", "AÑO", "EJEMPLARES", "PRESTADOS", "RESTANTES");
                libros.forEach(System.out::print);
                System.out.println();
            }
        } catch (MiExcepcion e) {
            throw e;
        }
    }
}
