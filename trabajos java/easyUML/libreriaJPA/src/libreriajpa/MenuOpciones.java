/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa;

import java.awt.AWTException;
import java.awt.Robot;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;
import libreriajpa.entidades.Autor;
import libreriajpa.entidades.Editorial;
import libreriajpa.servicios.ServicioAutor;
import libreriajpa.servicios.ServicioEditorial;
import libreriajpa.servicios.ServicioLibro;

/**
 *
 * @author Gonza Cozzo
 */
public class MenuOpciones {

    /*Recordar que este menu es a modo de orden para ir probando los metodos, no tiene importancia
    en si, ya que muy pronto los datos seran recibidos desde los formularios de las paginas web*/
    private final Scanner sc;
    private final ServicioLibro libroService;
    private final ServicioAutor autorService;
    private final ServicioEditorial editorialService;

    public MenuOpciones() {
        this.sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        this.autorService = new ServicioAutor();
        this.editorialService = new ServicioEditorial();
        this.libroService = new ServicioLibro();
    }

    public void menu() throws Exception {
        String respuesta;
        do {
            System.out.println("Seleccione la opción:");
            System.out.println("=====================================");

            System.out.println(" 1- Crear libro completo (autor y editorial incluido)");//OK
            System.out.println(" 2- Crear solo Editorial");//OK
            System.out.println(" 3- Crear solo Autor");//OK
            System.out.println(" 4- Buscar autor por Nombre");//OK
            System.out.println(" 5- Buscar libro por su ISBN");//OK
            System.out.println(" 6- Listar todos los libros");//OK
            System.out.println(" 7- Buscar libro por su Titulo");//OK 
            System.out.println(" 8- Buscar libro por nombre del Autor");//OK
            System.out.println(" 9- Buscar libro por nombre de la Editorial");//OK
            System.out.println(" 10- Eliminar Libro");//OK
            System.out.println(" 11- Eliminar Autor");//OK
            System.out.println(" 12- Eliminar Editorial");//OK

            System.out.println(" 0- Salir");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    libroService.crearLibro(cargarTitulo(), cargarAnio(), cargarNumEjemplares(), cargarEjemPrestados(), cargarAutor(), cargarEditorial());
                    break;
                case 2:
                    editorialService.crearEditorial(cargarEditorial());
                    break;
                case 3:
                    autorService.crearAutor(cargarAutor());
                    break;
                case 4:
                    autorService.imprimirAutorNombre(buscarAutor());
                    break;
                case 5:
                    libroService.imprimirLibroISBN(cargarISBN());
                    break;
                case 6:
                    libroService.imprimirLibros();
                    break;
                case 7:
                    libroService.imprimirLibroTitulo(cargarTitulo());
                    break;
                case 8:
                    libroService.imprimirLibroAutor(buscarAutor());
                    break;
                case 9:
                    libroService.imprimirLibroEditorial(buscarEditorial());
                    break;
                case 10:
                    libroService.eliminarLibro(cargarTitulo()); // Tener en cuenta que si elimino libro, elimino sus mascotas asociadas 
                    break;
                case 11:
                    autorService.eliminarAutorPorNombre(buscarAutor());
                    break;
                case 12:
                    editorialService.eliminarEditorialPorNombre(buscarEditorial());
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

            System.out.println("Desea realizar una nueva consulta o gestion ???:SI/NO");
            respuesta = sc.next();
            respuesta = respuesta.toUpperCase();
            limpiarPantalla();
        } while ("SI".equals(respuesta));

    }

    public void limpiarPantalla() throws AWTException {
        //Dejo esre metodo para ir borrando la consola.. y que no sea un desorden.
        Robot pressbot = new Robot();
        pressbot.setAutoDelay(30); // Tiempo de espera antes de borrar
        pressbot.keyPress(17); // Orden para apretar CTRL key
        pressbot.keyPress(76);// Orden para apretar L key
        pressbot.keyRelease(17); // Orden para soltar CTRL key
        pressbot.keyRelease(76); // Orden para soltar L key

    }

    public String cargarTitulo() throws Exception {
        String tituloI;
        System.out.println("Ingrese el Titulo del Libro");
        tituloI = sc.next();

        return tituloI;
    }

    public Integer cargarAnio() {
        System.out.println("Ingrese el año de publicacion");
        Integer anioI = sc.nextInt();
        return anioI;
    }

    public Integer cargarNumEjemplares() {
        System.out.println("Ingrese cantidad de ejemplares");
        Integer ejemplaresI = sc.nextInt();
        return ejemplaresI;
    }

    public Integer cargarEjemPrestados() {
        System.out.println("Ingrese la cantidad de ejemplares prestados");
        Integer ejemPrestadosI = sc.nextInt();
        return ejemPrestadosI;
    }

    public String cargarAutor() throws Exception {
        String autorI;
        System.out.println("Ingrese el Autor");
        autorI = sc.next();
        try {
            if (validarAutor(autorI)) {
                System.out.println("Autor ingresado NO registrado con antelacion, continue con el registro de datos");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            cargarAutor();
        }
        return autorI;
    }

    public boolean validarAutor(String autorI) throws Exception {
        boolean validar = false;
        try {
            Collection<Autor> autores = autorService.listaAutor();
            for (Autor a : autores) {
                if (a.getNombre().equalsIgnoreCase(autorI)) {
                    throw new Exception("Autor ya registrado, reintente uno nuevo");
                }
            }
            validar = true;
        } catch (Exception e) {
            throw e;
        }
        return validar;
    }

        public String cargarEditorial() throws Exception {
        String editorialI;
        System.out.println("Ingrese la Editorial");
        editorialI = sc.next();
        try {
            if (validarEditorial(editorialI)) {
                System.out.println("Editorial ingresado NO registrado con antelacion, continue con el registro de datos");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            cargarAutor();
        }
        return editorialI;
    }

    public boolean validarEditorial(String editorialI) throws Exception {
        boolean validar = false;
        try {
            Collection<Editorial> editoriales = editorialService.listaEditorial();
            for (Editorial e : editoriales) {
                if (e.getNombre().equalsIgnoreCase(editorialI)) {
                    throw new Exception("Editorial ya registrado, reintente uno nuevo");
                }
            }
            validar = true;
        } catch (Exception e) {
            throw e;
        }
        return validar;
    }
    public String buscarAutor() {
        System.out.println("Ingrese nombre del autor");
        String autorI = sc.next();
        return autorI;
    }
    
    public String buscarEditorial() {
        System.out.println("Ingrese nombre de la Editorial");
        String editorialI = sc.next();
        return editorialI;
    }

    public Long cargarISBN() {
        System.out.println("Ingrese ISBN");
        Long ISBNI = sc.nextLong();
        return ISBNI;
    }

}
