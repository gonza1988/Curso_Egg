/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05_paises.servicios;

import Ejercicio05_paises.entidades.Pais;
import java.util.Iterator;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioPais {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private TreeSet<Pais> paises;

    public ServicioPais() {
        this.paises = new TreeSet();
    }

    public void CrearPais() {

        String respuesta = "";
        do {

            System.out.println("Ingrese nuevo Pais a la lista:"); // Pedimos los datos del objeto
            String nombreP = leer.next();

            //Perro p1 = new Perro(raza);
            //perros.add(p1);
            //la misma forma mas directa
            paises.add(new Pais(nombreP));

            System.out.println("Quiere ingresar otro Pais ?"); // Y preguntamos si quiere ingresar otro alumno 
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("si"));

    }

    public void mostrarPais() {

        System.out.println("\nLos paises actuales de la lista son: \n");

        for (Pais aux : paises) {

            System.out.println(aux.toString());
        }

        System.out.println("Cantidad lista:" + paises.size());
    }

    public void eliminarPais() {
        Iterator<Pais> it = paises.iterator();
        int cont = 0;

        System.out.println("\n-----Servicio para eliminar Pais-----\n");
        System.out.println("Ingrese Pais a eliminar:");
        String eliminador = leer.next();

        while (it.hasNext()) {
            Pais aux = it.next();
            cont++;
            if (aux.getNombre().equalsIgnoreCase(eliminador)) {
                it.remove();
            }
        }

        if (cont >= 1) {

            System.out.println("\nPais eliminado correctamente\n");

        } else {
            System.out.println("\nNo se ha podido eliminar el Pais , por no encontrarse en la lista\n");
        }
        mostrarPais();
    }
}
