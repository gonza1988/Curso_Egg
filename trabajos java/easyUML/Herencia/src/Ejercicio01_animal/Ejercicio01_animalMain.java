/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01_animal;

import Ejercicio01_animal.entidades.Animal;
import Ejercicio01_animal.entidades.Caballo;
import Ejercicio01_animal.entidades.Gato;
import Ejercicio01_animal.entidades.Perro;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio01_animalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
        La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
        Animal.
        Crear un método en la clase Animal a través del cual cada clase hija deberá
        mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
        una clase Main que realice lo siguiente: */
        
        //Declaraciones del Objeto PERRO
        
        Animal perro = new Perro("Stich","Alimento",15,"Doberman");
        perro.alimentarse();
        
        //Declaracion de otro Objeto Perro
        
        Animal perro2 = new Perro("Tofy","Croquetas",6,"Callejero");
        perro2.alimentarse();
        
        //Declaracion de otro Objeto Gato
        
        Animal gato = new Gato("Kira","Alimento Balanceado",4,"Pursia");
        gato.alimentarse();
        
        //Declaracion de otro Objeto Caballo
        
        Animal caballo = new Caballo("Maximus","Pasto",12,"Fino");
        caballo.alimentarse();
        
        
        
        
    }
    
}
