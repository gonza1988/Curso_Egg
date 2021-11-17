/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04_extra_NIF.entidades;

/**
 *
 * @author Gonza Cozzo
 */
public class NIF {
    
    private long dni;
    private Character letra;

    public NIF() {
    }

    public NIF(long dni, Character letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getdni() {
        return dni;
    }

    public void setdni(long dni) {
        this.dni = dni;
    }

    public Character getLetra() {
        return letra;
    }

    public void setLetra(Character letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "NIF{" + "Dni=" + dni + ", letra=" + letra + '}';
    }
    
    
}
