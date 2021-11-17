package principal;

import entidad.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import servicio.PersonaServicio;
import utilidades.Comparadores;

public class ClaseMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); // Declaro el delimitador 
        //Creo instancia de mi servicio para poder acceder a sus metodos.
        PersonaServicio nuevaEjecucion = new PersonaServicio();
        //Cargo dos personas haciendo uso del metodo "Crear Persona"
        Persona persona1 = nuevaEjecucion.cargarPersonas();
        Persona persona2 = nuevaEjecucion.cargarPersonas();
        //Cargo una persona haciendo uso del constructor que recibe parametros
        Persona persona3 = new Persona("ADRIANA", "BESTILLEIRO", 35);
//        System.out.println("***ESTAS SON LAS PERSONAS INGRESADAS***");
//        System.out.println(persona1.toString()); //Imprimo usando toString de cada OBJETO
//        System.out.println(persona2.toString());
//        System.out.println(persona3.toString());
        //AGREGO PERSONAS A MI LISTA - Invoco al metodo, enviando el objeto en este caso q quiero agregar
        nuevaEjecucion.cargarArreglo(persona3);
        nuevaEjecucion.cargarArreglo(persona2);
        nuevaEjecucion.cargarArreglo(persona1);

        System.out.println("***ESTAS SON LAS PERSONAS INGRESADAS pero EN LA LISTA***");
        nuevaEjecucion.imprimirlista();
        //  nuevaEjecucion.eliminarElemento("Perez"); Puedo eliminar por parametro, si lo encuentra,  lo elimina
        System.out.println("Ingrese el apellido a eliminar");
        String aux = leer.next();
        nuevaEjecucion.eliminarElemento(aux); // Le envie una cadena, para ver si existe.. lo elimina
        System.out.println("***ESTAS SON LAS PERSONAS INGRESADAS pero EN LA LISTA***");
        nuevaEjecucion.imprimirlista(); // Llamo d nuevo para ver si el elemento se va a eliminar            

    }

}
