/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class MatrizTranspuesta_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*25- Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
         muestre traspuesta. ¿Que es una matriz traspuesta? */
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
         int [][] matriz = new int[4][4];
         
         llenado_matriz(matriz);
         muestra_matriz(matriz);
         matriz_transpuesta(matriz);
         
    }
     public static void llenado_matriz(int[][] matriz){
      Random random = new Random();
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j<matriz.length; j++){
               matriz[i][j] = random.nextInt(20); 
            }
        }
      
     }
     
    public static void muestra_matriz(int[][] matriz){
        
        System.out.println("Subproceso Muestra Matriz Original: ");
      for (int i = 0; i < matriz.length; i++){
          for (int j = 0; j<matriz.length; j++){
              System.out.print("[ " +matriz[i][j]+ " ]");
          }
            System.out.println(""); 
      }
      System.out.println(" ");
      }
    
    public static void matriz_transpuesta(int[][] matriz){
        
        System.out.println("Subproceso Matriz Transpuesta: ");
      for (int i = 0; i < matriz.length; i++){
          for (int j = 0; j<matriz.length; j++){
              System.out.print("[ " +matriz[j][i]+ " ]");
          }
            System.out.println(""); 
      }
      System.out.println(" ");
}
}