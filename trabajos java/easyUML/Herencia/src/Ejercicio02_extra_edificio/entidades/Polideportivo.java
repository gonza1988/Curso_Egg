/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_extra_edificio.entidades;

/**
 *
 * @author Gonza Cozzo
 */
public class Polideportivo extends Edificio{
    
    private String nombre;
    private boolean instalacion;

    public Polideportivo() {
        super();
    }


    public Polideportivo(String nombre, boolean instalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }
    
    

    @Override
    public double calcularSuperficie() {
        
        return super.ancho * super.largo;
        
    }

    @Override
    public double calcularVolumen() {
        
        return super.ancho * super.largo * super.alto;
        
    }

    @Override
    public String toString() {
        String instala = "TECHADO";//false
        if (instalacion)
        {
            instala = "AIRE LIBRE";
        }
        return "Polideportivo " + nombre + ", Instalaciones de tipo " + instala;
    }
    
    
    
}
