/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_circunferencia.entidades;

import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class Circunferencia {

    private double radio;

    //Constructor vacio
    public Circunferencia() {

    }

    //Constructor inicializado por parametro
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    //Metodo get
    public double getRadio() {
        return radio;
    }

    //Metodo set
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void CrearCircunferencia(double radio) {

        // Se usa el this para diferenciar variable de atributo, ya que tienen el mismo nombre
        
        this.radio = radio;
    }
    
    public double AreaCircunferencia(){
        double area;
        
        area = 3.14 *(radio*radio);
        
        return area;
    }
    
     public double PerimetroCircunferencia(){
        double perimetro;
        
        perimetro = 2 * 3.14 * radio;
        
        return perimetro;
    }
}
