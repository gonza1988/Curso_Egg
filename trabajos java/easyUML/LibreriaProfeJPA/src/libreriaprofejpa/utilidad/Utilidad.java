package libreriaprofejpa.utilidad;

import java.util.Scanner;
import java.util.UUID;
import libreriaprofejpa.excepcion.MiExcepcion;

public class Utilidad {

    private static Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public static String obtenerCampo() {
        String campo = null;

        try {
            campo = entrada.next();

            if (campo.trim().isEmpty()) {
                throw new MiExcepcion("CAMPO OBLIGATORIO");
            }

            if (campo.matches("^-?[0-9]+$")) {
                throw new MiExcepcion("NO SE ADMITEN NÚMEROS. SÓLO CARACTERES");
            }
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            campo = obtenerCampo();
        }

        return campo;
    }

    public static String obtenerAnio() {
        String anio = null;

        try {
            anio = entrada.next();

            if (anio.trim().isEmpty()) {
                throw new MiExcepcion("CAMPO OBLIGATORIO");
            }

            if (!anio.matches("\\d{4}")) {
                throw new MiExcepcion("DEBE INGRESAR 4 DÍGITOS");
            }
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            anio = obtenerAnio();
        }

        return anio;
    }

    public static String obtenerIsbn() {
        String isbn = null;

        try {
            isbn = entrada.next();

            if (isbn.trim().isEmpty()) {
                throw new MiExcepcion("CAMPO OBLIGATORIO");
            }

            if (!isbn.matches("^[0-9]{13}$")) {
                throw new MiExcepcion("DEBE INGRESAR 13 DÍGITOS");
            }
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            isbn = obtenerIsbn();
        }

        return isbn;
    }

    public static String generarIsbn() {
        return UUID.randomUUID().toString()
                .replaceAll("[^0-9]", "")
                .substring(0, 13);
    }
}
