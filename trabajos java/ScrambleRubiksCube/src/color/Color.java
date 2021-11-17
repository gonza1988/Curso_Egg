package color;

/**
 *
 * @author Agus Mandolesi
 */
public class Color {

    public String negro() {
        return "\033[30m";
    }

    public String rojo() {
        return "\033[31m";
    }

    public String verde() {
        return "\033[32m";
    }

    public String amarillo() {
        return "\033[33m";
    }

    public String azul() {
        return "\033[34m";
    }

    public String violeta() {
        return "\033[35m";
    }

    public String cyan() {
        return "\033[36m";
    }

    public String blanco() {
        return "\033[37m";
    }

    public String reset() {
        return "\u001B[0m";
    }
    
    public String naranja(){
        return "\033[48:5:208:0m%s\033[m\n";
    }
}
