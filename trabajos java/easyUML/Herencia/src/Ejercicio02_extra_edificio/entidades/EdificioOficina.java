/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_extra_edificio.entidades;

/**
 *
 * @author Gonza Cozzo
 */
public class EdificioOficina extends Edificio{
    
    private int cantPersonasPorOficina;
    private int nroOficinas;
    private int nroPisos;

    public EdificioOficina() {
        
        super();
    }

    public EdificioOficina(int cantPersonasPorOficina, int nroOficinas, int nroPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.cantPersonasPorOficina = cantPersonasPorOficina;
        this.nroOficinas = nroOficinas;
        this.nroPisos = nroPisos;
    }

    
    
    
    @Override
    public double calcularSuperficie() {
        
        return super.ancho * super.largo;
    }

    @Override
    public double calcularVolumen() {
        
        return super.ancho * super.largo * super.alto;
       
    }
    
    public void cantPersonas(){
        
        System.out.println("Numero de personas en un piso: "+this.cantPersonasPorOficina * this.nroOficinas);
        System.out.println("Numero de personas en el Edificio: "+ (this.cantPersonasPorOficina * this.nroOficinas) * this.nroPisos);
    }

    @Override
    public String toString() {
        return "EdificioOficina{" + "cantPersonasPorOficina=" + cantPersonasPorOficina + ", nroOficinas=" + nroOficinas + ", nroPisos=" + nroPisos + '}';
    }
    
    
    
}
