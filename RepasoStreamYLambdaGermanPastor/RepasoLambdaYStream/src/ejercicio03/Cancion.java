package ejercicio03;

public class Cancion {

    private String nombre;
    private String autor;
    private double duracion;
    private Generos generos;

    public Cancion(String nombre, String autor, double duracion, Generos generos) {
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;
        this.generos = generos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Generos getGeneros() {
        return generos;
    }

    public void setGeneros(Generos generos) {
        this.generos = generos;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", duracion=" + duracion +
                ", generos=" + generos +
                '}';
    }
}
