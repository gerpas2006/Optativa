package ejercicio08;

public class Plataforma {

    private boolean anuncios;
    private double precio;
    private String nombre;
    private double descuento;

    public Plataforma(boolean anuncios, double descuento, String nombre, double precio) {
        this.anuncios = anuncios;
        this.descuento = descuento;
        this.nombre = nombre;
        this.precio = precio;
    }

    public boolean isAnuncios() {
        return anuncios;
    }

    public void setAnuncios(boolean anuncios) {
        this.anuncios = anuncios;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Plataforma{" +
                "anuncios=" + anuncios +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", descuento=" + descuento +
                '}';
    }


}
