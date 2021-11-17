/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04_rectangulo;

import Ejercicio04_rectangulo.entidades.Rectangulo;
import Ejercicio04_rectangulo.servicios.ServicioRectangulo;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio04_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
        privado base y un atributo privado altura. La clase incluirá un método para crear el
        rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
        método para calcular la superficie del rectángulo y un método para calcular el
        perímetro del rectángulo. Por último, tendremos un método que dibujará el
        rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
        los métodos getters, setters y constructores correspondientes.
        Superficie = base * altura / Perímetro = (base + altura) * 2. */
        
        ServicioRectangulo sr = new ServicioRectangulo();
        
        Rectangulo rect = sr.CrearRectangulo();
        
        System.out.println(rect.toString());
        System.out.println("La superficie del rectangulo es = "+sr.SuperficieRectangulo(rect));
        System.out.println("El perimetro del rectangulo es = "+sr.PerimetroRectangulo(rect));
        sr.DibujaRectangulo(rect);
    }
    
}
