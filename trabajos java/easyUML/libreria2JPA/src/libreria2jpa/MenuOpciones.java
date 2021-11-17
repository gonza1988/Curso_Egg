/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria2jpa;

import java.awt.AWTException;
import java.awt.Robot;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import libreria2jpa.entidades.Autor;
import libreria2jpa.entidades.Cliente;
import libreria2jpa.entidades.Editorial;
import libreria2jpa.entidades.Libro;
import libreria2jpa.servicios.ServicioAutor;
import libreria2jpa.servicios.ServicioCliente;
import libreria2jpa.servicios.ServicioEditorial;
import libreria2jpa.servicios.ServicioLibro;
import libreria2jpa.servicios.ServicioPrestamo;

/**
 *
 * @author Gonza Cozzo
 */
public class MenuOpciones {

    private final Scanner sc;
    private final ServicioLibro libroService;
    private final ServicioAutor autorService;
    private final ServicioEditorial editorialService;
    private final ServicioCliente clienteService;
    private final ServicioPrestamo prestamoService;

    public MenuOpciones() {
        this.sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        this.autorService = new ServicioAutor();
        this.editorialService = new ServicioEditorial();
        this.libroService = new ServicioLibro();
        this.clienteService = new ServicioCliente();
        this.prestamoService = new ServicioPrestamo();
    }

    public void menu() throws Exception {
        String respuesta;
        do {
            try {
                System.out.println("");
                System.out.println("*****      BIBLIOTECA     ******");
                System.out.println("** 1. ADMINISTRAR LIBROS      **");
                System.out.println("** 2. ADMINISTRAR AUTORES     **");
                System.out.println("** 3. ADMINISTRAR EDITORIALES **");
                System.out.println("** 4. ADMINISTRAR CLIENTES **");
                System.out.println("** 5. ADMINISTRAR PRESTAMOS **");
                System.out.println("** 6. PARA SALIR              **");
                System.out.println("********************************");
                System.out.println("Ingrese la opcion...\n");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        menuLibro();
                        break;
                    case 2:
                        menuAutor();
                        break;
                    case 3:
                        menuEditorial();
                        break;
                    case 4:
                        menuCliente();
                        break;
                    case 5:
                        menuPrestamo();
                        break;
                    case 6:
                        System.out.println("\nSaliendo del menu de BIBLIOTECA \n");
                        break;
                    case 0:
                        System.exit(0);
                        break;
                }
            } catch (InputMismatchException e) {
                e.getMessage();
                System.out.println("No insertar letras como respuesta\n\n");
                sc.next();
            }
            //limpiarPantalla();
            System.out.println("Desea realizar una nueva consulta o gestion ???:SI/NO");
            respuesta = sc.next();
            respuesta = respuesta.toUpperCase();
            //limpiarPantalla();
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

    private void menuLibro() throws Exception {
        int op = 0;

        do {
            try {
                System.out.println("");
                System.out.println("*****   LIBROS    ******");
                System.out.println("** 1. MOSTRAR LIBROS **");
                System.out.println("** 2. AGREGAR LIBRO  **");
                System.out.println("** 3. BORRAR LIBRO   **");
                System.out.println("** 4. EDITAR LIBRO **");
                System.out.println("** 5. BUSCAR LIBRO POR ISBN  **");
                System.out.println("** 6. BUSCAR LIBRO POR TITULO  **");
                System.out.println("** 7. BUSCAR LIBRO POR NOMBRE DE AUTOR  **");
                System.out.println("** 8. BUSCAR LIBRO POR NOMBRE DE EDITORIAL  **");
                System.out.println("** 9. VOLVER         **");
                System.out.println("***********************");
                System.out.println("Ingrese la opcion...\n");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        libroService.imprimirLibros();
                        break;
                    case 2:
                        libroService.crearLibro(cargarTitulo(), cargarAnio(), cargarNumEjemplares(), cargarEjemPrestados(), buscarEditorial(), buscarAutor());
                        break;
                    case 3:
                        libroService.eliminarLibro(cargarTitulo());
                        break;
                    case 4:
                        libroService.modificarTitulo(cargarTitulo(), cargarNuevoTitulo());
                        break;
                    case 5:
                        libroService.imprimirLibroISBN(cargarISBN());
                        break;
                    case 6:
                        libroService.imprimirLibroTitulo(cargarTitulo());
                        break;
                    case 7:
                        libroService.imprimirLibrosAutor(buscarAutor());
                        break;
                    case 8:
                        libroService.imprimirLibrosEditorial(buscarEditorial());
                        break;
                    case 9:
                        System.out.println("\n- VOLVIENDO AL MENU PRINCIPAL -\n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no valida");
                        op = 0;
                }

            } catch (InputMismatchException e) {
                e.getMessage();
                System.out.println("No insertar letras en el menu\n\n");
                sc.next();
            }
            // limpiarPantalla();
        } while (op != 9);
    }

    public String cargarTitulo() throws Exception {
        String tituloI;
        System.out.println("Ingrese el Titulo del Libro");
        tituloI = sc.next();

        return tituloI;
    }

