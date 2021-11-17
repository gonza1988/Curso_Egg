package libreriaprofejpa.menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import libreriaprofejpa.excepcion.MiExcepcion;
import libreriaprofejpa.servicio.AutorServicio;
import libreriaprofejpa.servicio.EditorialServicio;
import libreriaprofejpa.servicio.LibroServicio;

public class Menu {

    private Scanner entrada;
    private LibroServicio libroServicio;
    private AutorServicio autorServicio;
    private EditorialServicio editorialServicio;

    public Menu() {
        entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        libroServicio = new LibroServicio();
        autorServicio = new AutorServicio();
        editorialServicio = new EditorialServicio();
    }

    public void interfazPrincipal() {
        int respuesta = 0;
        int salida = 4;

        do {
            try {
                System.out.println("ELIJA UNA OPCIÓN");
                System.out.println("1. MENÚ LIBRO");
                System.out.println("2. MENÚ AUTOR");
                System.out.println("3. MENÚ EDITORIAL");
                System.out.println("4. SALIR");

                respuesta = entrada.nextInt();

                switch (respuesta) {
                    case 1:
                        interfazLibro();
                        break;
                    case 2:
                        interfazAutor();
                        break;
                    case 3:
                        interfazEditorial();
                        break;
                    case 4:
                        System.out.println("*** SESIÓN FINALIZADA ***");
                        break;
                    default:
                        System.out.println("LA OPCIÓN ELEGIDA ES INVÁLIDA");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                entrada.next();
            }
        } while (respuesta != salida);
    }

    public void interfazLibro() {
        int respuesta = 0;
        int salida = 7;

        do {
            try {
                System.out.println("ELIJA UNA OPCIÓN");
                System.out.println("1. INGRESAR LIBRO");
                System.out.println("2. MOSTRAR LIBROS");
                System.out.println("3. BUSCAR LIBRO POR ISBN");
                System.out.println("4. BUSCAR LIBRO POR TÍTULO");
                System.out.println("5. BUSCAR LIBRO/S POR NOMBRE DE AUTOR");
                System.out.println("6. BUSCAR LIBRO/S POR NOMBRE DE EDITORIAL");
                System.out.println("7. SALIR");

                respuesta = entrada.nextInt();

                switch (respuesta) {
                    case 1:
                        libroServicio.lecturaDeDatos();
                        break;
                    case 2:
                        libroServicio.mostrarLibros();
                        break;
                    case 3:
                        // IMPLEMENTAR MÉTODO
                        break;
                    case 4:
                        // IMPLEMENTAR MÉTODO
                        break;
                    case 5:
                        // IMPLEMENTAR MÉTODO
                        break;
                    case 6:
                        // IMPLEMENTAR MÉTODO
                        break;
                    case 7:
                        System.out.println("*** SESIÓN FINALIZADA ***");
                        break;
                    default:
                        System.out.println("LA OPCIÓN ELEGIDA ES INVÁLIDA");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                entrada.next();
            } catch (MiExcepcion e) {
                System.out.println(e.getMessage());
            }
        } while (respuesta != salida);
    }

    public void interfazAutor() {
        int respuesta = 0;
        int salida = 5;

        do {
            try {
                System.out.println("ELIJA UNA OPCIÓN");
                System.out.println("1. CREAR AUTOR");
                System.out.println("2. MODIFICAR AUTOR");
                System.out.println("3. DAR DE ALTA A AUTOR");
                System.out.println("4. DAR DE BAJA A AUTOR");
                System.out.println("5. SALIR");

                respuesta = entrada.nextInt();

                switch (respuesta) {
                    case 1:
                        autorServicio.lecturaDeDatos();
                        break;
                    case 2:
                        autorServicio.mostrarAutores();
                        break;
                    case 3:
                        // IMPLEMENTAR MÉTODO
                        break;
                    case 4:
                        // IMPLEMENTAR MÉTODO
                        break;
                    case 5:
                        System.out.println("*** SESIÓN FINALIZADA ***");
                        break;
                    default:
                        System.out.println("LA OPCIÓN ELEGIDA ES INVÁLIDA");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                entrada.next();
            } catch (MiExcepcion e) {
                System.out.println(e.getMessage());
            }
        } while (respuesta != salida);
    }

    public void interfazEditorial() {
        int respuesta = 0;
        int salida = 5;

        do {
            try {
                System.out.println("ELIJA UNA OPCIÓN");
                System.out.println("1. CREAR EDITORIAL");
                System.out.println("2. MODIFICAR EDITORIAL");
                System.out.println("3. DAR DE ALTA A EDITORIAL");
                System.out.println("4. DAR DE BAJA A EDITORIAL");
                System.out.println("5. SALIR");

                respuesta = entrada.nextInt();

                switch (respuesta) {
                    case 1:
                        editorialServicio.lecturaDeDatos();
                        break;
                    case 2:
                        editorialServicio.mostrarEditoriales();
                        break;
                    case 3:
                        // IMPLEMENTAR MÉTODO
                        break;
                    case 4:
                        // IMPLEMENTAR MÉTODO
                        break;
                    case 5:
                        System.out.println("*** SESIÓN FINALIZADA ***");
                        break;
                    default:
                        System.out.println("LA OPCIÓN ELEGIDA ES INVÁLIDA");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                entrada.next();
            } catch (MiExcepcion e) {
                System.out.println(e.getMessage());
            }
        } while (respuesta != salida);
    }
}
