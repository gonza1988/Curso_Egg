/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02Y03_electrodomesticos.entidades;

import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class Lavarropa extends Electrodomestico {
    
     private int carga;

    public Lavarropa() {
        super();
    }

    public Lavarropa(int carga, String color, char consumoEnergetico, double peso) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
   
    public void crearLavarropa() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("LAVARROPA: Cuantos Kilos de ropa carga?");
        this.carga = leer.nextInt();
        super.creaElectrodomestico();
        //precioFinal();
    }   
    
    @Override
    public double precioFinal(){
        super.precioFinal();
        if(this.carga>30){
            super.precio = super.precio +500;
        }

        return super.precio;
    }
    

    @Override
    public String toString() {
        return "Lavarropa de " + carga + " kilos de carga\n"
                + super.toString();
    }
    
    
    
}
