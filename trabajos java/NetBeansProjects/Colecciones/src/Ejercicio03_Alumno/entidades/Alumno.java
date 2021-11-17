/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03_Alumno.entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class Alumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String nombre;
    private ArrayList<Integer> notas;

    public Alumno() {

        notas = new ArrayList();

    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

    public void recorrerAlumnos(ArrayList<Alumno> alumnoLista) {

        for (Alumno aux : alumnoLista) {
            System.out.println(aux);
        }
        System.out.println("Cantidad lista:" + alumnoLista.size());
    }

    public void notaFinal(ArrayList<Alumno> alumnoLista) {

        double promedio = 0;
        System.out.println("Ingrese el nombre del alumno a calcular su nota final: ");
        String alumno = leer.next().toUpperCase();
        int cont = 0;

        for (Alumno aux : alumnoLista) {
            
            if (aux.getNombre().equalsIgnoreCase(alumno)) {
                cont ++;

                for (int i = 0; i < aux.getNotas().size(); i++) {
                    promedio = promedio + aux.getNotas().get(i);
                }
            }  
        }
        
        if (cont == 0) {
            System.out.println("No se ha encontrado el alumno buscado");
        }else {
            System.out.println("El promedio del alumno es igual a:" + ((double)promedio / 3));
        }
    }
}
