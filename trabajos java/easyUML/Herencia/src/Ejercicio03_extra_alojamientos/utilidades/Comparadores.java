/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03_extra_alojamientos.utilidades;

import Ejercicio03_extra_alojamientos.entidades.Alojamiento;
import Ejercicio03_extra_alojamientos.entidades.Hotel;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 *
 * @author Gonza Cozzo
 */
public class Comparadores {
    
    //Lo declaro estatico al metodo, accedo de forma directa NOMBRECLASE.nombreMetodo
    public static Comparator<Hotel> ordenarporPrecioAsc=  new Comparator<Hotel> (){
        @Override
        public int compare(Hotel t1, Hotel t2){
            return Double.compare (t1.getPrecioHabitacion(),t2.getPrecioHabitacion());
    }

        @Override
        public Comparator<Hotel> thenComparing(Comparator<? super Hotel> cmprtr) {
            return Comparator.super.thenComparing(cmprtr); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public <U> Comparator<Hotel> thenComparing(Function<? super Hotel, ? extends U> fnctn, Comparator<? super U> cmprtr) {
            return Comparator.super.thenComparing(fnctn, cmprtr); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public <U extends Comparable<? super U>> Comparator<Hotel> thenComparing(Function<? super Hotel, ? extends U> fnctn) {
            return Comparator.super.thenComparing(fnctn); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Comparator<Hotel> thenComparingInt(ToIntFunction<? super Hotel> tif) {
            return Comparator.super.thenComparingInt(tif); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Comparator<Hotel> thenComparingLong(ToLongFunction<? super Hotel> tlf) {
            return Comparator.super.thenComparingLong(tlf); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Comparator<Hotel> thenComparingDouble(ToDoubleFunction<? super Hotel> tdf) {
            return Comparator.super.thenComparingDouble(tdf); //To change body of generated methods, choose Tools | Templates.
        }
    };
       
 



    
}
