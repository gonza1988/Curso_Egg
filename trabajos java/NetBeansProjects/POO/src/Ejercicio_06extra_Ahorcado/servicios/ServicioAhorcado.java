/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_06extra_Ahorcado.servicios;

import Ejercicio_06extra_Ahorcado.entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        int tamaño = 0, vidas = 0;
        String palabra = "";

        do {
            System.out.println("¡Jugador 1, ingrese la palabra a adivinar!:");
            palabra = leer.next().toUpperCase();

        } while (palabra.equals(""));

        System.out.println("Ahora ingrese la cantidad de intentos: ");
        vidas = leer.nextInt();


        while (vidas < 1 || vidas == 0) {
            System.out.println("Vidas en 0, ingrese cantidad de intentos validos: ");
            vidas = leer.nextInt();
        }

        Character palabraVector[] = new Character[palabra.length()];
        Character letrasGuiones[] = new Character[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {

            palabraVector[i] = palabra.charAt(i);
            letrasGuiones[i] = '_';
        }

        return new Ahorcado(palabraVector, letrasGuiones, 0, vidas);
    }

    private int mostrarLongitud(Ahorcado juego) {

        return juego.getPalabra().length;
    }

    private void mostrarRelleno(Ahorcado juego) {

        for (int i = 0; i < juego.getLetrasGuiones().length; i++) {

            System.out.print("[" + juego.getLetrasGuiones()[i] + "]");
        }
    }

    public void jugar() {

        Ahorcado A1 = crearJuego();
        System.out.println("");
        System.out.println("\n\n\n-------Juego Ahorcado------\n\n");

        do{
               
        System.out.println("\n Longitud de la palabra: " + mostrarLongitud(A1));
        //buscar(A1);
        //encontradas(A1);
        intentos(A1);
        
        if(Arrays.equals(A1.getPalabra(), A1.getLetrasGuiones())){
            System.out.println("\n¡¡¡Felicitaciones, has completado el juego!!!");
        }else if (A1.getVidas()==0){
            System.out.println("\n¡Te has quedado sin vidas!");
        }
        
        }while(!Arrays.equals(A1.getPalabra(), A1.getLetrasGuiones()) && A1.getVidas()>0);
        

    }

    private Character buscar(Ahorcado juego) {
        Character letraIntroducida;
        int cont = 0;

        System.out.println("Ingrese letra a buscar: ");
        letraIntroducida = leer.next().charAt(0);
        letraIntroducida = Character.toUpperCase(letraIntroducida);

        for (int i = 0; i < juego.getPalabra().length; i++) {

            if (juego.getPalabra()[i].equals(letraIntroducida)) {

                System.out.println("Su letra ("+letraIntroducida+") ha sido encontrada en la posicion " + (i + 1));
                cont++;
            }
        }

        if (cont >= 1) {
            System.out.println("¡Vas por buen camino. A seguir esforzandose!");

        } else {
            System.out.println("¡La letra introducida ("+letraIntroducida+") no se encuentra en la palabra. Se te descontara una vida!");

        }
        
        return letraIntroducida;
        
    }

    private boolean encontradas(Ahorcado juego) {
        boolean bandera = true;
        int cont = 0;

        Character letraIntroducida = buscar(juego);

        for (int i = 0; i < juego.getPalabra().length; i++) {
            if (juego.getPalabra()[i].equals(letraIntroducida)) {

                
                juego.getLetrasGuiones()[i]=letraIntroducida;
                cont++;
            }
        }
        if (cont >= 1) {

            bandera = true;
        } else {
            bandera = false;
        }
        mostrarRelleno(juego);
        

        return bandera;
    }

    private int intentos(Ahorcado juego) {

        boolean encontrada = encontradas(juego);
        if (encontrada == true) {

            System.out.println("");
            System.out.println("Cantidad de Oportunidades restantes " + juego.getVidas());
        } else {
            juego.setVidas(juego.getVidas()-1);
            System.out.println("");
            System.out.println("Cantidad de Oportunidades restantes " + juego.getVidas());
        }

        return juego.getVidas();

    }

    /*public void mostrarVector(Ahorcado juego) {

        for (int i = 0; i < juego.getPalabra().length; i++) {

            System.out.print("[" + juego.getPalabra()[i] + "]");
        }
        for (int i = 0; i < juego.getLetrasGuiones().length; i++) {

            System.out.println("");
            System.out.print("[" + juego.getLetrasGuiones()[i] + "]");
        }
    }*/
}
