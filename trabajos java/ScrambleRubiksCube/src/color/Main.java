/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package color;

import javax.swing.JOptionPane;

/**
 *
 * @author claudia
 */
public class Main {

    public static void main(String[] args) {

        Color color = new Color();

        Resaltador res = new Resaltador();
        
        System.out.println("Este texto será de"+color.rojo()+" color rojo");
        System.out.println(color.azul()+"Este texto será de color azul");
        System.out.println(res.verde()+"Este texto será resaltado con color verde");
        System.out.println(res.amarillo()+"Este texto será resaltado con color amarillo");
    }
}
