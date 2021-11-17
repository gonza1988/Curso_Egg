/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio06_cafetera.servicios;

import Ejercicio06_cafetera.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioCafetera {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void Menu(Cafetera usuario) {

        double calculoTaza=0;
        double tamañoTaza = 0;
        double agregaCafe = 0;
        int opcion = 0;
        String confirma = " ";

        do {
            System.out.println("****** Menu ****** \n");
            System.out.println("1.Llenar cafetera");
            System.out.println("2.Servir taza");
            System.out.println("3.Vaciar cafetera");
            System.out.println("4.Agregar cafe");
            System.out.println("5.Salir \n");
            System.out.println("Elija una opcion");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    //System.out.println(usuario.toString());
                    System.out.println("\n");
                    System.out.println("¡Cafetera llena!");
                    usuario.setCantidadActual(usuario.getCapacidadMaxima());
                    System.out.println(usuario.toString());
                    break;

                case 2:
                    System.out.println("\n");
                    System.out.println("Servir taza:");
                    System.out.println("Ingrese el tamaño de la taza a llenar: ");
                    tamañoTaza = leer.nextDouble();
                    
                    if (tamañoTaza <= usuario.getCantidadActual()) {
                        usuario.setCantidadActual(usuario.getCantidadActual()-tamañoTaza);
                        System.out.println("Taza de cafe llena");
                    }else{
                        
                        calculoTaza = tamañoTaza - usuario.getCantidadActual();
                        System.out.println("Su taza ha no se ha podido llenar por completo.");
                        System.out.println("A su taza de "+tamañoTaza+" lts. Le falto llenar un "+calculoTaza+" lts.de cafe");
                        usuario.setCantidadActual(0);
                    }
                    System.out.println(usuario.toString());
                    break;

                case 3:
                    System.out.println("\n");
                    System.out.println("¡Cafetera vacia!");
                    usuario.setCantidadActual(0);
                    System.out.println(usuario.toString());
                    break;

                case 4:
                    System.out.println("\n");
                    System.out.println("Agregar Cafe:");
                    System.out.println("Ingrese cantidad de cafe a agregar: ");
                    agregaCafe = leer.nextDouble();

                    if (agregaCafe + usuario.getCantidadActual() < usuario.getCapacidadMaxima()) {
                        usuario.setCantidadActual(usuario.getCantidadActual() + agregaCafe);
                    } else if (agregaCafe + usuario.getCantidadActual() >= usuario.getCapacidadMaxima()) {
                        usuario.setCantidadActual(usuario.getCapacidadMaxima());
                        System.out.println("¡Ya ha llenado la cafetera por completo!");
                    }
                    System.out.println(usuario.toString());
                    break;

                case 5:
                    if (opcion == 5) {
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        confirma = leer.next();
                    }
                    if (confirma.equals("s") == true) {
                        break;
                    } else {
                        opcion = 0;
                    }
            }

        } while (opcion != 5);
    }

}
