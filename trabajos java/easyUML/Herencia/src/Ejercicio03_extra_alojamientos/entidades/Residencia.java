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
public class Residencia extends AlojamientoExtraHotelero{
    
    private Integer cantHabitaciones;
    private boolean descGremio;
    private boolean tieneCampoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer cantHabitaciones, boolean descGremio, boolean tieneCampoDeportivo, boolean privado, Integer cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantMetros, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descGremio = descGremio;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescGremio() {
        return descGremio;
    }

    public void setDescGremio(boolean descGremio) {
        this.descGremio = descGremio;
    }

    public boolean isTieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }

    public void setTieneCampoDeportivo(boolean tieneCampoDeportivo) {
        this.tieneCampoDeportivo = tieneCampoDeportivo;
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
    
    
    
    public void creaResidencia(){
        super.crearAlojamientoExtra();
        System.out.print(" Residencia");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de Habitaciones");
        this.cantHabitaciones = leer.nextInt();
        System.out.println("La residencia tiene descuentos a Gremios?");
        this.descGremio = leer.nextBoolean();
        System.out.println("La residencia tiene campo Deportivo?");
        this.tieneCampoDeportivo = leer.nextBoolean();
    }
    
     @Override
    public String toString() {
        String desc = "no tiene";
        String camp = "no tiene";
        if(descGremio){
            desc = "tiene";
        }
        if (tieneCampoDeportivo){
            camp = "tiene";
        }
        System.out.println(super.toString());
          return "Residencia " + cantHabitaciones + " habitaciones, " + desc + " Descuento a Gremio y " + camp + " Campo Deportivo";
    }


}
