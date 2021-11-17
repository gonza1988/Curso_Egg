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
public class CambiaValoresVariables_02extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
        cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
        valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
        Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
        variable auxiliar */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int A = 1, B= 2, C=3,D=4,aux=0;
        
        System.out.println("A= "+A+" B= "+B+" C= "+C+" D= "+D);
        cambia_valores(A,B,C,D,aux);
        
    }
    public static void cambia_valores(int A,int B,int C,int D,int aux){
        
        aux = B;
        B=C;
        C=aux;
        aux=D;
        D=C;
        C=A;
        A=aux;
      
        
        System.out.println("A= "+A+" B= "+B+" C= "+C+" D= "+D);
        
    }
}
