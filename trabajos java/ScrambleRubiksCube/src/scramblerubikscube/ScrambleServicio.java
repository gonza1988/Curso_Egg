/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scramblerubikscube;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author claudia
 */
public class ScrambleServicio {

    public Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public void CrearScramble(Scramble scr) {

        for (int i = 0; i < 21; i++) {

            int randomNormal = (int) (Math.random() * 6) + 1;
            int randomPrimo = (int) (Math.random() * 6) + 1;
            int randomDoble = (int) (Math.random() * 6) + 1;
            int randomTotal = (int) (Math.random() * 3) + 1;
            int j = 0;

            if (randomTotal == 1) {
                scr.addToLista(randomNormal + " ");
            } else {
                if (randomTotal == 2) {
                    scr.addToLista(randomPrimo + "' ");
                } else {
                    if (randomTotal == 3) {
                        scr.addToLista(randomDoble + "doble ");
                    }
                }
            }

            if (i > 0) {
                j = 0;
                if ((scr.getFromLista(i).substring(j, j + 1).equals(scr.getFromLista(i - 1).substring(j, j + 1)))) {
                    scr.removeFromLista(i);
                    i--;
                }
            }
        }
    }//crea una mezcla aleatoria

    public String transformarScramble(Scramble scr) {
        return scr.getListaScramble().toString().replace("1", "R").
                replace("2", "L").replace("3", "U").replace("4", "D").
                replace("5", "F").replace("6", "B").replace("doble", "2").
                replace("[", "").replace("]", "").replace(", ", "");
    }//transforma las mezclas aleatorias a la notación estandar

    public void imprimirScramble(Scramble scr, String opcion) {
        if (opcion.equals("j")) {//cuadro de texto externo
            JOptionPane.showMessageDialog(null, "Scramble: \n\n" + transformarScramble(scr));
        }
        if (opcion.equals("s")) {//output del IDE
            System.out.println("Scramble: " + transformarScramble(scr));
        }

    } //imprime la mezcla

    public List<String> ingresarScramble() {
        List<String> myScramble = new ArrayList<>();

        System.out.println("Ingrese su scramble usando la notación estándar");
        String almacenar = scan.next().toUpperCase();

        int cont = 1;
        
        for (int i = 0; i < almacenar.length(); i++) {
            if (almacenar.substring(i,i+1).equals(" ")) {
                cont++;
            }
        }
        
        for (int i = 0; i < cont; i++) {
            myScramble.add(almacenar.split(" ")[i]);
        }
        return myScramble;
    }//permite ingresar una mezcla que quieras
}
