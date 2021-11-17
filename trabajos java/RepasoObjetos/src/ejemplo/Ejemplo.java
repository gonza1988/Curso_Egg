package ejemplo;

import ejemplo.entidades.Auto;
import ejemplo.servicios.AutoServicio;

public class Ejemplo {
//ATAJO PARA COMENTAR = CTRL + SHIFT + C

    public static void main(String[] args) {

        AutoServicio as = new AutoServicio();

        Auto autoNuevo = as.crearAuto();

        System.out.println("\n");

        Auto b = as.crearAuto();

        System.out.println("autoNuevo");
        as.mostrarAuto(autoNuevo);

        System.out.println("auto b");
        as.mostrarAuto(b);

//        Auto a = new Auto();
//        a.setMarca("Ford");
//        a.setModelo("Fiesta");
//        a.setAnioFabricacion(2018);
//
//        System.out.println("-------- AUTO A --------");
//        System.out.println(a.toString());
//        System.out.println("\n");
//
//        Auto b = new Auto("VW", "Polo", 2020);
//
//        String marcaB = b.getMarca();
//        String modeloB = b.getModelo();
//
//        System.out.println("-------- AUTO B --------");
//        System.out.println("El auto b es un " + marcaB + " " + modeloB);
    }

}
