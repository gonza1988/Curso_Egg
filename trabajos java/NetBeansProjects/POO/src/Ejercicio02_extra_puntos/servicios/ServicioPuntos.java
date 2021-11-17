/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_extra_puntos.servicios;

import Ejercicio02_extra_puntos.entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioPuntos {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Puntos crearPuntos(){
        int x1,x2,y1,y2;
        
        System.out.println("Ingrese las coordenadas de su primer punto: X,Y");
        x1 = leer.nextInt();
        y1 = leer.nextInt();
        System.out.println("Ahora las coordenadas de su segundo punto: X,Y");
        x2 = leer.nextInt();
        y2 = leer.nextInt();
        
        return new Puntos(x1,y1,x2,y2);
    }
    
    public double distanciaPuntos(Puntos puntos){
        double distancia = 0;
        
        distancia = Math.pow((puntos.getX2()-puntos.getX1()), 2) + Math.pow((puntos.getY2()-puntos.getY1()), 2);
        distancia = Math.sqrt(distancia);
        
        return distancia;
    }
}
