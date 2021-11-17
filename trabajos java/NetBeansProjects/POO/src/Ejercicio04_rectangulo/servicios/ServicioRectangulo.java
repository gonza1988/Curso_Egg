package Ejercicio04_rectangulo.servicios;

import Ejercicio04_rectangulo.entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioRectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//    Rectangulo r2 = Rectangulo();

    public Rectangulo CrearRectangulo() {
        int base, altura;

        do {
            System.out.println("Ingrese la base del Rectangulo mayor a 0: ");
            base = leer.nextInt();
            System.out.println("Ingrese la altura del Rectangulo mayor a 0: ");
            altura = leer.nextInt();

        } while (base <= 0 || altura <= 0);

        return new Rectangulo(base, altura);
    }

    public int SuperficieRectangulo(Rectangulo rect) {
        int superficie;

        superficie = rect.getBase() * rect.getAltura();
        return superficie;
    }

    public int PerimetroRectangulo(Rectangulo rect) {
        int perimetro;

        perimetro = (rect.getBase() + rect.getAltura()) * 2;
        return perimetro;
    }

    public void DibujaRectangulo(Rectangulo rect) {

        System.out.println("Su rectangulo dibujado: "); 
      
        for (int i = 0; i < rect.getBase(); i++) {
            for (int j = 0; j < rect.getAltura(); j++) {
                if (i > 0 && i < rect.getBase() - 1 && j > 0 && j < rect.getAltura() - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println("");
        }
    }
}
