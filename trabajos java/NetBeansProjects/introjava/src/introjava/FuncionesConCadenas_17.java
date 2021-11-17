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
public class FuncionesConCadenas_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 17. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
        tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
        con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
        carácter tiene que ser X y el último tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran correctas, la
        secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
        secuencia distinta de FDE, que no respete el formato se considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
        correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
        se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String cadena;
        int contcorrecto = 0, contincorrecto = 0;
        
        do {
            System.out.println("Ingrese frase de maxima 5 caracteres de largo ");
            cadena = leer.next();
            
            if ((cadena.length() == 5) && ("x".equals(cadena.subSequence(0, 1)) == true) && ("o".equals(cadena.subSequence(4, 5)) == true)) {
            contcorrecto = contcorrecto +1;
        
            } else {
                contincorrecto = contincorrecto +1;
            }
            
            
        } while(cadena.equals("&&&&&") != true);
        
        System.out.println("Cantidad de cadenas RS232 ingresadas correctamente: " + contcorrecto);
        System.out.println("Cantidad de cadenas RS232 ingresadas incorrectamente: " + (contincorrecto -1));
    }
    
}
