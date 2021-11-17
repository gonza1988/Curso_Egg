/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria2jpa.servicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import libreria2jpa.entidades.Cliente;
import libreria2jpa.entidades.Libro;
import libreria2jpa.entidades.Prestamo;
import libreria2jpa.persistencia.PrestamoDAO;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioPrestamo {

    private final PrestamoDAO daoPrestamo;
    private final ServicioCliente servicioCliente;
    private final ServicioLibro servicioLibro;

    public ServicioPrestamo() {

        this.daoPrestamo = new PrestamoDAO();
        this.servicioCliente = new ServicioCliente();
        this.servicioLibro = new ServicioLibro();
    }

    public void crearPrestamo(Date fechaDevolucion, List<Libro> libros, Cliente cliente) throws Exception {
        try {
            //Validamos
            if (fechaDevolucion == null) {
                throw new Exception("Debe indicar la fecha de Devolucion");
            }
            //Creamos el Prestamo
            Prestamo prestamo = new Prestamo();

            prestamo.setFechaPrestamo(new Date());
            prestamo.setFechaDevolucion(fechaDevolucion);
            prestamo.setLibros(libros);
            prestamo.setCliente(cliente);

            daoPrestamo.guardarPrestamo(prestamo);
            System.out.println("¡Prestamo Realizado exitosamente!");
        } catch (Exception e) {
            System.out.println("No se creeo el Prestamo" + e.getMessage());
        }
    }

    public Collection<Prestamo> listaPrestamos() throws Exception {

        try {
            List<Prestamo> listaDePrestamos = daoPrestamo.listarPrestamos();
            return listaDePrestamos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirPrestamos() throws Exception {
        try {
            //Listamos los usuarios
            Collection<Prestamo> prestamos = listaPrestamos();

            //Imprimimos los usuarios - Solo algunos atributos....
            if (prestamos.isEmpty()) {
                throw new Exception("No existen Prestamos para imprimir");
            } else {
                for (Prestamo l : prestamos) {
                    System.out.println("************ LISTA LIBROS *******************");
                    System.out.println("Id:" + l.getId()
                            + "\n Fecha De Prestamo:" + l.getFechaPrestamo().getDate()+"/"+ l.getFechaPrestamo().getMonth()+"/"+ l.getFechaPrestamo().getYear()
                            + "\n Fecha De Devolucion:" + l.getFechaDevolucion().getDate()+"/"+ l.getFechaDevolucion().getMonth()+"/"+ l.getFechaDevolucion().getYear()
                            + "\n Libros Prestados:" + l.getLibros().toString()
                            + "\n Cliente:" + l.getCliente());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
