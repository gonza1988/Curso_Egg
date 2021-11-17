/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio07_ejemplo;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio07A_ejemploMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //

        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println(
            "Excepcion en metodo() ") ;
e.printStackTrace();
        }
    }
    
    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("42");
            valor = valor + 1;
            System.out.println("Valor final del try:" + valor);
        } catch (NumberFormatException e) {

            valor = valor + Integer.parseInt("42");
            System.out.println("Valor final del catch:" + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }
}

