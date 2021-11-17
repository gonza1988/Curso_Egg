package Prueba;

/**
 *
 * @author d.andresperalta
 */
public class Prueba {

    public static void main(String[] args) {

        System.out.println(analisisNumero(7, -3, 1.13));
        System.out.println(jugandoCadenas("adriana"));
      

    }

    public static boolean analisisNumero(int num1, int num2, double num3) {

        boolean resultado = false;

        //Estoy validando que num1 sea impar.
        //Validando que num2 sea negativo.
        if (num1 % 2 != 0 && num2 < 0 && Math.round(num3) == Math.floor(num3)) {

            resultado = true;
        }

        return resultado;

    }

    public static String jugandoCadenas(String palabrita) {

        String resultado = "";
        String auxInvertida = "";

        //Estoy pasando a mayuscula palabrita.
        resultado = palabrita.toUpperCase();
        //Reemplazo las vocales por *.
        resultado = resultado.replaceAll("A", "*").replaceAll("E", "*").replaceAll("I", "*").replaceAll("O", "*").replaceAll("U", "*");
        //Opcion A para invertir palabra.
//        for (int i = resultado.length() - 1; i >= 0; i--) {
//
//            auxInvertida = auxInvertida + resultado.charAt(i);
//
//        }
        //Opcion B para invertir palabra.
        for (int i = 0; i < resultado.length(); i++) {

            auxInvertida = resultado.charAt(i) + auxInvertida;

        }

        return auxInvertida;

    }

}
