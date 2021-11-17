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
public class Hotel4Estrellas extends Hotel {

    protected char gym;
    protected String nombreRestaurant;
    protected Integer capRestaurant;

    public Hotel4Estrellas() {
        super();
    }

    public Hotel4Estrellas(char gym, String nombreRestaurant, Integer capRestaurant, Integer cantHabitaciones, Integer nroCamas, Integer cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, nroCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.gym = gym;
        this.nombreRestaurant = nombreRestaurant;
        this.capRestaurant = capRestaurant;
    }

    public char getGym() {
        return gym;
    }

    public void setGym(char gym) {
        this.gym = compruebaGym(gym);
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public Integer getCapRestaurant() {
        return capRestaurant;
    }

    public void setCapRestaurant(Integer capRestaurant) {
        this.capRestaurant = capRestaurant;
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

    @Override
    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
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

    private char compruebaGym(char letra) {

        switch (letra) {
            case 'A':
                break;
            case 'B':
                break;
            default:
                System.out.println("Ingreso una opcion no validad se asignara tipo B");
                letra = 'B';
        }
        return letra;
    }

    public void creaHotel4E() {
        super.creaHotel();
        System.out.print("4 ESTRELLAS");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cual es el nombre del Restorant?");
        this.nombreRestaurant = leer.next().toUpperCase();
        System.out.println("Cantidad de comensales");
        this.capRestaurant = leer.nextInt();
        System.out.println("De que Categoria es el Gimnasio? A ó B");
        char gy = leer.next().toUpperCase().charAt(0);
        this.gym = compruebaGym(gy);
    }

    @Override
    public double precioHabitacion() {
       double precio = super.precioHabitacion();
        int valorAgregado = 0;
        
        if (this.capRestaurant > 50) {

            valorAgregado += 50;

        } else if (this.capRestaurant > 30) {

            valorAgregado += 30;

        } else {

            valorAgregado += 10;
        }
        if (this.gym == 'A') {

            valorAgregado += 50;

        } else {

            valorAgregado += 30;
        }

        precioHabitacion = valorAgregado + precio;
        
        return precioHabitacion;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Restaurant: " + nombreRestaurant + " Capacidad " + capRestaurant + " Comensales, Gimnasio de tipo " + gym;
    }
    
    
}

