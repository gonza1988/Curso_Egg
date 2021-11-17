/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03_extra_alojamientos.entidades;

import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class AlojamientoExtraHotelero extends Alojamiento{
    
    protected boolean privado;
    protected Integer cantMetros;

    public AlojamientoExtraHotelero() {
        super();
    }
    
    public AlojamientoExtraHotelero(boolean privado, Integer cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantMetros = cantMetros;
    }

    public void crearAlojamientoExtra() {
        super.creaAlojamiento();
        System.out.println("ESTABLECIMIENTO EXTRAHOTELERO");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Es un establecimiento Privado? S/N");
        char op = leer.next().toUpperCase().charAt(0);
        if (op == 'S') {
            this.privado = true;
        } else if (op == 'N') {
            this.privado = false;
        } else {
            System.out.println("Ingreso una opcion no validad se tomara por defecto que es privado");
            this.privado = true;
        }

        System.out.println("Cuantas Metros cuadrados tiene?");
        this.cantMetros = leer.nextInt();

    }

    @Override
    public String toString() {
        String priv = "Publico";
        if(privado){
            priv = "Privado";
        }
        System.out.println(super.toString());
        return "Establecimiento Extra Hotel de tipo " + priv + " con " + cantMetros + " mts2";
    }

}
