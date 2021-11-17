/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio06_tienda.servicios;

import Ejercicio06_tienda.entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioProducto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Producto> productos;

    public ServicioProducto() {
        this.productos = new HashMap();
    }

    private void crearProducto() {

        System.out.println("Ingrese nombre del producto a agregar:");
        String producto = leer.next().toUpperCase();

        while (producto.isEmpty()) {

            System.out.println("Producto vacio, reintente:");
            producto = leer.next().toUpperCase();
        }
        System.out.println("Ahora ingrese el valor del producto:");
        double precio = leer.nextDouble();

        while (precio == 0) {

            System.out.println("El precio ingresado no puede ser 0, reintente:");
            precio = leer.nextDouble();
        }

        productos.put(producto, new Producto(producto, precio));
    }

    private void mostrarProducto() {

        System.out.println("\nLos Productos actuales de la lista son: \n");

        for (Map.Entry<String, Producto> aux : productos.entrySet()) {
            String key = aux.getKey();
            Producto value = aux.getValue();

            System.out.println("LLave " + key + " Valor " + value);

        }
    }

    private void eliminarProducto() {
        int cont = 0;

        System.out.println("\n-----Servicio para eliminar Producto-----\n");
        System.out.println("Ingrese Producto a eliminar:");
        String eliminador = leer.next();

        for (Map.Entry<String, Producto> aux : productos.entrySet()) {
            String key = aux.getKey();
            Producto value = aux.getValue();

            if (aux.getKey().equalsIgnoreCase(eliminador)) {

                productos.remove(aux.getKey());
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

    private void modificarPrecio() {

        int cont = 0;
        double precio = 0;

        System.out.println("\n-----Servicio para Editar Producto-----\n");
        System.out.println("Ingrese Producto a cambiar precio:");
        String producto = leer.next();

        for (Map.Entry<String, Producto> aux : productos.entrySet()) {
            String key = aux.getKey();
            Producto value = aux.getValue();

            if (aux.getValue().getNombre().equalsIgnoreCase(producto)) {

                System.out.println("Producto encontrado: " + aux.getValue());
                System.out.println("Ahora ingrese el nuevo precio del Producto:");
                precio = leer.nextDouble();
                aux.getValue().setPrecio(precio);
                cont++;
            }
        }

        if (cont >= 1) {

            System.out.println("\nProducto editado correctamente\n");

        } else {
            System.out.println("\nNo se ha podido editar el Producto , por no encontrarse en la lista\n");
        }
    }

    private void mostrarMenu() {

        System.out.println("-------Menu------\n"
                + "\n----Almacen Gomensoro----\n\n"
                + "1 - Ingresar Producto \n"
                + "2 - Modificar Precio \n"
                + "3 - Eliminar Producto \n"
                + "4 - Lista de Productos \n"
                + "5 - Salir \n"
                + "---Elija una opcion---");

    }

    private int elegirOpcion() {

        int sel;

        do {
            sel = leer.nextInt();
            if (sel < 1 || sel > 5) {

                System.out.println("Seleccion invalida ,intente nuevamente: ");
            }

        } while (sel < 1 || sel > 5);

        return sel;
    }

    public void ejecutarMenu() {
        mostrarMenu();
        int sel;

        do {

            sel = elegirOpcion();
            switch (sel) {

                case 1:
                    crearProducto();
                    mostrarMenu();
                    break;
                case 2:
                    modificarPrecio();
                    mostrarMenu();
                    break;
                case 3:
                    eliminarProducto();
                    mostrarMenu();
                    break;
                case 4:
                   // ordenarLista();
                    mostrarProducto();
                    mostrarMenu();
                    break;
                case 5:
                    System.out.println("¡¡Saliendo del menu. Almacen Gomensoro le desea buena jornada!!");
            }

        } while (sel != 5);

    }

  /*  private void ordenarLista() {

        //HashSet<Integer> numerosSet = new HashSet();
        ArrayList<Producto> productoList = new ArrayList((Collection) productos);
        //Se convierte el HashSet a Lista
       
        Collections.sort(productoList);
    }*/
}
