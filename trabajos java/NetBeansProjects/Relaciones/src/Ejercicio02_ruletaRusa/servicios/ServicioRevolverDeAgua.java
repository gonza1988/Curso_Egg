/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_ruletaRusa.servicios;

import Ejercicio02_ruletaRusa.entidades.RevolverDeAgua;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioRevolverDeAgua {

    RevolverDeAgua r1 = new RevolverDeAgua();
    
    public RevolverDeAgua llenarRevolver() {
        //RevolverDeAgua r1 = new RevolverDeAgua();

        r1.setPosActual((int) (Math.random() * 6+1));
        r1.setPosAgua((int) (Math.random() * 6+1));

        return r1;
    }

    public boolean mojar() {
        boolean mojado = false;

        if (r1.getPosActual() == (r1.getPosAgua())) {
            mojado = true;
        } else {
            mojado = false;
        }

        return mojado;
    }

    public void siguienteChorro(){
        
        if (r1.getPosActual()<6) {
            
            r1.setPosActual(r1.getPosActual()+1);
            
        }else {
            
            r1.setPosActual(1);
        }
        
    }

    @Override
    public String toString() {
        return "ServicioRevolverDeAgua{" + "r1=" + r1 + '}';
    }
    
    
}
