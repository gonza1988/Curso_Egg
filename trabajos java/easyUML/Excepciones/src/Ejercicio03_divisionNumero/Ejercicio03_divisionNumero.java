/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03_divisionNumero;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio03_divisionNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*3. Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
        para leer dos números en forma de cadena. A continuación, utilice el método
        parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en
        dos variables de tipo int. Por ultimo realizar una división con los dos numeros y
        mostrar el resultado.
        Todas estas operaciones puede tirar excepciones a manejar, el ingreso por
        teclado puede causar una excepción de tipo InputMismatchException, el método
        Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
        NumberFormatException y además, al dividir un número por cero surge una
        ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
        try/catch para las distintas excepciones */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String numCadena1 = null, numCadena2 = null;
        int num1 = 0, num2 = 0;
        double division = 0;

        try {

            System.out.println("Ingrese 1er numero a dividir: ");
            numCadena1 = leer.next();
            System.out.println("Ingrese 2do numero a dividir: ");
            numCadena2 = leer.next();
            num1 = Integer.parseInt(numCadena1);
            num2 = Integer.parseInt(numCadena2);
            division = num1 / num2;
            System.out.println("Restulado = " + division);

        } catch (InputMismatchException e) {
            System.out.println(e.toString());
            System.out.println("Excepcion 1: Error tipo de ingreso ");

        } catch (NumberFormatException e) {
            System.out.println(e.toString());
            System.out.println("Excepcion 2: La cadena ingresada no puede convertirse a entero ");

        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("Excepcion 3: No puede dividirse un numero por 0 ");

        } finally {

            System.out.println("Bloque finally: De todas maneras finaliza");
        }
    }

}
