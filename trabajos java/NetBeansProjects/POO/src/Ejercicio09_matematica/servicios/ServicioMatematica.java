/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio09_matematica.servicios;

import Ejercicio09_matematica.entidades.Matematica;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioMatematica {

    public double devolverMayor(Matematica operacion) {
       

        //devuelve el mayor numero entre los dos
        return Math.max(operacion.getNum1(), operacion.getNum2());
    }
    
    public double calcularPotencia(Matematica operacion){
        
        double mayor = Math.max(operacion.getNum1(), operacion.getNum2());
        //redondeo
        mayor = Math.round(mayor);
        double menor = Math.min(operacion.getNum1(), operacion.getNum2());
        menor = Math.round(menor);
        
        //potencia mayor numero por el menor
        return Math.pow(mayor, menor);
    }
    
    public double calcularRaiz(Matematica operacion){
        
        double menor = Math.min(operacion.getNum1(), operacion.getNum2());
        //valor absoluto
        menor = Math.abs(menor);
        
        //calculo de raiz cuadrada
        return Math.sqrt(menor);
    }
}
