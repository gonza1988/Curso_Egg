/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01_animal.entidades;

/**
 *
 * @author Gonza Cozzo
 */
public final class Gato extends Animal {

    public Gato() {
        super();
    }

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        
        super.alimentarse();
        System.out.println("METODO REDEFINIDO POR: @Override \n Y a veces Wiskas!");
    }

    }
