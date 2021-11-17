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
public class FuncionConvertidorEuros_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 21. Crea una aplicación que a través de una función nos convierta una cantidad de
        euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
        libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
        converir que será una cadena, este no devolverá ningún valor y mostrará un
        mensaje indicando el cambio (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 € */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        double cantidad, muestra;
        String moneda;
        
        System.out.println("Ingrese a que moneda desea convertir los euros");
        System.out.println("Libras, Dolares o Yenes");
        moneda = leer.next();
        System.out.println("Y ahora ingrese la cantidad de Euros a convertir");
        cantidad = leer.nextDouble();
        
       convertidor(moneda,cantidad);
        
    }
    
    public static void convertidor(String moneda, double cantidad){
        double convertido;
        
        moneda = moneda.toUpperCase();
        if(moneda.equals("LIBRAS") == true){
            convertido = cantidad / 0.86;
            System.out.println("Sus euros convertidos a Libras fueron: " + convertido);
        } else if(moneda.equals("DOLARES") == true){
            convertido = cantidad *1.18;
            System.out.println("Sus euros convertidos a Dolares fueron: " + convertido);
        }else if(moneda.equals("YENES") == true){
            convertido = cantidad *129.852;
            System.out.println("Sus euros convertidos a Yenes fueron: " + convertido);
        }
}
}
