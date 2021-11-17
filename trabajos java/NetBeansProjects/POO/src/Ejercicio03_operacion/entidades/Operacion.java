/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03_operacion.entidades;

import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class Operacion {

    private int num1;
    private int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void CrearOperacion(int num1, int num2) {

        this.num1 = num1;
        this.num2 = num2;

    }

    /**
     * Funcion destinada a sumar
     * @return suma
     */
    public int sumar() {
        int suma;

        suma = num1 + num2;

        return suma;
    }

    public int restar() {
        int resta;

        resta = num1 - num2;

        return resta;
    }

    public int multiplicar() {
        int multiplicacion;

        if (num1 == 0 || num2 == 0) {

            System.out.println("Error al ingresar el numero 0: ");
            return 0;
           
        } else {

            multiplicacion = num1 * num2;

            return multiplicacion;
        }
        
    }
    
     public double dividir() {
        double division;

        if (num1 == 0 || num2 == 0) {

            System.out.println("Error al ingresar el numero 0 ");
            return 0;
           
        } else {

            division = (double)num1 /(double)num2;

            return division;
        }
        
    }
}
