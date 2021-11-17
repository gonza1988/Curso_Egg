/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class ValoresSocios_05extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        /* 5. Una obra social tiene tres clases de socios:
        o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
          descuento en todos los tipos de tratamientos.
        o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
          descuento para los mismos tratamientos que los socios del tipo A.
        o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
          dichos tratamientos.
        Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
        que represente el costo del tratamiento (previo al descuento) y determine el importe
        en efectivo a pagar por dicho socio. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        char socio;
        int costo;
        System.out.println("Ingrese el tipo de asociado. A,B o C: ");
        socio = (char)System.in.read();
        System.out.println("Y el costo del tratamiento: ");
        costo=leer.nextInt();
        
        System.out.println("Costo total del tratamiento: "+costo_total(socio,costo));
    }
    public static int costo_total(char socio, int costo){
        int costo_total=0;
        socio = Character.toLowerCase(socio);
        switch (socio) {
            case 'a':
                costo_total = costo - (costo*50)/100;
                break;
            case 'b':
                costo_total = costo - (costo*35)/100;
                break;
            case 'c':
                costo_total = costo;
                break;
            default:
                System.out.println("Socio mal ingresado ");
                break;
        }
        return costo_total;
    } 
}
