package ejercicioTipoExamen;

public class Moviles extends Producto{

    private String marca;

    public Moviles(String nombre, double precioBase, int cant, String marca) {
        super(nombre, precioBase, cant);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Moviles{" +
                "marca='" + marca + '\'' +
                '}';
    }

    @Override
    public double calcularPVP(double porcentaje) {
        double resul=0.0;
        resul=(super.getPrecioBase()+((super.getPrecioBase()*porcentaje)/100))*super.getCant();
        return resul;
    }


}
