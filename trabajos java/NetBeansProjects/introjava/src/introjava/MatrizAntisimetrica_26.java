/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class MatrizAntisimetrica_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*26- Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
        que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
        cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
        una matriz A se denota por A T y se obtiene cambiando sus filas por columnas (o
        viceversa). */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int [][]matriz;
        int fil,col;
        boolean respuesta = true;
        System.out.println("Ingrese tamaño de la matriz: Filas y columnas ");
        fil = leer.nextInt();
        col = leer.nextInt();
        matriz = new int[fil][col];
        
        llenado_matriz(matriz, fil, col);
        muestra_matriz(matriz, fil, col);
        matriz_transpuesta(matriz);
        matriz_antisimetrica(matriz, fil, col);
        
 
    }
    public static void llenado_matriz(int[][] matriz, int fil, int col){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
        for(int i = 0; i < fil; i++) {
            for(int j = 0; j<col; j++){
                
            System.out.println("Ingrese valores a la matriz");
            matriz[i][j] = leer.nextInt();
                    }
        }
    }
    
    public static void muestra_matriz(int[][] matriz, int fil, int col){
        
        System.out.println("Subproceso Muestra Matriz Original: ");
      for (int i = 0; i <fil; i++){
          for (int j = 0; j<col; j++){
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
    
     public static void matriz_antisimetrica(int[][] matriz, int fil, int col){
        boolean es_antisimetrica;
           
         for(int i = 0; i < fil; i++) {
            for(int j = 0; j<col; j++){
                if(i!=j){
                    if (matriz[i][j] != matriz[j][i]*-1){
                     es_antisimetrica = false;
                     System.out.println("Su matriz NO es antisimetrica ");
                     break;
                    } else {
                      es_antisimetrica = true;
                        System.out.println("Su matriz SI es antisimetrica ");
                        break;
                           }
                       }
                   }
            break;
            }
     }
       
}     

