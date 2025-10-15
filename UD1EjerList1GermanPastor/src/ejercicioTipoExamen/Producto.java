package ejercicioTipoExamen;

public abstract class Producto {

    private String nombre;
    private double precioBase;
    private int cant;

    public Producto(String nombre, double precioBase, int cant) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.cant = cant;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precioBase=" + precioBase +
                ", cant=" + cant +
                '}';
    }

    public abstract double calcularPVP(double porcentaje);


}
