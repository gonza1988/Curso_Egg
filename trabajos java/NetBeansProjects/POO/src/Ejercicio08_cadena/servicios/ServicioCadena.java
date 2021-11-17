/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio08_cadena.servicios;

import Ejercicio08_cadena.entidades.Cadena;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioCadena {

    public int mostrarVocales(Cadena frasex) {
        String frase;
        int cont = 0;
        frase = frasex.getFrase().toUpperCase().trim();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U') {
                cont++;
            }
        }

        return cont;
    }

    public String invertirFrase(Cadena frasex) {
        String frase = frasex.getFrase();

        StringBuilder strb = new StringBuilder(frase);
        frase = strb.reverse().toString();

        return frase;
    }

    public int vecesRepetido(Cadena frasex, String letra) {
        String frase = frasex.getFrase().toUpperCase().trim();
        letra = letra.toUpperCase();
        int cont = 0;

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == letra.charAt(0)) {
                cont++;
            }
        }

        return cont;
    }

    public void compararLongitud(Cadena frasex, String frase2) {

        if (frasex.getFrase().length() == frase2.length()) {

            System.out.println("La longitud de sus cadenas son iguales con " + frase2.length() + " caracteres");
        } else if (frasex.getFrase().length() < frase2.length()) {

            System.out.println("La frase 1 contiene " + frasex.getFrase().length() + " caracteres y es menor que la frase 2 con " + frase2.length() + " caracteres");
        } else {
            System.out.println("La frase 1 contiene " + frasex.getFrase().length() + " caracteres y es mayor que la frase 2 con " + frase2.length() + " caracteres");
        }

    }

    public String unirFrases(Cadena frasex, String frase2) {

        return frasex.getFrase().concat(" " + frase2);
    }

    public String reemplazar(Cadena frasex, String letra) {
        String frase = frasex.getFrase().toLowerCase().trim();

        frase = frase.replace("a", letra);

        return frase;
    }
    
    public boolean contiene(Cadena frasex, String letra){
        
       System.out.println("Su frase contiene la letra "+letra+" ?");
       return frasex.getFrase().contains(letra); 
            
    }
}
