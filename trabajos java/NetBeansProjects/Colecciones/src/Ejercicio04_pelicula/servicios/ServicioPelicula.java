/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04_pelicula.servicios;

import Ejercicio04_pelicula.entidades.Pelicula;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioPelicula {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pelicula>listaPeliculas;
    
    public ServicioPelicula(){
        this.listaPeliculas = new ArrayList();
    }
    
    public void CrearPelicula(){
        
        String respuesta = "";
         do {

            System.out.println("Ingrese el titulo de la pelicula"); // Pedimos los datos del objeto
            String titulo = leer.next().toUpperCase();
            System.out.println("Ahora ingrese el director de la pelicula:");
            String director = leer.next().toUpperCase();
            System.out.println("Para finalizar ingrese la duracion de la pelicula:");
            double duracion = leer.nextDouble();
            //Perro p1 = new Perro(raza);
            //perros.add(p1);
            //la misma forma mas directa
            listaPeliculas.add(new Pelicula(titulo,director,duracion));

            System.out.println("Quiere ingresar otra pelicula?"); // Y preguntamos si quiere ingresar otro alumno 
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("si"));
         
    }
    
     public void mostrarPelicula(){
        
        System.out.println("Peliculas: ");
        
        for (Pelicula aux: listaPeliculas ){
            
            System.out.println(aux.toString());
        }
        
        System.out.println("Cantidad lista:"+listaPeliculas.size());
    }
     
     public void ordenarPelicula(){
         
         System.out.println("-------PELICULA ORDEN ASCENDENTE(DURACION)--------\n");
         listaPeliculas.sort(Pelicula.compararDuracionAscendente);
         mostrarPelicula();
         System.out.println("-------PELICULA ORDEN DESCENDENTE(DURACION)--------\n");
         listaPeliculas.sort(Pelicula.compararDuracionDescendente);
         mostrarPelicula();
         System.out.println("-------PELICULA ORDEN ASCENDENTE(TITULO)--------\n");
         listaPeliculas.sort(Pelicula.compararTituloAscendente);
         mostrarPelicula();
         System.out.println("-------PELICULA ORDEN ASCENDENTE(DIRECTOR)--------\n");
         listaPeliculas.sort(Pelicula.compararDirectorAscendente);
         mostrarPelicula();
         duracionMayor(listaPeliculas);
     }
     
     public void duracionMayor(ArrayList<Pelicula>listaPeliculas){
         
         System.out.println("\nPeliculas con duracion mayor a 1 hora: \n");
         for (Pelicula aux: listaPeliculas) {
             
             if (aux.getDuracion()>1) {
                 
                 System.out.println(aux.toString());
             }
         }
         
     }
     
    }

