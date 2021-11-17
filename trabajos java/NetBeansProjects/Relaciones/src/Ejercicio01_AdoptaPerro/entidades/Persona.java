/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01_AdoptaPerro.entidades;

import java.util.ArrayList;

/**
 *
 * @author Gonza Cozzo
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Integer edad;
    private String documento;
    private ArrayList<Perro> miperro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, String documento, ArrayList<Perro> miperro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.miperro = miperro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public ArrayList<Perro> getMiperro() {
        return miperro;
    }

    public void setMiperro(ArrayList<Perro> miperro) {
        this.miperro = miperro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", miperro=" + miperro + '}';
    }

 

    public void mostrarPersona(){
        
        System.out.println(toString());
    }
    
}
