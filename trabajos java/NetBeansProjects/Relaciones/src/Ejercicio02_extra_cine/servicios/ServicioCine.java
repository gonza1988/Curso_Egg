/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_extra_cine.servicios;

import Ejercicio02_extra_cine.entidades.Espectador;
import Ejercicio02_extra_cine.entidades.Pelicula;
import Ejercicio02_extra_cine.entidades.Sala;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioCine {
    
    private Sala s;
    private Pelicula p;
    
    public void crearSala(){
        //s = new Sala(Integer.parseInt(JOptionPane.showInputDialog("Numero de Sala:")),Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Filas de la sala:")),Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Columnas de la sala:")));
        s = new Sala(1,8,6);
    }
    
    public void asignarPelicula(){
        p = new Pelicula(JOptionPane.showInputDialog("Titulo de la Peli:"),Integer.parseInt(JOptionPane.showInputDialog("Minutos de duracion de la Peli:")),Integer.parseInt(JOptionPane.showInputDialog("Edad minima:")),JOptionPane.showInputDialog("Nombre del Director:"),Float.parseFloat(JOptionPane.showInputDialog("Precio del boleto:")));
        s.setPelicula(p);
    }
    
    public void verSala(){
        String sala_string = "";
        for (int i = s.getFilas(); i > 0; i--) {
            for (int j = 0; j < s.getColumnas(); j++) {
                sala_string += s.butacaIdentificacion((i-1),(j));
                if(s.butacaLibre((i-1),(j))){
                    sala_string += "    |";
                }else{
                    sala_string += " X |";
                }
            }
             sala_string += "\n";
        }
        JOptionPane.showMessageDialog(null,sala_string);
    }
    
    public void fabricaEspectadoresConAsignacion(){
        Random rn = new Random();
        int cant_espectadores = rn.nextInt((s.getFilas()*s.getColumnas())),j,k;
        Espectador e;
        String resultado = "";
        for (int i = 0; i < cant_espectadores; i++) {
            for(;true;){
                j = rn.nextInt(s.getFilas());
                k = rn.nextInt(s.getColumnas());                
                if(s.butacaLibre(j, k)){
                    e = new Espectador("espectador "+(i+1), rn.nextInt(70), rn.nextFloat()*200);
                    if(permitido(e)){
                        s.asignarButaca( e, j, k);
                        System.out.println("Persona "+(i+1)+" asignada a la butaca "+s.butacaIdentificacion(j, k));
                    }else{
                        if(e.getEdad() < p.getEdad_minima() && e.getDinero_disponible() < p.getPrecio()){
                            resultado = "no supera la edad minima y no tiene fondo suficiente";
                        }else if(e.getEdad() < p.getEdad_minima()){
                            resultado = "no supera la edad minima";
                        }else if(e.getDinero_disponible() < p.getPrecio()){
                            resultado = "no tiene fondo suficiente";
                        }else{
                            resultado = "ERROR";
                        }
                        System.out.println("Persona "+(i+1)+" no permitada por "+resultado);
                    }                    
                    break;
                }
            }
        }
    }
    
    public boolean permitido(Espectador e){
        if(e.getEdad() >= p.getEdad_minima() && e.getDinero_disponible() >= p.getPrecio()){
            e.setDinero_disponible(e.getDinero_disponible()-p.getPrecio());
            return true;
        }else{
            return false;
        }        
    }
}
