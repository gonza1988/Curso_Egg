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
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    //Constructores
    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumoEnergetico, double peso) {
        this.precio = precioFinal() + 1000;
        this.color = compruebaColor(color);
        this.consumoEnergetico = compruebaConsumo(consumoEnergetico);
        this.peso = peso;
    }

    //Metodos
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = 1000 + precioFinal();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = compruebaColor(color);
    }

    public char getconsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setconsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = compruebaConsumo(consumoEnergetico);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double precioFinal() {
        double precioConsumo = 0, precioPeso = 0, precioFinal = 0;

        switch (this.consumoEnergetico) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
            default:
                this.precio = 1000;
        }

        if (this.peso > 80) {
            
            this.precio += 1000;
            
        } else if (this.peso >= 50) {
            
            this.precio += 800;
            
        } else if (this.peso >= 20) {
            
            this.precio += 500;
            
        } else {
            
            this.precio += 100;
        }
        
        return this.precio;

    }

    private char compruebaConsumo(char consumoI) {
        // consumo = Character.toUpperCase(consumo);
        switch (consumoI) {
            case 'A':
                break;
            case 'B':
                break;
            case 'C':
                break;
            case 'D':
                break;
            case 'E':
                break;
            case 'F':
                break;
            default:
                consumoI = 'F';
        }
        return consumoI;
    }

    private String compruebaColor(String colorI) {
        //color = color.toUpperCase();
        switch (colorI) {
            case "BLANCO":
                colorI = "Blanco";
                break;
            case "NEGRO":
                colorI = "Negro";
                break;
            case "GRIS":
                colorI = "Gris";
                break;
            case "AZUL":
                colorI = "Azul";
                break;
            case "ROJO":
                colorI = "Rojo";
                break;
            default:
                colorI = "Blanco";
        }
        return colorI;
    }

    public void creaElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el Color");
        String colorI = leer.next().toUpperCase();
        this.color = compruebaColor(colorI);
        System.out.println("Ingrese el Consumo (A,B,C,D o F)");
        char consumo = leer.next().toUpperCase().charAt(0);
        this.consumoEnergetico = compruebaConsumo(consumo);
        System.out.println("Cuanto Pesa?");
        double vPeso = leer.nextDouble();
        this.peso = vPeso;
        this.precio = 1000 + precioFinal();
        //double precio, Color color, Consumo conEnerg, double peso
        //this.precio = precioFinal();
         
    }

    @Override
    public String toString() {
        return "Precio: $" + precio + "000" + "\nColor: " + color + "\nConsumo Energetico: " + consumoEnergetico + "\nPeso de embalaje: " + peso + " Kg.";
    }

}
