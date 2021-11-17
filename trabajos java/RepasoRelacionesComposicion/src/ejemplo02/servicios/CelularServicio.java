package ejemplo02.servicios;

import ejemplo02.entidades.Bateria;
import ejemplo02.entidades.Celular;
import java.util.ArrayList;
import java.util.Scanner;

public class CelularServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<Celular> listaCelulares = new ArrayList<>();

    
    /**
     * 
     * @return celular con valores ingresados por teclado para sus atributos
     */
    public Celular crearCelular() {        

        System.out.println("Escrib� la marca del celular");
        String marca = leer.next();

        System.out.println("Escrib� el modelo del celular");
        String modelo = leer.next();

        System.out.println("Escrib� la capacidad de la bater�a");
        int capacidadBateria = leer.nextInt();
        
        Bateria b = new Bateria();
        b.setCapacidad(capacidadBateria);

        return new Celular(marca, modelo, b);
    }

    
    /**
     * 
     * @param c Recibe un celular como par�metro y lo agrega a la lista
     *          de celulares instanciada arriba
     */
    public void agregarCelularACatalogo(Celular c) {
        listaCelulares.add(c);
    }

    /**
     * 
     * @param c  Recibe un celular como par�metro y lo elimina de la lista
     */
    public void eliminarCelular(Celular c) {
        if (!listaVacia()) {
            listaCelulares.remove(c);
        }
    }

    /**
     * Elimina todos los celulares de la lista y muestra un mensaje de �xito
     */
    public void eliminarTodos() {
        if (!listaVacia()) {
            listaCelulares.clear();
            System.out.println("Se borraron todas las entradas del cat�logo");
        }
    }

    /**
     * Muestra todos los celulares de la lista
     */
    public void mostrarCatalogo() {
        if (!listaVacia()) {
            for (Celular celular : listaCelulares) {
                System.out.println(celular.toString());
            }
        }
    }

    /**
     * 
     * @return retorna true si la lista est� vac�a, false en caso contrario
     */
    private boolean listaVacia() {
        if (listaCelulares.isEmpty()) {
            System.out.println("La lista est� vac�a");
            return true;
        } else {
            return false;
        }
    }
}
