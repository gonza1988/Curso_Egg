/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04_interfazGeometrica;

import Ejercicio04_interfazGeometrica.entidades.Circulo;
import Ejercicio04_interfazGeometrica.entidades.Rectangulo;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio04_interfazGeometricaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 4. Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
        de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
        calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
        llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
        perímetro y el valor de PI como constante.
        Desarrollar el ejercicio para que las formas implementen los métodos de la
        interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
        formas y se mostrará el resultado final.
        Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
        Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2. */
        
        Rectangulo r1 = new Rectangulo(2,5);
        Circulo c1 = new Circulo(5);
        
        System.out.println(c1.toString());
        System.out.println("El perimetro del Circulo es igual a: "+ c1.calcularPerimetro());
        System.out.println("El Area del Circulo es igual a: "+ c1.calcularArea());
        
        System.out.println(r1.toString());
        System.out.println("El perimetro del Rectangulo es igual a: "+ r1.calcularPerimetro());
        System.out.println("El Area del Rectangulo es igual a: "+ r1.calcularArea());
        
        
    }
    
}
