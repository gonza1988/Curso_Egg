/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03_barajaCartas.servicios;

import Ejercicio03_barajaCartas.entidades.Baraja;
import Ejercicio03_barajaCartas.entidades.Carta;
import Ejercicio03_barajaCartas.enumeraciones.Palo;
import Ejercicio03_barajaCartas.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioBaraja {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
   // private Baraja mazoCartas = new Baraja();
    ArrayList<Carta> descarte = new ArrayList();

    public Baraja crearMazo() {

        System.out.println("\n*** CREAR MAZO ***\n");
        ArrayList<Carta> mazoBaraja = new ArrayList();
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {

                mazoBaraja.add(new Carta(i, Palo.BASTO));
                mazoBaraja.add(new Carta(i, Palo.COPA));
                mazoBaraja.add(new Carta(i, Palo.ESPADA));
                mazoBaraja.add(new Carta(i, Palo.ORO));
            }
        }
        return new Baraja(mazoBaraja);
    }

    public void barajar(Baraja mazo) {

        System.out.println("\n*** BARAJAR ***\n");
        Collections.shuffle(mazo.getListaCartas());
        mostrarBaraja(mazo);

    }

    public void mostrarBaraja(Baraja mazo) {

        System.out.println("\n*** MOSTRAR BARAJA ***\n");
        for (Carta unitario : mazo.getListaCartas()) {
            System.out.println(unitario.toString()); // Como deje previsto mi toString en clase entidad... imprime el objeto con todos sus atributos
        }
    }

    public void siguienteCarta(Baraja mazo) {
        

        System.out.println("\n*** SIGUIENTE CARTA ***\n");

        for (int i = 0; i < mazo.getListaCartas().size(); i++) {

            if (mazo.getListaCartas().isEmpty()) {

                System.out.println("No hay cartas suficientes!");
            } else {

                System.out.println(mazo.getListaCartas().get(i));
                descarte.add(mazo.getListaCartas().get(i));
                mazo.getListaCartas().remove(i);
                break;
            }

        }
    }

    public void cartasDisponibles(Baraja mazo) {

        System.out.println("\n*** CARTAS DISPONIBLES ***\n");
        System.out.println(mazo.getListaCartas().size());
    }

    public void darCartas(Baraja mazo) {

        System.out.println("\nIngrese el numero de cartas a repartir\n");
        int numCartas = leer.nextInt();

        for (int i = 0; i < numCartas; i++) {

            siguienteCarta(mazo);

        }
    }

    public void cartasMonton() {

        System.out.println("\n*** CARTAS MONTON ***\n");
        for (Carta unitario : descarte) {
            if (descarte.isEmpty()) {

                System.out.println("El mazo descarte se encuentra vacio");
            } else {

                System.out.println(unitario.toString());
            }
        }
    }

}
