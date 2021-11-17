package scramblerubikscube;

import color.*;
import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws AWTException {

        Scramble objScramble = new Scramble();
        Cubo cubo = new Cubo();
        ScrambleServicio service = new ScrambleServicio();
        Color color = new Color();
        Resaltador resaltador = new Resaltador();

        List<String> listaVacia = new ArrayList<>();

        cubo.crearCaras(); //inicializa la matriz que contiene los colores

        String respuesta = "";

        while (!respuesta.equals("6")) {
            //MENU
            System.out.println(resaltador.rojo() + "CUBO DE RUBIK" + resaltador.reset());
            System.out.println(resaltador.verde() + "Menú" + resaltador.reset());
            System.out.println(color.rojo() + "  1." + color.reset() + " Resolver cubo con mezcla aleatoria");
            System.out.println(color.rojo() + "  2." + color.reset() + " Girar el cubo resuelto");
            System.out.println(color.rojo() + "  3." + color.reset() + " Ingresar mezcla personalizada");
            System.out.println(color.rojo() + "  4." + color.reset() + " Ver notación válida");
            System.out.println(color.rojo() + "  5." + color.reset() + " Reiniciar pantalla (por si se buguea el menú)");
            System.out.println(color.rojo() + "  6." + color.reset() + " Salir");
            System.out.println("Ingrese una opción");
            respuesta = service.scan.next();

            switch (respuesta) {
                case "1":
                    cubo.robotCleaner();//limpia la pantalla
                    cubo.instruccion(objScramble.getListaScramble(), 3);//Dibuja un scramble aleatorio
                    cubo.robotCleaner();
                    break;
                case "2":
                    cubo.robotCleaner();
                    cubo.crearCaras();//reinicia el cubo
                    cubo.instruccion(listaVacia, 2);//Dibuja un cubo sin cambios
                    cubo.robotCleaner();
                    break;
                case "3":
                    cubo.robotCleaner();
                    cubo.crearCaras();//reinicia el cubo
                    cubo.instruccion(service.ingresarScramble(), 1);//Dibuja el scramble ingresado
                    cubo.robotCleaner();
                    break;
                case "4":
                    mostrarNotacion();
                    break;
                case "5":
                    cubo.robotCleaner();
                    break;
                case "6":
                    break;
                default:
                    cubo.robotCleaner();
                    System.out.println(color.rojo() + "ERROR: " + color.reset() + "El valor ingresado no corresponde a las opciones listadas");
                    break;
            }
        }
    }

    public static void mostrarNotacion() throws AWTException {
        Color color = new Color();
        Resaltador resaltador = new Resaltador();
        ScrambleServicio service = new ScrambleServicio();
        Cubo cubo = new Cubo();

        cubo.robotCleaner();
        System.out.println(resaltador.verde() + "NOTACIÓN:" + resaltador.reset());
        System.out.println("La notación convencional utiliza letras para representar "
                + "los\ngiros del cubo. Si estas letras están acompañadas del "
                + "\nsímbolo  \"" + color.rojo() + "'" + color.reset() + "\", "
                + "están describiendo un giro en sentido antihorario \nde la capa"
                + " que representan, pero si éste no aparece, el giro es\nhorario."
                + " Las letras son:\n");
        System.out.println(color.rojo() + "  U" + color.reset() + ": Up (capa de arriba)");
        System.out.println(color.rojo() + "  D" + color.reset() + ": Down (capa de abajo)");
        System.out.println(color.rojo() + "  R" + color.reset() + ": Right (capa a la derecha)");
        System.out.println(color.rojo() + "  L" + color.reset() + ": Left (capa a la izquierda)");
        System.out.println(color.rojo() + "  F" + color.reset() + ": Front (capa al frente)");
        System.out.println(color.rojo() + "  B" + color.reset() + ": Back (capa de atrás)");

        System.out.println("");
        System.out.println("También podés ingresar la capa seguida de un \"2\" "
                + "para girar \nesa capa dos veces");
        System.out.println("");
        System.out.println(color.violeta() + "Ejemplo:"+color.reset()+" U moverá la capa que se "
                + "encuentra arriba en sentido\nhorario mientras que U' lo hará "
                + "en sentido antihorario");
        System.out.println("");
        System.out.println("Ingrese cualquier caracter para volver al menú");
        service.scan.next();
        cubo.robotCleaner();
    }
}
