/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_Array;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio02_ArrayMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 2. Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
        código para generar y capturar una excepción ArrayIndexOutOfBoundsException
        (índice de arreglo fuera de rango).*/
        
         int[] myVector = new int[5];

        try {
            for (int i = 0; i < 7; i++) {
                myVector[i] = (int) (Math.random() * 8 + 1);
                System.out.print("["+myVector[i]+"] ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice de arreglo fuera de rango");
        }
        
        System.out.println("Fin");
    }
    
}
