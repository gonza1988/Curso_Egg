/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import static introjava.EncuentraValorEnVector_23.coordenada_vector;
import static introjava.EncuentraValorEnVector_23.muestra_vector;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class ContadorDigitosVector_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 24-Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
        cuántos de 2 dígitos, etcétera (hasta 5 dígitos).  */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String []vector2;
        int []vector;
        int tamaño;
        System.out.println("Ingrese tamaño del vector; ");
        tamaño = leer.nextInt();
        vector = new int[tamaño];
        
        llenado_vector(vector, tamaño);
        
 
    }
    public static void llenado_vector(int vector[], int tamaño){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String[] vector2 = new String[tamaño];
        for (int i = 0; i < vector.length; i++) {
         
            System.out.println("Ingrese valores al vector");
            vector[i] = leer.nextInt();
            vector2[i] = Integer.toString(vector[i]);
                    }
    
        for (int i = 0; i < vector2.length; i++){
               System.out.print("Vector ["+i+"]: " +vector2[i]+ ": Tiene " +vector2[i].length() + " digitos");
               System.out.println("");
        }
        System.out.println(" ");
        }
    }
    

