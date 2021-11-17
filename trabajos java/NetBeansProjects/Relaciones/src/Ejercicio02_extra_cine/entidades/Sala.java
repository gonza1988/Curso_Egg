/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_extra_cine.entidades;

/**
 *
 * @author Gonza Cozzo
 */
public class Sala {
    
    private int numero,filas,columnas;

    private final Butaca[][] butacas;

    private Pelicula pelicula;

    public Sala(int numero, int filas, int columnas) {
        this.numero = numero;
        this.filas = filas;
        this.columnas = columnas;
        this.butacas = new Butaca[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                butacas[i][j]= new Butaca((i+1),columnaLetra((j+1)));
            }
        }
        this.pelicula = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    public String butacaIdentificacion(int fila,int columna) {
        return butacas[fila][columna].getIdentificacion();
    }
    
    public boolean butacaLibre(int fila,int columna) {
        return butacas[fila][columna].estaLibre();
    }
    
    public boolean asignarButaca(Espectador e,int fila,int columna) {
        butacas[fila][columna].setEspectador(e);
        return true;
    }
    
    public String columnaLetra(int colum){
        String result="";
        switch(colum){
            case 1:result="A";break;
            case 2:result="B";break;
            case 3:result="C";break;
            case 4:result="D";break;
            case 5:result="E";break;
            case 6:result="F";break;
            case 7:result="G";break;
            case 8:result="H";break;
            case 9:result="I";break;
            case 10:result="J";break;
            case 11:result="K";break;
            case 12:result="L";break;
            case 13:result="M";break;
            case 14:result="N";break;
            case 15:result="O";break;
            case 16:result="P";break;
            case 17:result="Q";break;
        }
        return result;
    }
    
    public int Letracolumna(String colum){
        int result=0;
        switch(colum){
            case "A": result= 1;break;
            case "B": result= 2;break;
            case "C": result= 3;break;
            case "D": result= 4;break;
            case "E": result= 5;break;
            case "F": result= 6;break;
            case "G": result= 7;break;
            case "H": result= 8;break;
            case "I": result= 9;break;
            case "J": result= 10;break;
            case "K": result= 11;break;
            case "L": result= 12;break;
            case "M": result= 13;break;
            case "N": result= 14;break;
            case "O": result= 15;break;
            case "P": result= 16;break;
            case "Q": result= 17;break;
        }
        return result;
    }

}
