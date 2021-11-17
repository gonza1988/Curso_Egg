/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12_personaDate;

import Ejercicio12_personaDate.entidades.Persona;
import Ejercicio12_personaDate.servicios.ServicioPersonaDate;
import java.util.Scanner;



/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio12_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 12- Implemente la clase Persona. Una persona tiene un nombre y una fecha de
        nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
        siguientes métodos:
       
        • Agregar un método de creación del objeto que respete la siguiente firma:
        crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
        al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
        que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
        • Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
        Tener en cuenta que para conocer la edad de la persona también se debe
        conocer la fecha actual.
        • Agregar a la clase el método menorQue(int edad) que recibe como parámetro
        otra edad y retorna true en caso de que el receptor tenga menor edad que la
        persona que se recibe como parámetro, o false en caso contrario.
        • Metodo mostrarPersona(): este método muestra la persona creada en el método
        anterior */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPersonaDate sp = new ServicioPersonaDate();
        
        Persona persona1 = sp.crearPersona();
        System.out.println(persona1.toString());
        
        System.out.println("La edad de la persona es : "+sp.calcularEdad(persona1));
        //persona1.mostrarFecha();
        
        System.out.println("Ingrese edad a comparar con la persona ingresada anteriormente: ");
        int edadNueva = leer.nextInt();
        System.out.println("¿El objeto creado es menor que la edad ingresada? "+sp.menorQue(persona1, edadNueva));
        sp.mostrarPersona(persona1);
    }
    
}
