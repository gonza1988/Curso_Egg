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
public class Hotel5Estrellas extends Hotel4Estrellas {

    private Integer cantSalonConferencia;
    private Integer cantSuits;
    private Integer cantLimosinas;

    public Hotel5Estrellas() {
        super();
    }

    public Hotel5Estrellas(Integer cantSalonConferencia, Integer cantSuits, Integer cantLimosinas, char gym, String nombreRestaurant, Integer capRestaurant, Integer cantHabitaciones, Integer nroCamas, Integer cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(gym, nombreRestaurant, capRestaurant, cantHabitaciones, nroCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.cantSalonConferencia = cantSalonConferencia;
        this.cantSuits = cantSuits;
        this.cantLimosinas = cantLimosinas;
    }

    public Integer getCantSalonConferencia() {
        return cantSalonConferencia;
    }

    public void setCantSalonConferencia(Integer cantSalonConferencia) {
        this.cantSalonConferencia = cantSalonConferencia;
    }

    public Integer getCantSuits() {
        return cantSuits;
    }

    public void setCantSuits(Integer cantSuits) {
        this.cantSuits = cantSuits;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    public char getGym() {
        return gym;
    }

    public void setGym(char gym) {
        this.gym = gym;
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

    public void creaHotel5E() {
        super.creaHotel4E();
        System.out.print("5 ESTRELLAS");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuantos Salones de Eventos tiene?");
        this.cantSalonConferencia = leer.nextInt();
        System.out.println("Cantidad de SUITs");
        this.cantSuits = leer.nextInt();

    }
    
    @Override
    public double precioHabitacion(){
        
        precioHabitacion = 15 * this.cantLimosinas + super.precioHabitacion;
        
        return precioHabitacion;
    }

     @Override
    public String toString() {
        System.out.print(super.toString());
        return cantSuits + " Suits y, " + cantLimosinas + " Limusinas";
    }
    
    
}
