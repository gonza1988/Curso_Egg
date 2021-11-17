/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_extra_puntos;

import Ejercicio02_extra_puntos.entidades.Puntos;
import Ejercicio02_extra_puntos.servicios.ServicioPuntos;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio02_extramain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
        atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
        usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
        en los atributos del objeto. Después, a través de otro método calcular y devolver la
        distancia que existe entre los dos puntos que existen en la clase Puntos */
        
        ServicioPuntos sp = new ServicioPuntos();
        Puntos nuevoPunto = sp.crearPuntos();
        
        System.out.println(nuevoPunto.toString());
        System.out.println("La distancia entre las coordenadas ingresadas es = "+sp.distanciaPuntos(nuevoPunto));
    }
    
}
