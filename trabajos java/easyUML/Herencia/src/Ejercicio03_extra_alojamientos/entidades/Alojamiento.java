/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03_extra_alojamientos.entidades;

import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public abstract class Alojamiento {
    
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

     public void creaAlojamiento(){
        
        System.out.println("Alojamiento");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el Nombre del Alojamiento");
        this.nombre = leer.next().toUpperCase();
        System.out.println("Ingrese la Direccion");
        this.direccion = leer.next().toUpperCase();
        System.out.println("Ingrese la Localidad");
        this.localidad = leer.next().toUpperCase();
        System.out.println("Como se llama el Gerente");
        this.gerente = leer.next().toUpperCase();
     }

     @Override
    public String toString() {
        System.out.println(" * * * * * * * * * ");
        return "Alojamiento " + nombre + "\nDireccion: " + direccion + ", localidad: " + localidad + ", Gerente: " + gerente;
    }
    
    
    
}
