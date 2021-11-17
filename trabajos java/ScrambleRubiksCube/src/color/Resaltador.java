package color;

/**
 *
 * @author Agus Mandolesi
 */
public class Resaltador { //Pueden cambiar el valor "30" por "47" para que la letra
                          //resaltada sea de color blanco

    public String rojo() {
        return "\u001B[41;30m";
    }

    public String verde() {
        return "\u001B[42;30m";
    }

    public String amarillo() {
        return "\u001B[43;30m";
    }
    
    public String azul() {
        return "\u001B[44;30m";
    }

    public String violeta() {
        return "\u001B[45;30m";
    }

    public String cyan() {
        return "\u001B[46;30m";
    }

    public String blanco() {
        return "\u001B[47;30m";
    }

    public String reset() {
        return "\u001B[0m";
    }
}
