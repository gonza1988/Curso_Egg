/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio07_persona.servicios;

import Ejercicio07_persona.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final int IMC_BAJO = -1;
    private final int IMC_IDEAL = 0;
    private final int IMC_ALTO = 1;

    public Persona crearPersona() throws PersonaException {

        String nombre = "";
        int edad = 0;
        String sexo = "";
        double peso = 0;
        double altura = 0;

        System.out.println("Servicio Crear Nueva Persona ");

        do {
            System.out.println("Por favor Ingrese su nombre y apellido:");
            nombre = leer.next();

        } while (nombre.equals(""));

        do {

            System.out.println("Ingrese su edad: ");
            edad = leer.nextInt();
            if ((edad <= 0)) {
                System.out.println("Edad mal ingresada, reintente");
            }

        } while (edad <= 0);

        do {

            System.out.println("Ingrese su sexo: H(hombre, M(mujer) , O(otro) ");
            sexo = leer.next();
            sexo = sexo.toUpperCase();
            sexo = sexo.substring(0, 1);

            if (sexo.equals("H") == false && sexo.equals("M") == false && sexo.equals("O") == false) {
                System.out.println("Sexo ingresado erroneamente, Reintente:");
            }

        } while (sexo.equals("H") == false && sexo.equals("M") == false && sexo.equals("O") == false);

        do {

            System.out.println("Ingrese su peso: ");
            peso = leer.nextDouble();
            if ((peso <= 0)) {
                System.out.println("Peso mal ingresado, reintente");
            }

        } while (peso <= 0);

        do {

            System.out.println("Ingrese su altura: ");
            altura = leer.nextDouble();
            if ((altura <= 0 || altura > 3)) {
                System.out.println("Altura mal ingresada, reintente");
            }

        } while (altura <= 0 || altura > 3);

        return new Persona(nombre, edad, sexo, peso, altura);

    }

    public int calcularIMC(Persona personax) {
        double imc = 0;

        imc = personax.getPeso() / (Math.pow(personax.getAltura(), 2));
        if (imc < 20) {
            return IMC_BAJO;

        } else if (imc > 25) {
            return IMC_ALTO;
        } else {
            return IMC_IDEAL;
        }

    }

    public boolean mayorEdad(Persona personax) {
        //Si se da la condicion devuelve verdadero,sino falso
        boolean mayor = personax.getEdad() >= 18;
        //o la misma forma en una linea seria:
        // return personax.getEdad()>=18;

        /* if (personax.getEdad()>18) {
            mayor = true;
        }else{
            mayor = false;
        }*/
        return mayor;
    }

    public Persona[] crearPersonas(int cantidad) throws PersonaException {
        Persona[] personas = new Persona[cantidad];

        for (int i = 0; i < personas.length; i++) {
            personas[i] = crearPersona();
        }

        return personas;
    }

    public void porcentajePeso(Persona[] personas) {
        int contideal = 0;
        int contbajo = 0;
        int contalto = 0;

        //FOR EACH
        for (Persona persona : personas) {
            
       switch(calcularIMC(persona)){
                case -1:
                    contbajo++;
                    System.out.println(persona.getNombre()+" esta por debajo de su peso ideal! ");
                    break;
                case 0:
                    contideal++;
                    System.out.println(persona.getNombre()+" esta en su peso ideal! ");
                    break;
                case 1:
                    contalto++;
                    System.out.println(persona.getNombre()+" esta por encima de su peso ideal! ");
                    break;

            }
        }

        System.out.println("Porcentaje de personas con sobrepeso = " + (contalto * 100) / 4 + "%");
        System.out.println("Porcentaje de personas con peso ideal = " + (contideal * 100) / 4 + "%");
        System.out.println("Porcentaje de personas debajo del peso ideal = " + (contbajo * 100) / 4 + "%");
    }

    public void porcentajeMayor(Persona[] personas) {

        int contmayor = 0;
        int contmenor = 0;

        for (Persona persona : personas) {
            
            if (mayorEdad(persona) == true) {

                contmayor= contmayor+1;
                System.out.println(persona.getNombre()+" es mayor de edad!");
            } else {
                contmenor=contmenor+1;
                System.out.println(persona.getNombre()+" es menor de edad!");
            }
        }
        
        System.out.println("Porcentaje de personas mayor de edad "+(contmayor*100)/4+"%");
        System.out.println("Porcentaje de personas menores de edad "+(contmenor*100)/4+"%");
    }
}
