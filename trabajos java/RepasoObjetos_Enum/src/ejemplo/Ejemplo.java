package ejemplo;

import ejemplo.entidades.Vehiculo;
import ejemplo.enums.TipoVehiculo;
import ejemplo.servicios.VehiculoServicio;

public class Ejemplo {
//ATAJO PARA COMENTAR = CTRL + SHIFT + C

    public static void main(String[] args) {

        VehiculoServicio as = new VehiculoServicio();

        Vehiculo vehiculoNuevo = as.crearVehiculo();
      
        as.mostrarVehiculo(vehiculoNuevo);
      
        

//        System.out.println("\n");
//        Vehiculo b = as.crearVehiculo();
//
//        System.out.println("autoNuevo");
//        as.mostrarVehiculo(autoNuevo);
//
//        System.out.println("auto b");
//        as.mostrarVehiculo(b);
//        Vehiculo a = new Vehiculo();
//        a.setMarca("Ford");
//        a.setModelo("Fiesta");
//        a.setAnioFabricacion(2018);
//
//        System.out.println("-------- AUTO A --------");
//        System.out.println(a.toString());
//        System.out.println("\n");
//
//        Vehiculo b = new Vehiculo("VW", "Polo", 2020);
//
//        String marcaB = b.getMarca();
//        String modeloB = b.getModelo();
//
//        System.out.println("-------- AUTO B --------");
//        System.out.println("El auto b es un " + marcaB + " " + modeloB);
    }

}
