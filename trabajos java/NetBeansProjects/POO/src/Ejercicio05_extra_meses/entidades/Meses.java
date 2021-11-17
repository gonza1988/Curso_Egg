/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05_extra_meses.entidades;

/**
 *
 * @author Gonza Cozzo
 */
public class Meses {
    
    private String [] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre",};
    private String mesSecreto;

    public Meses() {
        int posAleatoria = (int) Math.floor(Math.random() * 12);
        this.mesSecreto = meses[posAleatoria];
    }

    public Meses(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

   
        

    @Override
    public String toString() {
        return "Meses{" + "meses=" + meses + ", mesSecreto=" + mesSecreto + '}';
    }
   
    
    
}
