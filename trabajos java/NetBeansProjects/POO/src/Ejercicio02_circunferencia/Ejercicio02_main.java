/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_circunferencia;

import Ejercicio02_circunferencia.entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio02_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
        de tipo real. A continuación, se deben crear los siguientes métodos:
        
        a) Método constructor que inicialice el radio pasado como parámetro.
        b) Métodos get y set para el atributo radio de la clase Circunferencia.
        c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
        del objeto.
        d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!2).
        e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio). */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Circunferencia c1 = new Circunferencia(0);
        
        System.out.println("Ingrese el radio de la circunferencia ");
        double radio = leer.nextInt();
        c1.CrearCircunferencia(radio);
        
        c1.setRadio(5);
        System.out.println("Metodo Get "+c1.getRadio());
        System.out.println("El area de la circunferencia es: "+c1.AreaCircunferencia());
        System.out.println("El perimetro de la circunferencia es: "+c1.PerimetroCircunferencia());
    }
    
}
