/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05_extra_meses;

import Ejercicio05_extra_meses.entidades.Meses;
import Ejercicio05_extra_meses.servicios.ServicioMeses;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio05_extramain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 5. Crea una clase en Java donde declares una variable de tipo array de Strings que
        contenga los doce meses del año, en minúsculas. A continuación declara una variable
        mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
        mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
        Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
        adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
        Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
        No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
        No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
        ¡Ha acertado */
        
        ServicioMeses sm = new ServicioMeses();
        Meses mes = new Meses();
        //System.out.println(mes.toString());
        sm.jugar(mes);
    }
    
}
