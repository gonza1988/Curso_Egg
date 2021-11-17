/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploProfe;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class EjemploProfeMain_C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExcepcionPropia {
        crearPersona();

    }

    public static void crearPersona() {
        try {
            ingresarDatos();
        } catch (ExcepcionPropia | InputMismatchException ex) { // Recordar que en el mismo bloque puedo concatenar cosas

            System.out.println(ex.getMessage());
            crearPersona();
        }
    }

    public static void ingresarDatos() throws ExcepcionPropia, InputMismatchException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese su nombre");
        String nombreI = leer.next();
        if (nombreI.length() < 2) {
            throw new ExcepcionPropia(" No ingreso un nombre valido - Vas a tener q reingresar el dato ");
        }
        System.out.println("Ingrese su edad");
        byte edadI = leer.nextByte();
        if (edadI < 0) {
            throw new ExcepcionPropia(" Como vas a tener menos que 0 años.....");
        }
        System.out.println("LOS DATOS INGRESADIS SON: "
                + "\n Nombre: " + nombreI.toUpperCase()
                + "\n Edad: " + edadI);
    }
}
// Mi Clase Exception Creada

