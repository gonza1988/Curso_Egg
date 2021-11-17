/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_06extra_Ahorcado.entidades;

/**
 *
 * @author Gonza Cozzo
 */
public class Ahorcado {
    
    private Character palabra[];
    private Character letrasGuiones[];
    private int letrasEncontradas;
    private int vidas;

    public Ahorcado() {
    }

    public Ahorcado(Character[] palabra, Character[] letrasGuiones, int letrasEncontradas, int vidas) {
        this.palabra = palabra;
        this.letrasGuiones = letrasGuiones;
        this.letrasEncontradas = letrasEncontradas;
        this.vidas = vidas;
    }

    public Character[] getPalabra() {
        return palabra;
    }

    public void setPalabra(Character[] palabra) {
        this.palabra = palabra;
    }

    public Character[] getLetrasGuiones() {
        return letrasGuiones;
    }

    public void setLetrasGuiones(Character[] letrasGuiones) {
        this.letrasGuiones = letrasGuiones;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

  

 
    
    
    
}
