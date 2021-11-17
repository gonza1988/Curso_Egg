/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03_Alumno;

import Ejercicio03_Alumno.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio03_alumnoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 3.Crear una clase llamada Alumno que mantenga información sobre las notas de
        distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
        de tipo Integer con sus 3 notas.
        En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
        información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
        pregunta al usuario si quiere crear otro Alumno o no.
        Despues de ese bluce tendremos el siguiente método en la clase Alumno:
        Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
        su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
        método. Dentro del método se usará la lista notas para calcular el promedio final
        de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
        main. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Alumno alumnoNuevo;
        ArrayList<Alumno>alumnoLista = new ArrayList();

        String respuesta = "";

        do {

            alumnoNuevo = new Alumno();
            System.out.println("Ingrese nombre del alumno"); // Pedimos los datos del objeto
            String nombre = leer.next().toUpperCase();
            alumnoNuevo.setNombre(nombre);
            for (int i = 0; i < 3; i++) {

                System.out.println("Ahora ingrese las 3 notas de ese alumno:");
                int nota = leer.nextInt();
                alumnoNuevo.getNotas().add(nota);
               
            }

            alumnoLista.add(alumnoNuevo);
            System.out.println("Quiere ingresar otro alumno ?"); // Y preguntamos si quiere ingresar otro alumno 
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("si"));
        
        

        alumnoNuevo.recorrerAlumnos(alumnoLista);
        alumnoNuevo.notaFinal(alumnoLista);

    }

}
