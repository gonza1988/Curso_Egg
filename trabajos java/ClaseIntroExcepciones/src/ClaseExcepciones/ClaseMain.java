package ClaseExcepciones;

import java.util.Scanner;

public class ClaseMain {

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("ACA INICIA TODO");

        try {
            Integer numero1 = leer.nextInt();
            validar(numero1);
            //System.out.println(numero1.compareTo(8));//uso esto cuando es null para ver q se corta...
        } catch (NullPointerException e) {
            System.out.println(e.toString() + "Caballero tiene inicilizar el numero");  //Integer numero1 = null;
        } catch (Exception e) {
           System.out.println( e.getMessage());//Atrapo la excepcion si ocurre de mi metodo "Validar"
        }finally{
            System.out.println("Esto ocurre si o si");
        }

        System.out.println("ACA TERMINA TODO");
    }

    //Este metodo es para validar... recibe un numero por parametro
    public static void validar(Integer numero) throws Exception {
        // Invento mi propia excepcion... por jodida... creo que si el numero es menor a 15 q largue la excp
            if (numero<15) {
                throw new Exception("El numero no quiero que sea menor a 15, mia la pelota...");
        }
    }
}
