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
public class Camping extends AlojamientoExtraHotelero{
    
    private Integer capMaximaCarpas;
    private Integer cantBanos;
    private boolean tieneRestaurant;

    public Camping() {
        super();
    }

    public Camping(Integer capMaximaCarpas, Integer cantBanos, boolean tieneRestaurant, boolean privado, Integer cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantMetros, nombre, direccion, localidad, gerente);
        this.capMaximaCarpas = capMaximaCarpas;
        this.cantBanos = cantBanos;
        this.tieneRestaurant = tieneRestaurant;
    }

    public Integer getCapMaximaCarpas() {
        return capMaximaCarpas;
    }

    public void setCapMaximaCarpas(Integer capMaximaCarpas) {
        this.capMaximaCarpas = capMaximaCarpas;
    }

    public Integer getCantBanos() {
        return cantBanos;
    }

    public void setCantBanos(Integer cantBanos) {
        this.cantBanos = cantBanos;
    }

    public boolean isTieneRestaurant() {
        return tieneRestaurant;
    }

    public void setTieneRestaurant(boolean tieneRestaurant) {
        this.tieneRestaurant = tieneRestaurant;
    }

    public boolean getPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Integer getCantMetros() {
        return cantMetros;
    }

    public void setCantMetros(Integer cantMetros) {
        this.cantMetros = cantMetros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    public void creaCamping(){
        super.crearAlojamientoExtra();
        System.out.print(" Camping");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la capacidad maxima de  Carpas");
        this.capMaximaCarpas = leer.nextInt();
        System.out.println("Cuantas Baños tiene?");
        this.cantBanos = leer.nextInt();
        System.out.println("EL camping posee Restaurant dentro de las instalaciones?");
        this.tieneRestaurant = leer.nextBoolean();
    }

   @Override
    public String toString() {
        String rest = "No posee";
        if(tieneRestaurant){
            rest = "Si Posee";
        }
        System.out.println(super.toString());
        return "Camping " + capMaximaCarpas + " carpas, " + cantBanos + " baños " + rest + " Restorant";
    }
    
    
    
}
