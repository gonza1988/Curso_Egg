/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04_interfazGeometrica.entidades;

import Ejercicio04_interfazGeometrica.interfaces.calculosFormas;

/**
 *
 * @author Gonza Cozzo
 */
public final class Circulo implements calculosFormas {
    
    private double radio;
    private double diametro;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.diametro = 2*radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = 2*radio;
    }
    
    

    @Override
    public double calcularPerimetro() {
        double perimetro = 0;
        
        perimetro = calculosFormas.PI * this.diametro;
        
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area = 0;
        
        area = (PI * (Math.pow(this.radio,2)));
        
     return area;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }
    
    
    
}
