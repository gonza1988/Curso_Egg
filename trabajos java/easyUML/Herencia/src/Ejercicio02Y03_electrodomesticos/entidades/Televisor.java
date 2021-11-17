/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02Y03_electrodomesticos.entidades;

import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class Televisor extends Electrodomestico{
    
     private int resolucionPulg;
    private boolean sintTDT;

    public Televisor() {
    super();
    }
    

    public Televisor(int resolucionPulg, boolean sintTDT, String color, char consumoEnergetico, double peso) {
        super(color, consumoEnergetico, peso);
        this.resolucionPulg = resolucionPulg;
        this.sintTDT = sintTDT;
    }

    
    public int getResolucionPulg() {
        return resolucionPulg;
    }

    public void setResolucionPulg(int resolucionPulg) {
        this.resolucionPulg = resolucionPulg;
    }

    public boolean isSintTDT() {
        return sintTDT;
    }

    public void setSintTDT(boolean sintTDT) {
        this.sintTDT = sintTDT;
    }

    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("TELEVISOR: Cuantas Pulgadas?");
        this.resolucionPulg = leer.nextInt();
        System.out.println("Tiene Sintonizador TDT incorporado? S/N");
        char sele = leer.next().toUpperCase().charAt(0);

        switch (sele)
        {
            case 'S':
                this.sintTDT = true;
                break;
            case 'N':
                this.sintTDT = false;
                break;
            default:
                System.out.println("Opcion no valida, por defecto se crea sin sintonizador");
                this.sintTDT = false;
        }
        super.creaElectrodomestico();
        
    }

    @Override
    public double precioFinal() {
        super.precioFinal();

        if (this.resolucionPulg > 40)
        {
            super.precio = (super.precio + (super.precio * 0.30));
        }

        if (this.sintTDT)
        {
            super.precio = (super.precio + 500);
        }
        
        return super.precio;

    }

    @Override
    public String toString() {
        String sintoniza = "NO posee";
        if (this.sintTDT)
        {
            sintoniza = "SI posee";
        }

        return "Televisor de " + resolucionPulg + " pulgadas, TDT: " + sintoniza + "\n"
                + super.toString();
    }
    
}
