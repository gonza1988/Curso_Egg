package ejemplo02;

import ejemplo02.entidades.Bateria;
import ejemplo02.entidades.Celular;
import ejemplo02.servicios.CelularServicio;

public class Ejemplo02 {

    public static void main(String[] args) {
        CelularServicio cs = new CelularServicio();

//        Celular c1 = cs.crearCelular();
//        Celular c2 = cs.crearCelular();
//        Celular c3 = cs.crearCelular();
        Celular c1 = new Celular("Nokia", "1100", new Bateria(25000));
        Celular c2 = new Celular("Apple", "Iphone", new Bateria(100));
        Celular c3 = new Celular("Samsung", "A100", new Bateria(5000));

        cs.agregarCelularACatalogo(c1);
        cs.agregarCelularACatalogo(c2);
        cs.agregarCelularACatalogo(c3);
        System.out.println("Catalogo completo");
        cs.mostrarCatalogo();
        cs.eliminarCelular(c1);
        System.out.println("Catalogo después de eliminar 1 celular");
        cs.mostrarCatalogo();
        System.out.println("Catalogo después de eliminar todos");
        cs.eliminarTodos();

        System.out.println("");
        cs.mostrarCatalogo();

    }

}
