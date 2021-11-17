/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01_perro.servicios;

import Ejercicio01_perro.entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioPerro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Perro>perros;
    
    public ServicioPerro() {
        this.perros = new ArrayList();
    }
    
    public void crearPerro(){
        
        String respuesta = "";
         do {

            System.out.println("Ingrese la raza del perro"); // Pedimos los datos del objeto
            String raza = leer.next();
            
            //Perro p1 = new Perro(raza);
            //perros.add(p1);
            //la misma forma mas directa
            perros.add(new Perro(raza));

            System.out.println("Quiere ingresar otro perro ?"); // Y preguntamos si quiere ingresar otro alumno 
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("si"));
         
    }
    
    public void mostrarPerro(){
        
        System.out.println("Las razas de perros actuales de la lista son: ");
        
        for (Perro aux: perros ){
            
            System.out.println(aux.toString());
        }
        
        System.out.println("Cantidad lista:"+perros.size());
    }
    
    public void eliminarPerro(){
        Iterator<Perro> it = perros.iterator();
        
        System.out.println("Ingrese raza del perro a eliminar:");
        String eliminador = leer.next();
        
        while (it.hasNext()) {
            Perro aux = it.next();
            if (aux.getRaza().equals(eliminador)) {
                it.remove();
                System.out.println("Perro eliminado correctamente");
            }else{
                System.out.println("No se ha podido eliminar el perro , por no encontrarse en la lista");
            }
            
        }
        System.out.println("Lista de perros ordenadas de forma ascendente: ");
        perros.sort(Perro.compararRazasAscendente);
    }
}
