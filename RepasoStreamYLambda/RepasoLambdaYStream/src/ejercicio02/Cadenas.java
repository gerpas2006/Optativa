package ejercicio02;

import java.util.List;

public class Cadenas {

    String cadena;

    public Cadenas(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public String toString() {
        return "Cadenas{" +
                "cadena='" + cadena + '\'' +
                '}';
    }
}
