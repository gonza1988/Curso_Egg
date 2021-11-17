/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_extra_edificio;

import Ejercicio02_extra_edificio.entidades.Edificio;
import Ejercicio02_extra_edificio.entidades.EdificioOficina;
import Ejercicio02_extra_edificio.entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio02_extra_edificioMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 2. Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y
        largo. La clase edificio tendrá como métodos:
        • Método calcularSuperficie(): calcula la superficie del edificio.
        • Método calcularVolumen(): calcula el volumen del edifico.
        Estos métodos serán abstractos y los implementarán las siguientes clases:
        • Clase Polideportivo con su nombre y tipo de instalación que puede ser
        Techado o Abierto, esta clase implementará los dos métodos abstractos y los
        atributos del padre.
        • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
        personas por oficina y numero de pisos. Esta clase implementará los dos
        métodos abstractos y los atributos del padre.
        De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
        edificio, el usuario dirá cuantas personas entran en cada oficina, cuantas
        oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
        Crear el método cantPersonas(), que muestre cuantas personas entrarían en
        un piso y cuantas en todo el edificio.
        Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe
        contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array
        y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se
        deberá mostrar la superficie y el volumen de cada edificio.
        Además de esto, para la clase Polideportivo nos interesa saber cuantos
        polideportivos son techados y cuantos abiertos. Y para la clase EdificioDeOficinas
        deberemos llamar al método cantPersonas() y mostrar los resultados de cada
        edificio de oficinas. */
        int cuentaPoli = 0, cuentaOfi = 0;

        Polideportivo p1 = new Polideportivo("Cedrys", true, 20, 5, 30);
        Polideportivo p2 = new Polideportivo("LaMatanza", false, 10, 3, 20);

        EdificioOficina eo1 = new EdificioOficina(7, 4, 4, 10, 40, 20);
        EdificioOficina eo2 = new EdificioOficina(10, 6, 6, 20, 60, 15);

        ArrayList<Edificio> listaEdificio = new ArrayList();
        listaEdificio.add(p1);
        listaEdificio.add(p2);
        listaEdificio.add(eo1);
        listaEdificio.add(eo2);

        for (Edificio aux : listaEdificio) {

            if (aux instanceof Polideportivo) {
                System.out.println(aux);
                System.out.println("Superficie " + aux.calcularSuperficie() + " mts2");
                System.out.println("Volumen " + aux.calcularVolumen() + " mts3");
                cuentaPoli++;
            } else if (aux instanceof EdificioOficina) {
                System.out.println(aux);
                System.out.println("Superficie " + aux.calcularSuperficie() + " mts2");
                System.out.println("Volumen " + aux.calcularVolumen() + " mts3");
                cuentaOfi++;
                ((EdificioOficina) aux).cantPersonas();
            }
        }
        System.out.println("Cantidad de Polideportivos " + cuentaPoli);
        System.out.println("Cantidad de Edificios de Oficina " + cuentaOfi);
    }

}
