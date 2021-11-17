/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio07_persona;

import Ejercicio07_persona.entidades.Persona;
import Ejercicio07_persona.servicios.PersonaException;
import Ejercicio07_persona.servicios.ServicioPersona;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio07_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
        sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
        otro atributo, puede hacerlo. Los métodos que se implementarán son:
        • Un constructor por defecto.
        • Un constructor con todos los atributos como parámetro.
        • Métodos getters y setters de cada atributo.
        • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
        al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
        Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
        O. Si no es correcto se deberá mostrar un mensaje
        • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
        kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
        función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
        (incluidos), significa que el peso está por debajo de su peso ideal y la función
        devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
        significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
        hacer uso de constantes para devolver estos valores.
        • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
        devuelve un booleano.
        A continuación, en la clase main hacer lo siguiente:
        Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
        los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
        tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
        persona es mayor de edad.
        Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
        en distintas variables, para después en el main, calcular un porcentaje de esas 4
        personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
        encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
        cuantos menores. */

        ServicioPersona sp = new ServicioPersona();

        //Metodo largo
        /*Persona persona1 = sp.crearPersona();
        Persona persona2 = sp.crearPersona();
        Persona persona3 = sp.crearPersona();*/
        
        //Ejercicio 01 Excepciones!!
        try {

            Persona persona4 = null;
            System.out.println(sp.mayorEdad(persona4));
        } catch (NullPointerException e) {
            
            System.out.println("Objeto creado nulo! "+e.getMessage()+" "+e.toString());
            
        } catch (RuntimeException e) {    

            System.out.println("Error mas profundo "+e.toString());            
        }

        /*Persona[]vectorPersonas = sp.crearPersonas(4);
        sp.porcentajePeso(vectorPersonas);
        sp.porcentajeMayor(vectorPersonas);*/
        //Metodo largo
        /* System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
        System.out.println(persona4.toString());

        int[] vectorImc = new int[4];
        vectorImc[0] = sp.calcularIMC(persona1);
        vectorImc[1] = sp.calcularIMC(persona2);
        vectorImc[2] = sp.calcularIMC(persona3);
        vectorImc[3] = sp.calcularIMC(persona4);

        boolean[] vectorMayor = new boolean[4];
        vectorMayor[0] = sp.mayorEdad(persona1);
        vectorMayor[1] = sp.mayorEdad(persona2);
        vectorMayor[2] = sp.mayorEdad(persona3);
        vectorMayor[3] = sp.mayorEdad(persona4);
        
        
        porcentajePeso(vectorImc);
        porcentajeMayor(vectorMayor); */
    }

}
