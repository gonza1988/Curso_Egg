package ejemplo.servicios;

import ejemplo.entidades.Auto;
import java.util.Scanner;

public class AutoServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //CREACION, CONSULTA, MODIFICACION, ELIMINACION
    public Auto crearAuto() {
        Auto a = new Auto();

        System.out.println("Escribe la marca de tu auto");
        String marca = leer.next();

        System.out.println("Escribe el modelo de tu auto");
        String modelo = leer.next();

        System.out.println("Escribe el año de fabricación");
        int fabricacion = leer.nextInt();

        while (fabricacion > 2021 || fabricacion < 1900) {
            System.out.println("El año es incorrecto. Intente nuevamente");
            fabricacion = leer.nextInt();
        }

        a.setMarca(marca);
        a.setModelo(modelo);
        a.setAnioFabricacion(fabricacion);

        return a;
    }

    public void mostrarAuto(Auto a) {
        System.out.println("Marca: " + a.getMarca() + "\n"
                + "Modelo: " + a.getModelo() + "\n"
                + "Año Fabricacion: " + a.getAnioFabricacion());
    }

}
