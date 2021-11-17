package servicio;

import entidad.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import utilidades.Comparadores;

public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Persona> listaPersonas = new ArrayList();/*Creo una variable GLOBAL, que me permitira
   almacenar mis OBBETOS del tipo persona (siempre que asi lo decida) */
    public Persona cargarPersonas() {
        System.out.println("Ingrese su nombre");
        String nombreI = leer.next();
        System.out.println("Ingrese su apellido");
        String apellidoI = leer.next();
        System.out.println("Ingrese su Edad");
        Integer edadI = leer.nextInt();
        //Creo los objetos usando el contructor vacio y dps SET VALORES
        Persona nuevaP = new Persona();
        nuevaP.setNombre(nombreI.toUpperCase());
        nuevaP.setApellido(apellidoI.toUpperCase());
        nuevaP.setEdad(edadI);
        return nuevaP;
    }

    public void cargarArreglo(Persona x) {
        listaPersonas.add(x); // Utilizo ADD para incorporar elementos
    }

    public void imprimirlista() {
        ordenarAscendente(); // LLamo a la FUNCION que ORDENA, luego imprimo
        for (Persona unitario : listaPersonas) {
            System.out.println(unitario); // Como deje previsto mi toString en clase entidad... imprime el objeto con todos sus atributos
        }
    }

    public void eliminarElemento(String apellidoR) {
        Iterator<Persona> it = listaPersonas.iterator();
        //OJO CUANDO ELIMINAN... SI ELIMAN ADRI SE ROMPE EL PROGRAMA
        while (it.hasNext()) {
            Persona next = it.next();
            if (next.getApellido().equalsIgnoreCase(apellidoR)) {               
                it.remove();
            }
        }
    }

    public void ordenarAscendente() {
        Collections.sort(listaPersonas, Comparadores.ordenarporApellidoAsc);
    }
    
    
}
