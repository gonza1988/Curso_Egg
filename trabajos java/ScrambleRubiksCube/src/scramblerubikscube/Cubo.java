/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scramblerubikscube;

import color.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

/**
 *
 * @author claudia
 */
public class Cubo {

    ScrambleServicio service = new ScrambleServicio();

    Scramble scramble = new Scramble();

    private String[][] matriz;

    public Cubo() {
        matriz = new String[9][12];
    } //instancia la matriz que contiene al cubo

    public void crearCaras() {
        Resaltador resaltador = new Resaltador();

        //espacios vacios
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = "  ";
            }
        }

        //blancos
        int cont = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 6; j++) {
                matriz[i][j] = resaltador.blanco() + "__" + resaltador.reset();
                cont++;
            }
        }
        cont = 1;
        //amarillo
        for (int i = 6; i < 9; i++) {
            for (int j = 3; j < 6; j++) {
                matriz[i][j] = resaltador.amarillo() + "__" + resaltador.reset();
                cont++;
            }
        }

        //naranja
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = resaltador.violeta() + "__" + resaltador.reset();
            }
        }

        cont = 1;
        //verde
        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                matriz[i][j] = resaltador.verde() + "__" + resaltador.reset();
                cont++;
            }
        }

        //rojo
        for (int i = 3; i < 6; i++) {
            for (int j = 6; j < 9; j++) {
                matriz[i][j] = resaltador.rojo() + "__" + resaltador.reset();
            }
        }
        cont = 1;
        //azul
        for (int i = 3; i < 6; i++) {
            for (int j = 9; j < 12; j++) {
                matriz[i][j] = resaltador.azul() + "__" + resaltador.reset();
                cont++;
            }
        }
    } //rellena los espacios de la matriz que necesito

    public void imprimirCubo() {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 12; j++) {

                if (j == 11) {
                    System.out.println(matriz[i][j]);
                } else {
                    if (j == 2 || j == 5 || j == 8) {
                        System.out.print(matriz[i][j] + " ");
                    } else {
                        System.out.print(matriz[i][j] + "");
                    }

                }
            }
        }
    } //imprime el cubo

    public void U() {
        String[][] nuevaMatriz = new String[3][3];
        String[] matrizAux = new String[3];

        //transforma la matriz a una fácil de usar por sus indices
        int contI = 2, contJ = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 6; j++) {
                if (contJ != 3) {
                    nuevaMatriz[contJ][contI] = matriz[i][j];
                    contJ++;
                }
            }
            contJ = 0;
            contI--;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j + 3] = nuevaMatriz[i][j];
            }
        }

        //permutando las capas aledañas
        for (int i = 0; i < 3; i++) {
            matrizAux[i] = matriz[3][i];
            matriz[3][i] = matriz[3][i + 3];
            matriz[3][i + 3] = matriz[3][i + 6];
            matriz[3][i + 6] = matriz[3][i + 9];
            matriz[3][i + 9] = matrizAux[i];
        }
    }

    public void UPrima() {
        U();
        U();
        U();
    }

    public void D() {
        String[][] nuevaMatriz = new String[3][3];
        String[] matrizAux = new String[3];

        //transforma la matriz a una fácil de usar por sus indices
        int contI = 2, contJ = 0;
        for (int i = 6; i < 9; i++) {
            for (int j = 3; j < 6; j++) {
                if (contJ != 3) {
                    nuevaMatriz[contJ][contI] = matriz[i][j];
                    contJ++;
                }
            }
            contJ = 0;
            contI--;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i + 6][j + 3] = nuevaMatriz[i][j];
            }
        }

        //permutando las capas aledañas
        for (int i = 0; i < 3; i++) {
            matrizAux[i] = matriz[5][i]; //guardo violeta
            matriz[5][i] = matriz[5][i + 9]; //violeta trasformado a azul
            matriz[5][i + 9] = matriz[5][i + 6]; //azul transformado a rojo
            matriz[5][i + 6] = matriz[5][i + 3]; //rojo transformado a verde
            matriz[5][i + 3] = matrizAux[i]; // verde transformado a violeta
        }
    }

    public void DPrima() {
        D();
        D();
        D();
    }

    public void R() {
        String[][] nuevaMatriz = new String[3][3];
        String[] matrizAux = new String[3];
        String[] matrizAuxB = new String[3];

        //transforma la matriz a una fácil de usar por sus indices
        int contI = 2, contJ = 0;
        for (int i = 3; i < 6; i++) {
            for (int j = 6; j < 9; j++) {
                if (contJ != 3) {
                    nuevaMatriz[contJ][contI] = matriz[i][j];
                    contJ++;
                }
            }
            contJ = 0;
            contI--;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i + 3][j + 6] = nuevaMatriz[i][j];
            }
        }

        int j = 0;
        for (int i = 2; i >= 0; i--) {
            matrizAux[j] = matriz[i][5];//guardo blanco
            matrizAuxB[j] = matriz[i + 3][9];//guardo azul
            j++;
        }

        //permutando las capas aledañas
        for (int i = 2; i >= 0; i--) {
            matriz[i][5] = matriz[i + 3][5];//blanco a verde
            matriz[i + 3][5] = matriz[i + 6][5];//verde a amarillo
            matriz[i + 6][5] = matrizAuxB[i];//amarillo a azul
            matriz[i + 3][9] = matrizAux[i];//azul a blanco
        }
    }

    public void RPrima() {
        R();
        R();
        R();
    }

    public void L() {
        String[][] nuevaMatriz = new String[3][3];
        String[] matrizAux = new String[3];
        String[] matrizAuxB = new String[3];
        String[] matrizAuxC = new String[3];

        //transforma la matriz a una fácil de usar por sus indices
        int contI = 2, contJ = 0;
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if (contJ != 3) {
                    nuevaMatriz[contJ][contI] = matriz[i][j];
                    contJ++;
                }
            }
            contJ = 0;
            contI--;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i + 3][j] = nuevaMatriz[i][j];
            }
        }

        int j = 0;
        for (int i = 2; i >= 0; i--) {
            matrizAuxB[j] = matriz[i + 6][3];//guardo amarillo
            matrizAuxC[j] = matriz[i + 3][11];//guardo azul
            j++;
        }

        //permutando las capas aledañas
        for (int i = 2; i >= 0; i--) {
            matrizAux[i] = matriz[i][3];//guardo blanco
            matriz[i][3] = matrizAuxC[i];//blanco transformado a azul
            matriz[i + 3][11] = matrizAuxB[i];//azul transformado a amarillo
            matriz[i + 6][3] = matriz[i + 3][3];//amarillo transformado a verde
            matriz[i + 3][3] = matrizAux[i];
        }
    }

    public void LPrima() {
        L();
        L();
        L();
    }

    public void F() {
        String[][] nuevaMatriz = new String[3][3];
        String[] matrizAux = new String[3];
        String[] matrizAuxB = new String[3];
        String[] matrizAuxC = new String[3];

        //transforma la matriz a una fácil de usar por sus indices
        int contI = 2, contJ = 0;
        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                if (contJ != 3) {
                    nuevaMatriz[contJ][contI] = matriz[i][j];
                    contJ++;
                }
            }
            contJ = 0;
            contI--;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i + 3][j + 3] = nuevaMatriz[i][j];
            }
        }

        int j = 0;
        for (int i = 2; i >= 0; i--) {
            matrizAuxB[j] = matriz[i + 3][2];//guardo violeta
            matrizAuxC[j] = matriz[i + 3][6];//guardo rojo
            j++;
        }

        //permutando las capas aledañas
        for (int i = 0; i < 3; i++) {
            matrizAux[i] = matriz[2][i + 3];//guardo blanco
            matriz[2][i + 3] = matrizAuxB[i];//blanco transformado a violeta
            matriz[i + 3][2] = matriz[6][i + 3];//violeta trasformado en amarillo
            matriz[6][i + 3] = matrizAuxC[i];//amarillo transformado en rojo
            matriz[i + 3][6] = matrizAux[i];//rojo transformado en blanco
        }
    }

    public void FPrima() {
        F();
        F();
        F();
    }

    public void B() {
        String[][] nuevaMatriz = new String[3][3];
        String[] matrizAux = new String[3];
        String[] matrizAuxB = new String[3];
        String[] matrizAuxC = new String[3];

        //transforma la matriz de la cara principal a una fácil de usar por sus indices
        int contI = 2, contJ = 0;
        for (int i = 3; i < 6; i++) {
            for (int j = 9; j < 12; j++) {
                if (contJ != 3) {
                    nuevaMatriz[contJ][contI] = matriz[i][j];
                    contJ++;
                }
            }
            contJ = 0;
            contI--;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i + 3][j + 9] = nuevaMatriz[i][j];
            }
        }

        int j = 0;
        for (int i = 2; i >= 0; i--) {
            matrizAuxB[j] = matriz[8][i + 3];//guardo amarillo
            matrizAux[j] = matriz[0][i + 3];//guardo blanco
            j++;
        }

        //permutando las capas aledañas
        for (int i = 0; i < 3; i++) {
            matriz[0][i + 3] = matriz[i + 3][8];//blanco transformado a rojo
            matriz[i + 3][8] = matrizAuxB[i];//rojo trasformado en amarillo
            matriz[8][i + 3] = matriz[i + 3][0];//amarillo transformado en violeta
            matriz[i + 3][0] = matrizAux[i];//violeta transformado en blanco
        }
    }

    public void BPrima() {
        B();
        B();
        B();
    }

    public void instruccion(List<String> lista, int opcion) throws AWTException {
        String respuesta = "";

        if (opcion == 1) {//Establece la forma inicial del cubo mezclado
            for (int i = 0; i < lista.size(); i++) {
                switch (lista.get(i)) {
                    case "1 ":
                    case "R":
                        R();
                        break;
                    case "2 ":
                    case "L":
                        L();
                        break;
                    case "3 ":
                    case "U":
                        U();
                        break;
                    case "4 ":
                    case "D":
                        D();
                        break;
                    case "5 ":
                    case "F":
                        F();
                        break;
                    case "6 ":
                    case "B":
                        B();
                        break;
                    case "1' ":
                    case "R'":
                        RPrima();
                        break;
                    case "2' ":
                    case "L'":
                        LPrima();
                        break;
                    case "3' ":
                    case "U'":
                        UPrima();
                        break;
                    case "4' ":
                    case "D'":
                        DPrima();
                        break;
                    case "5' ":
                    case "F'":
                        FPrima();
                        break;
                    case "6' ":
                    case "B'":
                        BPrima();
                        break;
                    case "1doble ":
                    case "R2":
                        R();
                        R();
                        break;
                    case "2doble ":
                    case "L2":
                        L();
                        L();
                        break;
                    case "3doble ":
                    case "U2":
                        U();
                        U();
                        break;
                    case "4doble ":
                    case "D2":
                        D();
                        D();
                        break;
                    case "5doble ":
                    case "F2":
                        F();
                        F();
                        break;
                    case "6doble ":
                    case "B2":
                        B();
                        B();
                        break;
                }
            }
            opcion = 2;
        }

        if (opcion == 2) {//giros libres
            while (!respuesta.equals("Q")) {
                switch (respuesta) {
                    case "1 ":
                    case "R":
                        R();
                        break;
                    case "2 ":
                    case "L":
                        L();
                        break;
                    case "3 ":
                    case "U":
                        U();
                        break;
                    case "4 ":
                    case "D":
                        D();
                        break;
                    case "5 ":
                    case "F":
                        F();
                        break;
                    case "6 ":
                    case "B":
                        B();
                        break;
                    case "1' ":
                    case "R'":
                        RPrima();
                        break;
                    case "2' ":
                    case "L'":
                        LPrima();
                        break;
                    case "3' ":
                    case "U'":
                        UPrima();
                        break;
                    case "4' ":
                    case "D'":
                        DPrima();
                        break;
                    case "5' ":
                    case "F'":
                        FPrima();
                        break;
                    case "6' ":
                    case "B'":
                        BPrima();
                        break;
                    case "1doble ":
                    case "R2":
                        R();
                        R();
                        break;
                    case "2doble ":
                    case "L2":
                        L();
                        L();
                        break;
                    case "3doble ":
                    case "U2":
                        U();
                        U();
                        break;
                    case "4doble ":
                    case "D2":
                        D();
                        D();
                        break;
                    case "5doble ":
                    case "F2":
                        F();
                        F();
                        break;
                    case "6doble ":
                    case "B2":
                        B();
                        B();
                        break;
                    case "Q":
                        break;
                }

                robotCleaner();
                System.out.println("Ingrese movimientos válidos (Véase la notación válida en el menú). \nEscriba \"Q\" para volver al menú principal");
                System.out.println("");
                imprimirCubo();
                respuesta = service.scan.next().toUpperCase();

            }
        }

        if (opcion == 3) {//scramble aleatorio
            service.CrearScramble(scramble);
            instruccion(scramble.getListaScramble(), 1);
        }

    }//recibe mezclas predefinidas y movimientos, ademas de al cubo sin resolver

    public void robotCleaner() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);
    }//limpia la pantalla
}
