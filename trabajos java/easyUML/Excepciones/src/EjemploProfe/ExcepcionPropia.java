/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploProfe;

/**
 *
 * @author Gonza Cozzo
 */
public class ExcepcionPropia extends Exception {

    /**
     * Creates a new instance of <code>ExcepcionPropia</code> without detail
     * message.
     */
    public ExcepcionPropia() {
    }

    /**
     * Constructs an instance of <code>ExcepcionPropia</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ExcepcionPropia(String msg) {
        super(msg);
    }
}
