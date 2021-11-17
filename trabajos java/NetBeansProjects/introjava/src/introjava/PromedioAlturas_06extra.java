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
public class PromedioAlturas_06extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Leer la altura de N personas y determinar el promedio de estaturas que se
        encuentran por debajo de 1.60 mts. y el promedio de estaturas en general. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        double[] vector;
        int cantidad;
        System.out.println("Por favor ingrese la cantidad de personas a evaluar: ");
        cantidad = leer.nextInt();
        vector = new double [cantidad];
        
        llenado_personas(vector);
        muestra_personas(vector);
        System.out.println("El promedio general de las personas Ingresadas es: "+promedio_general(vector));
         System.out.println("El promedio de las personas MENORES A 1.60 MTS es: "+promedio_bajos(vector));
        
    }
    public static void llenado_personas(double[]vector){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double altura = 0;
        
        System.out.println("Subproceso Llenado Vector de Personas: ");
        for(int i = 0; i < vector.length; i++) {
                System.out.println("Ingrese la altura de las persoanas: ");
                altura = leer.nextDouble();
                   vector[i] = altura;     
                       }
            }
    
    public static void muestra_personas(double[] vector){
        
        System.out.println("Subproceso Muestra Vector de Personas: ");
      for (int i = 0; i < vector.length; i++){
              System.out.print("[ " +vector[i]+ " ]");
          }
            System.out.println(""); 
      }
   
    public static double promedio_general(double[]vector){
        double promedio_general=0;
        
        for (int i = 0; i < vector.length; i++){
            promedio_general += vector[i];
        }
        promedio_general= promedio_general/vector.length;
        return promedio_general;
    }
    
    public static double promedio_bajos(double[] vector){
        double promedio_bajos=0;
        int contador_bajos=0;
        
        for (int i = 0; i < vector.length; i++){
            if(vector[i]<1.60){
           
            promedio_bajos += vector[i];
            contador_bajos += +1;
            }
            
        }
        promedio_bajos= promedio_bajos/contador_bajos;
        return promedio_bajos;
    }
   }

