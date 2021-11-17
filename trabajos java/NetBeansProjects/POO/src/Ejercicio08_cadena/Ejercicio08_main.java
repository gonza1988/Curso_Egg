/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio08_cadena;

import Ejercicio08_cadena.entidades.Cadena;
import Ejercicio08_cadena.servicios.ServicioCadena;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio08_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
        String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
        una frase que puede ser una palabra o varias palabras separadas por un espacio en
        blanco y a través de los métodos set, se guardará la frase y la longitud de manera
        automática según la longitud de la frase ingresada. Deberá además implementar los
        siguientes métodos:
        • Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
        frase ingresada.
        • Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
        por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
        • Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
        ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
        frase, por ejemplo:
        Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
        • Método compararLongitud(String frase), deberá comparar la longitud de la frase
        que compone la clase con otra nueva frase ingresada por el usuario.
        • Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
        con una nueva frase ingresada por el usuario y mostrar la frase resultante.
        • Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
        encuentren en la frase, por algún otro carácter seleccionado por el usuario y
        mostrar la frase resultante.
        • Método contiene(String letra), deberá comprobar si la frase contiene una letra que
        ingresa el usuario y devuelve verdadero si la contiene y falso si no. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String letra = "";
        String frase2="";
        
        
        Cadena cadena1 = new Cadena();
        ServicioCadena sc = new ServicioCadena();
        
        System.out.println("Ingrese una frase con o sin espacios: ");
        cadena1.setFrase(leer.next());
        
        System.out.println(cadena1.toString());
        System.out.println("Cantidad de vocales de su frase: "+sc.mostrarVocales(cadena1));
        System.out.println("Su frase invertida es: "+sc.invertirFrase(cadena1));
        
        System.out.println("Ingrese la letra a ser buscada en su frase: ");
        letra = leer.next();
        System.out.println("El caracter buscado se repite: "+sc.vecesRepetido(cadena1,letra)+" veces");
        System.out.println("Ahora ingrese una nueva frase a comparar su LONGITUD y a CONCATENAR: ");
        frase2 = leer.next();
        sc.compararLongitud(cadena1,frase2);
        System.out.println("Frase uno concatenada a frase 2 = "+sc.unirFrases(cadena1,frase2));
        
        System.out.println("Ahora ingrese la letra para reemplazar las letras "+"*a*"+ " de la frase: ");
        letra = leer.next();
        System.out.println("Su frase 1 cambiada de letras es igual a : "+sc.reemplazar(cadena1,letra));
        
        System.out.println("Ingrese letra a buscar en su frase 1: ");
        letra = leer.next();
        System.out.println(sc.contiene(cadena1,letra));
        
        
    }
    
}