    public String cargarNuevoTitulo() throws Exception {
        String tituloI;
        System.out.println("Ingrese el nuevo Titulo del Libro");
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

    public String cargarISBN() {
        System.out.println("Ingrese ISBN");
        String ISBNI = sc.next();
        return ISBNI;
    }

    private void menuAutor() throws Exception {
        int op = 0;

        do {
            try {
                System.out.println("");
                System.out.println("*****  AUTORES    ******");
                System.out.println("** 1. MOSTRAR AUTORES **");
                System.out.println("** 2. AGREGAR AUTOR   **");
                System.out.println("** 3. EDITAR AUTOR   **");
                System.out.println("** 4. BORRAR AUTOR    **");
                System.out.println("** 5. BUSCAR AUTOR    **");
                System.out.println("** 6. VOLVER          **");
                System.out.println("************************");
                System.out.println("Ingrese la opcion...\n");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        autorService.imprimirAutores();
                        break;
                    case 2:
                        autorService.crearAutor(cargarAutor());
                        break;
                    case 3:
                        autorService.modificarAutor(buscarAutor(), cargarNuevoAutor());
                        break;
                    case 4:
                        autorService.eliminarAutorPorNombre(buscarAutor());
                        break;
                    case 5:
                        autorService.imprimirAutorNombre(buscarAutor());
                        break;
                    case 6:
                        System.out.println("\n- VOLVIENDO AL MENU PRINCIPAL -\n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no valida");
                        op = 0;
                }

            } catch (InputMismatchException e) {
                e.getMessage();
                System.out.println("Error al ingresar una letra, reintente: \n\n");
                sc.next();
            }
        } while (op != 6);
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

    public String cargarNuevoAutor() {
        System.out.println("Ingrese nombre del autor Nuevo");
        String autorI = sc.next();
        return autorI;
    }

    public String buscarAutor() {
        System.out.println("Ingrese nombre del autor");
        String autorI = sc.next();
        return autorI;
    }

    private void menuEditorial() throws Exception {
        int op = 0;

        do {
            try {
                System.out.println("");
                System.out.println("*****  EDITORIALES    ******");
                System.out.println("** 1. MOSTRAR EDITORIALES **");
                System.out.println("** 2. AGREGAR EDITORIAL   **");
                System.out.println("** 3. EDITAR EDITORIAL   **");
                System.out.println("** 4. BORRAR EDITORIAL    **");
                System.out.println("** 5. BUSCAR EDITORIAL    **");
                System.out.println("** 6. VOLVER          **");
                System.out.println("************************");
                System.out.println("Ingrese la opcion...\n");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        editorialService.imprimirEditoriales();
                        break;
                    case 2:
                        editorialService.crearEditorial(cargarEditorial());
                        break;
                    case 3:
                        editorialService.modificarEditorial(buscarEditorial(), cargarNuevaEditorial());
                        break;
                    case 4:
                        editorialService.eliminarEditorialPorNombre(buscarEditorial());
                        break;
                    case 5:
                        editorialService.imprimirEditorialNombre(buscarEditorial());
                        break;
                    case 6:
                        System.out.println("\n- VOLVIENDO AL MENU PRINCIPAL -\n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }

            } catch (InputMismatchException e) {
                e.getMessage();
                System.out.println("Error al ingresar una letra, reintente: \n\n");
                sc.next();
            }
        } while (op != 6);
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

    public String cargarNuevaEditorial() {
        System.out.println("Ingrese nombre de la Editorial Nueva");
        String editorialI = sc.next();
        return editorialI;
    }

    public String buscarEditorial() {
        System.out.println("Ingrese nombre de la Editorial");
        String editorialI = sc.next();
        return editorialI;
    }

    private void menuCliente() throws Exception {
        int op = 0;

        do {
            try {
                System.out.println("");
                System.out.println("*****  CLIENTES    ******");
                System.out.println("** 1. MOSTRAR CLIENTES **");
                System.out.println("** 2. AGREGAR CLIENTE   **");
                System.out.println("** 3. EDITAR CLIENTE   **");
                System.out.println("** 4. BORRAR CLIENTE    **");
                System.out.println("** 5. BUSCAR CLIENTE DNI  **");
                System.out.println("** 6. BUSCAR CLIENTE ID  **");
                System.out.println("** 7. VOLVER          **");
                System.out.println("************************");
                System.out.println("Ingrese la opcion...\n");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        clienteService.imprimirClientes();
                        break;
                    case 2:
                        clienteService.crearCliente(cargarDni(), cargarNombre(), cargarApellido(), cargarTelefono());
                        break;
                    case 3:
                        clienteService.modificarCliente(buscarDni(), cargarNombre(), cargarApellido(), cargarTelefono());
                        break;
                    case 4:
                        clienteService.eliminarCliente(buscarDni());
                        break;
                    case 5:
                        clienteService.imprimirUnClienteDni(buscarDni());
                        break;
                    case 6:
                        clienteService.imprimirUnClienteId(buscarId());
                        break;
                    case 7:
                        System.out.println("\n- VOLVIENDO AL MENU PRINCIPAL -\n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no valida");
                        op = 0;
                }

            } catch (InputMismatchException e) {
                e.getMessage();
                System.out.println("Error al ingresar una letra, reintente: \n\n");
                sc.next();
            }
        } while (op != 7);
    }

    public String cargarDni() throws Exception {
        String DniI;
        System.out.println("Ingrese dni Cliente");
        DniI = sc.next();
        try {
            if (validarCliente(DniI)) {
                System.out.println("Cliente ingresado NO registrado con antelacion, continue con el registro de datos");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            cargarDni();
        }
        return DniI;
    }

    public boolean validarCliente(String dniI) throws Exception {
        boolean validar = false;
        try {
            Collection<Cliente> clientes = clienteService.listaClientes();
            for (Cliente c : clientes) {
                if (c.getDni().equalsIgnoreCase(dniI)) {
                    throw new Exception("Cliente ya registrado, reintente uno nuevo");
                }
            }
            validar = true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return validar;
    }

    public String cargarNombre() {
        System.out.println("Ingrese nombre del Cliente");
        String autorI = sc.next();
        return autorI;
    }

    public String cargarApellido() {
        System.out.println("Ingrese Apellido del Cliente");
        String autorI = sc.next();
        return autorI;
    }

    public String cargarTelefono() {
        System.out.println("Ingrese numero de telefono del Cliente");
        String autorI = sc.next();
        return autorI;
    }

    public String buscarDni() {
        System.out.println("Ingrese dni del Cliente a buscar");
        String autorI = sc.next();
        return autorI;
    }

    public Integer buscarId() {
        System.out.println("Ingrese Id del Cliente a buscar");
        Integer idI = sc.nextInt();
        return idI;
    }

    private void menuPrestamo() throws Exception {
        int op = 0;

        do {
            try {
                System.out.println("");
                System.out.println("*****  PRESTAMOS    ******");
                System.out.println("** 1. MOSTRAR PRESTAMOS **");
                System.out.println("** 2. CREAR PRESTAMO   **");
                System.out.println("** 3. EDITAR PRESTAMO   **");
                System.out.println("** 4. BORRAR PRESTAMO    **");
                System.out.println("** 5. DEVOLUCION PRESTAMO  **");
                System.out.println("** 6. BUSCAR PRESTAMO POR CLIENTE  **");
                System.out.println("** 7. VOLVER          **");
                System.out.println("************************");
                System.out.println("Ingrese la opcion...\n");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        prestamoService.imprimirPrestamos();
                        break;
                    case 2:
                        prestamoService.crearPrestamo(cargarFechaDevolucion(), cargarListaLibros(), cargarCliente());
                        break;
                    case 3:
                        prestamoService.modificarCliente(buscarDni(), cargarNombre(), cargarApellido(), cargarTelefono());
                        break;
                    case 4:
                        prestamoService.eliminarCliente(buscarDni());
                        break;
                    case 5:
                        prestamoService.imprimirUnClienteDni(buscarDni());
                        break;
                    case 6:
                        prestamoService.imprimirUnClienteId(buscarId());
                        break;
                    case 7:
                        System.out.println("\n- VOLVIENDO AL MENU PRINCIPAL -\n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no valida");
                        op = 0;
                }

            } catch (InputMismatchException e) {
                e.getMessage();
                System.out.println("Error al ingresar una letra, reintente: \n\n");
                sc.next();
            }
        } while (op != 7);
    }

    public Date cargarFechaDevolucion() throws ParseException {
        System.out.println("Ingrese mes , dia , anio  de la Devolucion del prestamo MM/DD/ANIO");
        Date fecha = null;

        String inputDate = sc.nextInt() + "/" + sc.nextInt() + "/" + sc.nextInt();
        fecha = new SimpleDateFormat("MM/dd/yyyy").parse(inputDate);
        System.out.println(fecha);
        return fecha;
    }

    public List<Libro> cargarListaLibros() throws Exception {
        String respuesta;
        String titulo;
        List<Libro> libros = new ArrayList();
        System.out.println("Lista de libros actual de la biblioteca: \n");
        libroService.imprimirLibros();
        do {
            try {

                System.out.println("\n\n Ingrese titulo del libro a retirar" );
                titulo = sc.next();
                Libro libro = libroService.buscarLibroPorTitulo(titulo);
                libros.add(libro);

            } catch (Exception e) {
                throw new Exception(e.getMessage());
                //sc.next();
            }
            System.out.println("Desea realizar una nueva consulta o gestion ???:SI/NO");
            respuesta = sc.next();
            respuesta = respuesta.toUpperCase();

        } while ("SI".equals(respuesta));

        return libros;
    }

    public Cliente cargarCliente() throws Exception {
        System.out.println("Recuerde que el cliente ya debe estar creado para poder realizar el Prestamo: ");
        String DniI;
        System.out.println("Ingrese dni Cliente");
        DniI = sc.next();
        try {
            Cliente cliente = clienteService.buscarClientePorDni(DniI);
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
}
