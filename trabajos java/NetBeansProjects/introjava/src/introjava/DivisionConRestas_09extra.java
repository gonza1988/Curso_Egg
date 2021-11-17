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
public class DivisionConRestas_09extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*9. Simular la división usando solamente restas. Dados dos números enteros mayores
        que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
        restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
        que el divisor, este resultado es el residuo, y el número de restas realizadas es el
        cociente. Por ejemplo: 50 / 13:
        50 – 13 = 37 una resta realizada
        37 – 13 = 24 dos restas realizadas
        24 – 13 = 11 tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3 */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int num1, num2;
        System.out.println("Ingrese numeros mayores a 1 a dividir: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        if (num1 > 1 && num2 > 1) {

            division_conrestas(num1, num2);
        } else {
            System.out.println("Numeros mal ingresados");
        }

    }

    public static void division_conrestas(int num1, int num2) {
        int residuo = num1, contador = 0;

        while (residuo > num2) {
            residuo = residuo - num2;
            contador++;
        }
        System.out.println("Cociente= " + contador);
        System.out.println("Residuo= " + residuo);
    }
}
