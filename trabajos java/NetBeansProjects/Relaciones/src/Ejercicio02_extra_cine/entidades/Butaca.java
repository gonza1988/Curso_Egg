/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_extra_cine.entidades;

import static java.util.Objects.isNull;
/**
 *
 * @author Gonza Cozzo
 */
public class Butaca {

    private Integer Fila;
    private String columna;
    private Espectador espectador;

    public Butaca(Integer Fila, String columna) {
        this.Fila = Fila;
        this.columna = columna;
        //this.espectador = null;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public String getIdentificacion(){
        return Fila+" "+columna;
    }
    
    public boolean estaLibre() {        
        return isNull(espectador);
    }

    public boolean liberarButaca() {
        espectador = null;
        return true;
    }
    
}
