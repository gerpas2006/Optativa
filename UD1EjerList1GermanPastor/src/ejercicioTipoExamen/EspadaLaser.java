package ejercicioTipoExamen;

public class EspadaLaser extends Producto{

    private String tipo;

    public EspadaLaser(String nombre, double precioBase, int cant, String tipo) {
        super(nombre, precioBase, cant);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "EspadaLaser{" +
                "tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public double calcularPVP(double porcentaje) {
        double resul=0.0;
        if(tipo.equalsIgnoreCase("doble")){
            resul=(super.getPrecioBase()+((super.getPrecioBase()*porcentaje)/100))*super.getCant();
        }else {
            resul=super.getPrecioBase()*super.getCant();
        }
        return resul;
    }


}
