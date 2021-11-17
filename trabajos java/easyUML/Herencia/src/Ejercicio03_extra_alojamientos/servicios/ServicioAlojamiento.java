/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03_extra_alojamientos.servicios;

import Ejercicio03_extra_alojamientos.entidades.Alojamiento;
import Ejercicio03_extra_alojamientos.entidades.Camping;
import Ejercicio03_extra_alojamientos.entidades.Hotel;
import Ejercicio03_extra_alojamientos.entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioAlojamiento {
    
    Scanner leer;

    public ServicioAlojamiento() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void menu(ArrayList<Alojamiento> alojamientos) {
        int op = 0;
        do {
            System.out.println("\n\n\n");
            System.out.println("******   ALOJAMIENTOS   ******");
            System.out.println("* 1. Todos los Alojamientos  *");
            System.out.println("* 2. Hoteles por precio      *");
            System.out.println("* 3. Campings c/restorant    *");
            System.out.println("* 4. Residencias c/descuento *");
            System.out.println("* 5. Salir                   *");
            System.out.println("******************************");
            System.out.println("\nSelecciona una opcion");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    muestraTodo(alojamientos);
                    break;
                case 2:
                    hotelesPorPrecio(alojamientos);
                    break;
                case 3:
                    campingResto(alojamientos);
                    break;
                case 4:
                    residenciaDesc(alojamientos);
                    break;
                case 5:
                    System.out.println("CHAU!!!");
                    break;
                default:
                    System.out.println("Ingreso una opcion no valida");
            }

        } while (op != 5);
    }

    private void muestraTodo(ArrayList<Alojamiento> lista) {

        lista.forEach(aux -> {
            System.out.println(aux);
            
            //seria igual que:
            
           /* for (Alojamiento aux : lista) {
                System.out.println(aux);
            }*/
        });

    }

    private void hotelesPorPrecio(ArrayList<Alojamiento> lista) {

        ArrayList<Alojamiento> auxiliar = new ArrayList();

        lista.stream().filter(aux -> (aux instanceof Hotel)).forEachOrdered(aux -> {
            auxiliar.add(aux);
        }
        );

        ArrayList<Hotel> hoteles = new ArrayList(auxiliar);
        Collections.sort(hoteles, porPrecio);

        hoteles.forEach(aux -> {
            System.out.println(aux);
        });

    }

    public static Comparator<Hotel> porPrecio = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel h1, Hotel h2) {
            return Double.compare (h2.getPrecioHabitacion(),(h1.getPrecioHabitacion()));
        }
    };
    
    private void campingResto(ArrayList<Alojamiento> lista) {

        for (Alojamiento aux : lista) {
            if (aux instanceof Camping) {
                if (((Camping) aux).isTieneRestaurant()) {
                    System.out.println(aux);
                }
            }
        }
    }
    
    private void residenciaDesc (ArrayList<Alojamiento> lista) {
        for (Alojamiento aux : lista) {
            if (aux instanceof Residencia) {
                if (((Residencia) aux).isDescGremio()) {
                    System.out.println(aux);
                }
            }
        }
    }
    
}
