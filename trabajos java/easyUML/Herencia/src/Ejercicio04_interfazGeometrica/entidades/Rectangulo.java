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
public final class Rectangulo implements calculosFormas{
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    

    @Override
    public double calcularPerimetro() {
        double perimetro = 0;
        
        perimetro = (this.base+this.altura) * 2;
        
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area = 0;
        
        area = this.base * this.altura;
        
     return area;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
}
