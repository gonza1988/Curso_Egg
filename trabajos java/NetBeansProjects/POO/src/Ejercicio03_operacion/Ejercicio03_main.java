/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03_operacion;

import Ejercicio03_operacion.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio03_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y
        numero2. A continuación, se deben crear los siguientes métodos:

        a) Método constructor con todos los atributos pasados por parámetro.
        b) Metodo constructor sin los atributos pasados por parámetro.
        c) Métodos get y set.
        d) Método para crearOperacion(): que le pide al usuario los dos números y los
        guarda en los atributos del objeto.
        e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
        f) Método restar(): calcular la resta de los números y devolver el resultado al main
        g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
        si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
        error. Si no, se hace la multiplicación y se devuelve el resultado al main
        h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
        pasar una división por cero, el método devuelve 0 y se le informa al usuario el
        error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
        al main */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Operacion op1 = new Operacion();
        Operacion op2 = new Operacion();
      
        System.out.println("Ingrese numero uno a operar: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese numero uno a operar: ");
        int num2 = leer.nextInt();
        
        op1.CrearOperacion(num1,num2);
        System.out.println("Operacion 1");
        System.out.println("Numero uno : "+op1.getNum1());
        System.out.println("Numero dos : "+op1.getNum2());
        System.out.println("La suma de los valores es igual a: "+op1.sumar());
        System.out.println("La resta de los valores es igual a: "+op1.restar());
        System.out.println("La multiplicacion de los valores es igual a: "+op1.multiplicar());
        System.out.println("La division de los valores es igual a: "+op1.dividir());
        
        op2.setNum1(0);
        op2.setNum2(10);
        System.out.println("Operacion 2");
        System.out.println("La suma de los valores es igual a: "+op2.sumar());
        System.out.println("La resta de los valores es igual a: "+op2.restar());
        System.out.println("La multiplicacion de los valores es igual a: "+op2.multiplicar());
        System.out.println("La division de los valores es igual a: "+op2.dividir());
        
    }
    
}
