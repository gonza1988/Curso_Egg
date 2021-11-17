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
public class ArreglosAprobadosDesaprobados_20extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 20. Los profesores del curso de programación de Egg necesitan llevar un registro de
        las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
        aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
        notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de
        cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
        del programa los profesores necesitan obtener por pantalla la cantidad de
        aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
        con promedio mayor o igual al 7 de sus notas del curso. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int alumnos = 10, notas = 4;
        double[] vector = new double[alumnos];
        double promedio = 0, tp1 = 0, tp2 = 0, primer_integrador = 0, segundo_integrador = 0;

        for (int i = 0; i < alumnos; i++) {
            System.out.println("\nAlumno :"+(i+1));
            System.out.println("Ingrese nota Primer trabajo práctico evaluativo: ");
            tp1 = leer.nextInt();
            System.out.println("Ingrese nota Segundo trabajo práctico evaluativo: ");
            tp2 = leer.nextInt();
            System.out.println("Ingrese nota Primer Integrador: ");
            primer_integrador = leer.nextInt();
            System.out.println("Ingrese nota Segundo Integrador: ");
            segundo_integrador = leer.nextInt();

            promedio = ((tp1 / 100) * 10) + ((tp2 / 100) * 15) + ((primer_integrador / 100) * 25) + ((segundo_integrador / 100) * 50);
            vector[i] = promedio;
            System.out.print("[ " + vector[i] + " ]");
        }
        System.out.println("");

        aprobados_desaprobados(vector);
    }

    public static void aprobados_desaprobados(double[] vector) {
        int aprobados=0,desaprobados=0;   
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]<7) {
                desaprobados ++;
                
            }else{
                aprobados++;
            }
        }
        System.out.println("Cantidad de alumnos aprobados: "+aprobados);
        System.out.println("Cantidad de alumnos desaprobados: "+desaprobados);
    }
}
