/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03_extra_alojamientos;

import Ejercicio03_extra_alojamientos.entidades.Alojamiento;
import Ejercicio03_extra_alojamientos.entidades.Camping;
import Ejercicio03_extra_alojamientos.entidades.Hotel;
import Ejercicio03_extra_alojamientos.entidades.Hotel4Estrellas;
import Ejercicio03_extra_alojamientos.entidades.Hotel5Estrellas;
import Ejercicio03_extra_alojamientos.entidades.Residencia;
import Ejercicio03_extra_alojamientos.servicios.ServicioAlojamiento;
import Ejercicio03_extra_alojamientos.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio03_extra_alojamientosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 3. Una compañía de promociones turísticas desea mantener información sobre la
        infraestructura de alojamiento para turistas, de forma tal que los clientes puedan
        planear sus vacaciones de acuerdo a sus posibilidades. Los alojamientos se
        identifican por un nombre, una dirección, una localidad y un gerente encargado
        del lugar. La compañía trabaja con dos tipos de alojamientos: Hoteles y
        Alojamientos Extrahoteleros.
        Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas,
        Cantidad de Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco
        estrellas. Las características de las distintas categorías son las siguientes:
        • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
        Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Precio de las
        Habitaciones.
        • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
        Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Cantidad
        Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio
        de las Habitaciones.
        Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo
        “B”, de acuerdo a las prestaciones observadas. Las limosinas están disponibles
        para cualquier cliente, pero sujeto a disponibilidad, por lo que cuanto más
        limosinas tenga el hotel, más caro será.
        El precio de una habitación debe calcularse de acuerdo a la siguiente fórmula:
        PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por
        restaurante) + (valor agregado por gimnasio) + (valor agregado por limosinas).
        Donde:
        Valor agregado por el restaurante:
        • $10 si la capacidad del restaurante es de menos de 30 personas.
        • $30 si está entre 30 y 50 personas.
        • $50 si es mayor de 50.
        Valor agregado por el gimnasio:
        • $50 si el tipo del gimnasio es A.
        • $30 si el tipo del gimnasio es B.
        Valor agregado por las limosinas:
        • $15 por la cantidad de limosinas del hotel.
        En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los
        de los hoteles, estando más orientados a la vida al aire libre y al turista de bajos
        recursos. Por cada Alojamiento Extrahotelero se indica si es privado o no, así
        como la cantidad de metros cuadrados que ocupa. Existen dos tipos de
        alojamientos extrahoteleros: los Camping y las Residencias. Para los Camping se
        indica la capacidad máxima de carpas, la cantidad de baños disponibles y si
        posee o no un restaurante dentro de las instalaciones. Para las residencias se
        indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
        si posee o no campo deportivo. Realizar un programa en el que se representen
        todas las relaciones descriptas.
        Realizar un sistema de consulta que le permite al usuario consultar por diferentes
        criterios:
        • todos los alojamientos.
        • todos los hoteles de más caro a más barato.
        • todos los campings con restaurante
        • todos las residencias que tienen descuento */

        ArrayList<Alojamiento> alojaTodo = new ArrayList();

        Hotel4Estrellas h4 = new Hotel4Estrellas('B', "Valvedere", 20, 10, 40, 2, "Fino Filipino", "9 de julio 78", "Ciudad", "Armando Cortisona");
        Hotel5Estrellas h5 = new Hotel5Estrellas(2, 8, 8, 'A', "Dulce Gusto", 100, 60, 200, 5, "Diplomatic", "Aristides 1559", "Ciudad", "Julius D");
        Hotel4Estrellas H4 = new Hotel4Estrellas('A', "Tio Moe", 30, 15, 50, 3, "Wines Apart", "San Martin 1220", "Ciudad", "Tu la Tais");
        Hotel5Estrellas H5 = new Hotel5Estrellas(4, 12, 15, 'A', "Sweet Tasty", 120, 90, 250, 10, "Park Hyatt", "Primitivo de la Reta 989", "Mendoza", "Juan Topo");
        Camping c1 = new Camping(25, 3, false, false, 700, "La cañadita", "Viñas del balbo 12", "Potrerillos", "Don Quijote");
        Residencia r1 = new Residencia(9, true, true, true, 500, "Residencia Comodoro", "Chacabuco 469", "Godoy Cruz", "Bastian");
        Camping c2 = new Camping(50, 6, true, true, 1500, "Tulumaya", "Las Orquideas 75", "San Rafael", "Esteban Quito");
        Residencia r2 = new Residencia(5, false, false, false, 250, "Residencia Pajaro Azul", "Pedro Molina 10", "Guaymallen", "Quispe Mamani");

        h4.precioHabitacion();
        h5.precioHabitacion();
        H4.precioHabitacion();
        H5.precioHabitacion();
        
        alojaTodo.add(h4);
        alojaTodo.add(h5);
        alojaTodo.add(H4);
        alojaTodo.add(H5);
        alojaTodo.add(c1);
        alojaTodo.add(r1);
        alojaTodo.add(c2);
        alojaTodo.add(r2);

        ServicioAlojamiento sa = new ServicioAlojamiento();
        sa.menu(alojaTodo);

    }
}
