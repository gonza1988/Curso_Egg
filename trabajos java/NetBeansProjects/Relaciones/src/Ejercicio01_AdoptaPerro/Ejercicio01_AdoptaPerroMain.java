/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01_AdoptaPerro;

import Ejercicio01_AdoptaPerro.entidades.Perro;
import Ejercicio01_AdoptaPerro.entidades.Persona;
import Ejercicio01_AdoptaPerro.enumeraciones.Raza;
import java.util.ArrayList;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio01_AdoptaPerroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
        dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
        Persona con atributos: nombre, apellido, edad, documento y Perro.
        Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
        que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
        mostrar desde la clase Persona, la información del Perro y de la Persona. */
        
        Perro perro1 = new Perro("Tofi",Raza.Callejero,6,"Pequeño");
        Perro perro2 = new Perro("Teo",Raza.Coker,8,"Mediano");
        Perro perro3 = new Perro("Milaneso",Raza.Callejero,1,"Mediano");
        
        Persona persona1 = new Persona("Gonzalo","Cozzo",32,"33577670",new ArrayList<>());
        Persona persona2 = new Persona("Miriam","Nogara",62,"12435286",new ArrayList<Perro>());
        
        persona1.getMiperro().add(perro1);
        persona2.getMiperro().add(perro2);
        persona2.getMiperro().add(perro3);
        
        persona1.mostrarPersona();
        persona2.mostrarPersona();

    }
    
}
