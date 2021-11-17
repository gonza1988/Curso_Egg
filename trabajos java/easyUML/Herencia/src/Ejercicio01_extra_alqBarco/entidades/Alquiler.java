/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01_extra_alqBarco.entidades;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
/**
 *
 * @author Gonza Cozzo
 */
public class Alquiler {
    
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private Persona capitan;
    private int posicionAmarre;

    public Alquiler() {
        this.posicionAmarre = (int) Math.random() * 51 + 1;
        this.capitan = new Persona();
    }

    public Alquiler(LocalDate fechaAlquiler, LocalDate fechaDevolucion, Persona capitan) {
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.capitan = capitan;
        this.posicionAmarre = (int) Math.random() * 51 + 1;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Persona getCapitan() {
        return capitan;
    }

    public void setCapitan(Persona capitan) {
        this.capitan = capitan;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public void calculaAlquiler() {
        //Usando ChronoUnit, calculo el numero de dias
        int dias = (int) DAYS.between(this.fechaAlquiler, this.fechaDevolucion);
        System.out.println("Por " + dias + " dias de Amarre");
        System.out.println("El costo total de Alquiler es: $ " + this.capitan.getNave().valorModulo() * dias + "\n\n");
    }

    
}
