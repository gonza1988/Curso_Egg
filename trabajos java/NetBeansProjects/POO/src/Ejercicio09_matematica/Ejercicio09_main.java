/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio09_matematica;

import Ejercicio09_matematica.entidades.Matematica;
import Ejercicio09_matematica.servicios.ServicioMatematica;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio09_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 9. Realizar una clase llamada Matemática que tenga como atributos dos números reales
        con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
        un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
        usará el Math.random para generar los dos números y se guardaran en el objeto con
        su respectivos set. Deberá además implementar los siguientes métodos:
        • Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
        valor
        • Método calcularPotencia() para calcular la potencia del mayor valor de la clase
        elevado al menor número. Previamente se deben redondear ambos valores.
        • Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
        Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Matematica operacion1 = new Matematica();
        ServicioMatematica sm = new ServicioMatematica();
        double num1 = (Math.random() * 10);
        double num2 = (Math.random() * 10);
        operacion1.setNum1(num1);
        operacion1.setNum2(num2);
        
        System.out.println(operacion1.toString());
        
        System.out.println("El mayor de los dos numeros es: "+sm.devolverMayor(operacion1));
        System.out.println("La potencia del mayor numero por el menor,redondeados es:  "+sm.calcularPotencia(operacion1));
        System.out.println("La raiz cuadrada del valor absoluto del menor de los numeroes es:  "+sm.calcularRaiz(operacion1));

    }
    
}
