/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.menu;

import excepcion.MiExcepcion;
import java.util.InputMismatchException;
import java.util.Scanner;
import tienda.servicios.ServicioFabricante;
import tienda.servicios.ServicioProducto;

/**
 *
 * @author Gonza Cozzo
 */
public class Menu {

    private Scanner leer;
    private ServicioFabricante servFab;
    private ServicioProducto servProd;

    public Menu() {
        // ISO-8859-1 PERMITE USAR CARACTERES ESPECIALES
        leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        servFab = new ServicioFabricante();
        servProd = new ServicioProducto();
    }

    public void menuPrincipal() {
        int opcion = 0;
        
        do {
            try {
                System.out.println("*********  MENU PRINCIPAL  *********");
                System.out.println("* 1.- Mostrar Fabricantes          *");
                System.out.println("* 2.- Administracion de Fabricantes*");
                System.out.println("* 3.- Mostrar Productos            *");
                System.out.println("* 4.- Mostrar Productos Por Nombre *");
                System.out.println("* 5.- Mostrar Productos Rango 120 y 202");
                System.out.println("* 6.- Mostrar Productos Portatil   *");
                System.out.println("* 7.- Mostrar Producto Mas Barato  *");
                System.out.println("* 8.- Administracion de Productos  *");
                System.out.println("* 9.- Salir                        *");
                System.out.println("************************************");
        
            opcion = leer.nextInt();
                                
                switch (opcion) {
                    case 1:
                        servFab.muestraFabricante();
                        break;
                    case 2:
                        menuFabricante();
                        break;
                    case 3:
                        servProd.muestraProducto();
                        break;
                    case 4:
                        servProd.muestraProductoNombre();
                        break;
                    case 5:
                        servProd.muestraProductoEntreRango();
                        break;
                    case 6:
                        servProd.muestraProductoPortatil();
                        break;  
                    case 7:
                        servProd.muestraProductoMasBarato();
                        break;        
                    case 8:
                        menuProducto();
                        break;
                    case 9:
                        System.out.println("CHAU!!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                leer.next();
            } catch (MiExcepcion e) {
                System.out.println(e.getMessage());
            }
        } while (opcion != 9);

    }

    public void menuFabricante() {
        int op = 0;
        
        do {
            try {
        System.out.println("***** MENU FABRICANTES *****");
        System.out.println("* 1.- Nuevo Fabricante     *");
        System.out.println("* 2.- Modificar Fabricante *");
        System.out.println("* 3.- Borrar Fabricante    *");
        System.out.println("* 4.- Volver               *");
        op = leer.nextInt();
        switch (op) {
                    case 1:
                        crearFabricante();
                        break;
                    case 2:
                        modificarFabricante();
                        break;
                    case 3:
                        eliminarFabricante();
                        break;
                    case 4:
                        System.out.println("- VOLVER AL MENU PRINCIPAL -");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                leer.next();
            }
        } while (op != 4);
    }

    public void menuProducto() {
        int op = 0;
        do {
            try {
        System.out.println("***** MENU PRODUCTOS *****");
        System.out.println("* 1.- Nuevo Producto     *");
        System.out.println("* 2.- Modificar Producto *");
        System.out.println("* 3.- Borrar un Producto *");
        System.out.println("* 4.- Volver             *");
        op = leer.nextInt();
        switch (op) {
                    case 1:
                        crearProducto();
                        break;
                    case 2:
                        modificarProducto();
                        break;
                    case 3:
                        eliminarProducto();
                        break;
                    case 4:
                        System.out.println("- VOLVER AL MENU PRINCIPAL -");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                leer.next();
            }
        } while (op != 4);
    }

    // CRUD FABRICANTE
    public void crearFabricante() {
        try {
            System.out.println("INGRESE CODIGO: ");
            int codigo = leer.nextInt();

            System.out.println("INGRESE NOMBRE: ");
            String nombre = leer.next();

            servFab.crearFabricante(codigo, nombre);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

    public void modificarFabricante() {
        try {
            System.out.println("INGRESE CODIGO: ");
            int codigo = leer.nextInt();

            System.out.println("INGRESE NOMBRE: ");
            String nombre = leer.next();

            servFab.modificarFabricante(codigo, nombre);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarFabricante() {
        try {
            System.out.println("INGRESE CODIGO DE FABRICANTE: ");
            int codigo = leer.nextInt();

            servFab.eliminarFabricante(codigo);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

    // CRUD PRODUCTO
    public void crearProducto() { //Integer codigo, String nombre, Double precio, Integer cod_fab
        try {
            System.out.println("INGRESE CODIGO: ");
            int codigo = leer.nextInt();
            
            
            
            System.out.println("INGRESE NOMBRE: ");
            String nombre = leer.next();

            System.out.println("INGRESE PRECIO: ");
            double precio = leer.nextDouble();

            System.out.println("INGRESE CODIGO DE FABRICANTE: ");
            int cod_fab = leer.nextInt();

            servProd.crearProducto(codigo, nombre, precio, cod_fab);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

    public void modificarProducto() {
        try {
            System.out.println("INGRESE CODIGO: ");
            int codigo = leer.nextInt();

            System.out.println("INGRESE NOMBRE: ");
            String nombre = leer.next();

            System.out.println("INGRESE PRECIO: ");
            double precio = leer.nextDouble();

            System.out.println("INGRESE CODIGO DE FABRICANTE: ");
            int cod_fab = leer.nextInt();

            servProd.modificarProducto(codigo, nombre, precio, cod_fab);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarProducto() {
        try {
            System.out.println("INGRESE CODIGO DE PRODUCTO: ");
            int codigo = leer.nextInt();

            servProd.eliminarProducto(codigo);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

}