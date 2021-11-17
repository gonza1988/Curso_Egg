/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreriajpa.servicios.ServicioLibro;

/**
 *
 * @author Gonza Cozzo
 */
public class LibreriaJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        /* e) Tareas a Realizar
Al alumno le toca desarrollar, las siguientes funcionalidades:
1) Crear base de datos Librería
2) Crear unidad de persistencia
3) Crear entidades previamente mencionadas ( excepto Préstamo )
4) Generar las tablas con JPA
5) Crear servicios previamente mencionados.
6) Crear los métodos para persistir entidades en la base de datos librería
7) Crear los métodos para dar de alta/bajo o editar dichas entidades.
8) Búsqueda de un Autor por nombre.
9) Búsqueda de un libro por ISBN.
10) Búsqueda de un libro por Título.
11) Búsqueda de un libro/s por nombre de Autor.
12) Búsqueda de un libro/s por nombre de Editorial.
13) Agregar las siguientes validaciones a todas las funcionalidades de la aplicación:
• Validar campos obligatorios.
• No ingresar datos duplicados. */

        /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreriaJPA_PU");
        EntityManager em = emf.createEntityManager();
        ServicioLibro sl = new ServicioLibro();
        sl.crearLibro("Carrie", 1990, 6, 4, "Linux", "Stephen King");
        sl.crearLibro("Orgullo y Prejuicio", 1969, 4, 1, "Ivrea", "Jane Austen");
        sl.imprimirLibros();*/

        MenuOpciones mo = new MenuOpciones();
        mo.menu();

    }

}
