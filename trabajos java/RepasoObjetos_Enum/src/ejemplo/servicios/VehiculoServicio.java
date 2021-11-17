package ejemplo.servicios;

import ejemplo.entidades.Vehiculo;
import ejemplo.enums.TipoVehiculo;
import java.util.ArrayList;
import java.util.Scanner;

public class VehiculoServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //CREACION, CONSULTA, MODIFICACION, ELIMINACION
    public Vehiculo crearVehiculo() {
        Vehiculo a = new Vehiculo();

        System.out.println("Escribe la marca de tu auto");
        String marca = leer.next();

        System.out.println("Escribe el modelo de tu auto");
        String modelo = leer.next();

        System.out.println("Escribe el año de fabricación");
        int fabricacion = leer.nextInt();

        TipoVehiculo tipo = pedirTipoVehiculo();

        while (fabricacion > 2021 || fabricacion < 1900) {
            System.out.println("El año es incorrecto. Intente nuevamente");
            fabricacion = leer.nextInt();
        }

        a.setMarca(marca);
        a.setModelo(modelo);
        a.setAnioFabricacion(fabricacion);
        a.setTipo(tipo);

        return a;
    }

    public void mostrarVehiculo(Vehiculo a) {
        System.out.println("Marca: " + a.getMarca() + "\n"
                + "Modelo: " + a.getModelo() + "\n"
                + "Año Fabricacion: " + a.getAnioFabricacion() + "\n"
                + "Tipo: " + a.getTipo().getValorAMostrar());
    }

    public TipoVehiculo pedirTipoVehiculo() {
        int sel;
        System.out.println("Elige el tipo\n"
                + "1. Auto\n"
                + "2. Camioneta\n"
                + "3. Moto");

        sel = leer.nextInt();

        return TipoVehiculo.values()[sel - 1];

    }

}
