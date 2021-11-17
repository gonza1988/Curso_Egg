/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploProfe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class EjemploProfeMain_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        leerArchivo();
        
    }    

    public static void leerArchivo() throws FileNotFoundException, IOException {
        File archivo = new File("C:\\Users\\adrib\\Desktop\\PROBANDO.txt");
        Scanner leer = new Scanner(archivo);
        leer.useDelimiter("\\Z");
        System.out.println(leer.next());
        System.out.println("FIN PROGRAMA");
    }
}

