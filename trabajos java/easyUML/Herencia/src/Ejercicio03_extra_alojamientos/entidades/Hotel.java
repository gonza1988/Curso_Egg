/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03_extra_alojamientos.entidades;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class Hotel extends Alojamiento {

    protected Integer cantHabitaciones;
    protected Integer nroCamas;
    protected Integer cantPisos;
    protected double precioHabitacion;

    public Hotel() {
        super();
        this.precioHabitacion = precioHabitacion();
    }

    public Hotel(Integer cantHabitaciones, Integer nroCamas, Integer cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.nroCamas = nroCamas;
        this.cantPisos = cantPisos;
        try {
            this.precioHabitacion = precioHabitacion();
        } catch (NullPointerException e) {
            System.out.println("Objeto no creado: "+e.toString());
        }

    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getNroCamas() {
        return nroCamas;
    }

    public void setNroCamas(Integer nroCamas) {
        this.nroCamas = nroCamas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion();
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

    public double precioHabitacion() {

        this.precioHabitacion = (double) this.nroCamas + (50);

        return this.precioHabitacion;
    }

    public void creaHotel() {
        super.creaAlojamiento();
        System.out.print(" HOTEL");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de Camas");
        this.nroCamas = leer.nextInt();
        System.out.println("Cuantas Habitaciones tiene?");
        this.cantHabitaciones = leer.nextInt();
        System.out.println("Cuantos Pisos?");
        this.cantPisos = leer.nextInt();
        this.precioHabitacion = precioHabitacion();
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Tipo Hotel con " + cantHabitaciones + " habitaciones y " + nroCamas + " camas, " + cantPisos + " pisos" + "\nPrecio de la Habitacion: $ " + precioHabitacion;
    }

}
