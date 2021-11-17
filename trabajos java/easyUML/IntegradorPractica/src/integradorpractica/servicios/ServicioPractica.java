/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorpractica.servicios;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioPractica {

    public boolean compruebaNumero(int num) {
        boolean comprueba = false;
        int cont = 0;

        if (num > 0) {
            cont++;
        }
        if (num % 2 == 0) {
            cont++;

        }
        if (num % 3 == 0) {
            cont++;
        }

        if (cont == 3) {
            comprueba = true;
        }
        return comprueba;
    }

    public String cadena(String palabra) {

        palabra = palabra.toUpperCase();

        if (palabra.contains("HOLA MUNDO")) {
            palabra = palabra.replace('O', '$');
        }

        System.out.println("Cantidad de letras de su cadena " + palabra.length());
        return palabra;
    }

    //class Examen {
    public boolean parCieloPiso(int numEnt, double numReal, long numLargo) {

        boolean resultado = false;
        if (numEnt % 2 == 0 && Math.round(numReal) == Math.floor(numReal) && numLargo >= 0) {
            resultado = true;
        }

        return resultado;
    }

    public String geringoso(String palabra) {
        // Acá escribí la lógica necesaria
        palabra = palabra.toLowerCase();

        palabra = palabra.replaceAll("a", "apa").replaceAll("e", "epe").replaceAll("i", "ipi").replaceAll("o", "opo").replaceAll("u", "upu");

        return palabra;
    }

    public String inversa(String palabra) {
        // Acá escribí la lógica necesaria
        palabra = palabra.toLowerCase();
        String invertida = "";
        
        for (int i = 0; i < palabra.length(); i++) {

            invertida = palabra.charAt(i) + invertida;

        }

        return invertida;
    }
}
