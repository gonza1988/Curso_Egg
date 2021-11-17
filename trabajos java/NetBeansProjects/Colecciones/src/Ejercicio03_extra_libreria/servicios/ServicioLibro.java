/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03_extra_libreria.servicios;

import Ejercicio03_extra_libreria.entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioLibro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Libro> libros;

    public ServicioLibro() {

        this.libros = new HashSet();
    }

    public void crearLibro() {

        libros.add(new Libro("La niebla", "Stephen King", 8, 0));
        libros.add(new Libro("Carrie", "Stephen King", 5, 0));
        libros.add(new Libro("El sabueso de los Vaskerville", "Connan Doyle", 4, 0));
        libros.add(new Libro("Orgullo y prejuicio", "Jane Austen", 6, 0));
        libros.add(new Libro("La fuerza de los Monterrey", "Eliana Abdala", 1, 0));
        libros.add(new Libro("El fantasma de Canterville", "Oscar Wilde", 2, 0));

    }

    public void agregarLibro() {

        System.out.println("\n-----AGREGAR LIBROS-----\n");
        System.out.println("Ingrese Titulo del libro a agregar a la libreria: ");
        String titulo = leer.next();
        System.out.println("Ahora ingrese su autor: ");
        String autor = leer.next();
        System.out.println("Cantidad de ejemplares añadidos");
        int cantEjemplares = leer.nextInt();

        libros.add(new Libro(titulo, autor, cantEjemplares, 0));

    }

    public void mostrarLibros() {

        System.out.println("\n-----MOSTRAR LIBROS-----\n");
        for (Libro aux : libros) {
            System.out.print(aux.toString() + "\n");
        }
    }

    public void prestamo() {
        int bandera = 0, bandera2 = 0;

        System.out.println("\n-----PRESTAMO DE LIBROS-----\n");
        System.out.println("\nIngrese el titulo del libro que desea retirar: \n");
        String titulo = leer.next();

        for (Libro aux : libros) {

            if (aux.getTitulo().equalsIgnoreCase(titulo)) {

                bandera++;
                System.out.println("\nEl titulo buscado se ha encontrado en la biblioteca. Ahora ingrese la cantidad de ejemplares a retirar: \n");
                int cantidad = leer.nextInt();

                if (aux.getNumEjemplares() < cantidad) {

                    //System.out.println("¡Lamentablente no contamos con tantos ejemplares del titulo buscado!");
                    bandera2++;

                } else {

                    aux.setNumEjemplares(aux.getNumEjemplares() - cantidad);
                    aux.setNumPrestados(cantidad);
                    System.out.println("\n¡Operacion exitosa!\n");
                }
            }
        }

        if (bandera == 0) {
            System.out.println("\nEl titulo no se encuentra en nuestra biblioteca\n");
        }

        if (bandera2 > 0) {
            System.out.println("\n¡Lamentablente no contamos con tantos ejemplares del titulo buscado!\n");
        }
    }

    public void devolucion() {
        int bandera = 0, bandera2 = 0;

        System.out.println("\n-----DEVOLUCION DE LIBROS-----\n");
        System.out.println("Ingrese el titulo del libro a devolver:");
        String titulo = leer.next();

        for (Libro aux : libros) {

            if (aux.getTitulo().equalsIgnoreCase(titulo) && (aux.getNumPrestados() > 0)) {

                bandera++;
                System.out.println("\nEl titulo buscado se ha encontrado en la biblioteca y hay " + aux.getNumPrestados() + " ejemplares prestados: \n");
                System.out.println("Ingrese la cantidad de ejemplares a devolver:");
                int cantidad = leer.nextInt();

                if (aux.getNumPrestados() >= cantidad) {

                    aux.setNumEjemplares(aux.getNumEjemplares() + cantidad);
                    aux.setNumPrestados(aux.getNumPrestados() - cantidad);
                    System.out.println("\n¡Operacion exitosa!\n");

                } else {
                    bandera2++;
                }
            }
        }
        
        if (bandera == 0) {
                System.out.println("\nEl titulo no se encuentra en nuestra biblioteca o no posee ejemplares prestados\n");
            }

            if (bandera2 > 0) {
                System.out.println("\nErro.La cantidad de libros a devolver es mayor a los libros prestados.\n");
            }
    }
    
    private void mostrarMenu() {

        System.out.println("-------Menu------\n"
                + "\n----Libreria----\n\n"
                + "1 - Agregar Libro \n"
                + "2 - Prestamo de Libros \n"
                + "3 - Devolucion de Libros \n"
                + "4 - Lista de Libros \n"
                + "5 - Salir \n"
                + "---Elija una opcion---");

    }

    private int elegirOpcion() {

        int sel;

        do {
            sel = leer.nextInt();
            if (sel < 1 || sel > 5) {

                System.out.println("Seleccion invalida ,intente nuevamente: ");
            }

        } while (sel < 1 || sel > 5);

        return sel;
    }

    public void ejecutarMenu() {
        crearLibro();
        mostrarMenu();
        int sel;

        do {

            sel = elegirOpcion();
            switch (sel) {

                case 1:
                    agregarLibro();
                    mostrarMenu();
                    break;
                case 2:
                    prestamo();
                    mostrarMenu();
                    break;
                case 3:
                    devolucion();
                    mostrarMenu();
                    break;
                case 4:
                   // ordenarLista();
                    mostrarLibros();
                    mostrarMenu();
                    break;
                case 5:
                    System.out.println("¡¡Saliendo del menu!!");
            }

        } while (sel != 5);

    }
}
