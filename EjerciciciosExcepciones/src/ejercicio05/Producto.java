package ejercicio05;

public class Producto {

    private Long id;
    private double precio;
    private double descuento;

    public Producto(Long id, double precio, double descuento) {
        this.id = id;
        this.precio = precio;
        this.descuento = descuento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", precio=" + precio +
                ", descuento=" + descuento +
                '}';
    }
}
