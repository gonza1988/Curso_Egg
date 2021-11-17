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
public class EncuentraValorEnVector_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*23 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
        pida al usuario un numero a buscar en el vector. El programa mostrará donde se
        encuentra el numero y si se encuentra repetido */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int []vector;
        int tamaño,buscado;
        System.out.println("Ingrese tamaño del vector; ");
        tamaño = leer.nextInt();
        vector = new int[tamaño];
        System.out.println("Ahora ingrese el valor buscado del 1 al 10 en su vector");
        buscado = leer.nextInt();
        
        llenado_vector(vector);
        muestra_vector(vector);
        coordenada_vector(vector, buscado);
    }
    public static void llenado_vector(int vector[]){
        Random random = new Random();
        
        for (int i = 0; i < vector.length; i++) {
         
            vector[i] = random.nextInt(10);
                    }
    }
    
    public static void muestra_vector(int vector[]){
        
        for (int i = 0; i < vector.length; i++){
               System.out.print("[ " +vector[i]+ " ]");
        }
        System.out.println(" ");
        }
    
    public static void coordenada_vector(int vector[], int buscado){
        int contador_siesta = 0, contador_noesta=0;
        
        for (int i = 0; i < vector.length; i++){
            if(vector[i] == buscado){
                System.out.print("La posicion del valor buscado es: ["+i+"]" );
                System.out.println(" ");
                contador_siesta+= +1;
            } else {
                contador_noesta+=+1;
            }
        }
        if(contador_noesta>0 && contador_siesta<1){
            System.out.println("Valor no encontrado");
        }
    }
    }

