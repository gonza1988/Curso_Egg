/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria2jpa;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Gonza Cozzo
 */
public class Libreria2JPA {

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
        
/* Ejercicio 01 EXTRA:
        Tareas a Realizar
Al alumno le toca desarrollar, las siguientes funcionalidades:
1. Creación de un Cliente nuevo
2. Crear entidad Préstamo
3. Registrar el préstamo de un libro.
4. Devolución de un libro
5. Búsqueda de todos los prestamos de un Cliente.
6. Agregar validaciones a todas las funcionalidades de la aplicación:
• Validar campos obligatorios.
• No ingresar datos duplicados.
• No generar condiciones inválidas. Por ejemplo, no se debe permitir prestar más
ejemplares de los que hay, ni devolver más de los que se encuentran prestados.
No se podrán prestar libros con fecha anterior a la fecha actual, etc        */

       /* EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreria2JPA_PU");
        EntityManager em = emf.createEntityManager();*/
                
   
        MenuOpciones mo = new MenuOpciones();
        mo.menu();
    }
    
}
