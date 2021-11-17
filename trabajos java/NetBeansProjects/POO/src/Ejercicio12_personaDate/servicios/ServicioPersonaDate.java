/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12_personaDate.servicios;


import Ejercicio12_personaDate.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */

public class ServicioPersonaDate {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        String nombre;
        int dia,mes,anio;
        
        System.out.println("Ingrese su nombre y apellido: ");
        nombre = leer.next();
        System.out.println("Ahora ingrese su dia ,mes y año de nacimiento: ");
        dia = leer.nextInt();
        mes = leer.nextInt()-1;
        anio = leer.nextInt()-1900;
        
        Date fechaNac= new Date(anio, mes, dia);  // Creamos el objeto tipo Date
        
        
        return new Persona(nombre,fechaNac);
        
    }
    
    public int calcularEdad(Persona persona1){
        int edad;
        
        Date fechaActual = new Date();
        
        edad = fechaActual.getYear() - persona1.getFechaNac().getYear();
        
        
        return edad;
    }
    
    public boolean menorQue(Persona persona1, int edad){
        boolean verificaEdad;
        
        if (calcularEdad(persona1)>= edad) {
            
            verificaEdad = false;
        }else{
            verificaEdad = true;
        }
        return verificaEdad;
    }
    
    public void mostrarPersona(Persona persona1){
        
        System.out.println("Nombre: "+persona1.getNombre() );
        System.out.println("Fecha de nacimiento:");
        System.out.println("Dia: "+(persona1.getFechaNac().getDay()+12));
        System.out.println("Mes: "+(persona1.getFechaNac().getMonth()+1));
        System.out.println("Año: "+(persona1.getFechaNac().getYear()+1900));
    }
}
