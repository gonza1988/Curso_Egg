/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_extra_cantanteFamoso.servicios;

import Ejercicio02_extra_cantanteFamoso.entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioCantanteFamoso {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<CantanteFamoso> cantantes;

    public ServicioCantanteFamoso() {
        this.cantantes = new ArrayList();
    }

    private void crearCantantes() {

        cantantes.add(new CantanteFamoso("Fall Out Boy", "Save Rock and Roll"));
        cantantes.add(new CantanteFamoso("30 Seconds To Mars", "A Beautiful Lie"));
        cantantes.add(new CantanteFamoso("Panic At The Disco!", "Pray For The Wicked"));
        cantantes.add(new CantanteFamoso("Starset", "Divisions"));
        cantantes.add(new CantanteFamoso("Gobblin", "Gobblin Ost"));

        System.out.print("\nEsta es la lista con los Cantantes que copan el Ranking mundial\n\n");

        for (CantanteFamoso aux : cantantes) {
            System.out.print(aux.toString() + "\n");
        }
    }
    
    private void agregarCantante(){
        
        System.out.println("Ingrese Cantante a agregar al Ranking: ");
        String cantante = leer.next();
        System.out.println("Ahora ingrese su disco mas vendido: ");
        String disco = leer.next();
        
        cantantes.add(new CantanteFamoso(cantante, disco));
        
    }
    
    private void mostrarCantante() {

       for (CantanteFamoso aux : cantantes) {
            System.out.print(aux.toString() + "\n");
        }
    }

    private void eliminarCantante() {
        int cont = 0;

        System.out.println("\n-----Servicio para eliminar Cantante de la lista-----\n");
        System.out.println("Ingrese Cantante a eliminar:");
        String eliminador = leer.next();

        for (CantanteFamoso aux : cantantes) {

            if (aux.getNombre().equalsIgnoreCase(eliminador)) {

                cantantes.remove(aux);
                cont++;
                break;
            }
        }

        if (cont >= 1) {

            System.out.println("\nProducto eliminado correctamente\n");

        } else {
            System.out.println("\nNo se ha podido eliminar el Producto , por no encontrarse en la lista\n");
        }
    }
    
    private void mostrarMenu(){
         
         System.out.println("-------Menu------\n"
                 +"\n----Cantantes Famosos----\n\n"
                 +"1 - Agregar Cantante \n"
                 +"2 - Eliminar Cantante \n"
                 +"3 - Lista de Cantantes \n"
                 +"4 - Salir \n"
                 +"---Elija una opcion---");
         
     }
     
     private int elegirOpcion(){
         
         int sel;
         
         do{
             sel = leer.nextInt();
             if (sel < 1 || sel > 4) {
                 
                 System.out.println("Seleccion invalida ,intente nuevamente: ");
             }
             
         } while(sel < 1 || sel > 4);
         
         return sel;
     }
     
     public void ejecutarMenu(){
         crearCantantes();
         mostrarMenu();
         int sel;
         
         do{
             
             sel = elegirOpcion();
             switch(sel){
                 
                 case 1:
                     agregarCantante();
                     mostrarMenu();
                     break;
                 case 2:
                     eliminarCantante();
                     mostrarMenu();
                     break;
                 case 3:
                     mostrarCantante();
                     mostrarMenu();
                     break;
                 case 4:
                     System.out.println("Saliendo del menu Cantantes");
             }
             
         }while(sel !=4);
         
     }
}