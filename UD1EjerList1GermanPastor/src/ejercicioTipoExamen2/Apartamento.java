package ejercicioTipoExamen2;

public class Apartamento extends Habitacion{

    private boolean servicioLimpieza;


    public Apartamento(double precioBase, boolean ocupado, String nombreCliente, int numeDiasReservada, int numDeOcupantes, boolean servicioLimpieza) {
        super(precioBase, ocupado, nombreCliente, numeDiasReservada, numDeOcupantes);
        this.servicioLimpieza = servicioLimpieza;
    }

    public boolean isServicioLimpieza() {
        return servicioLimpieza;
    }

    public void setServicioLimpieza(boolean servicioLimpieza) {
        this.servicioLimpieza = servicioLimpieza;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "servicioLimpieza=" + servicioLimpieza +
                '}';
    }

    public double calcularPVp(double porcentaje, double precioLimpieza){
        double resul=0.0;
        if(servicioLimpieza){
            resul=super.calcularPVP(porcentaje,precioLimpieza)+precioLimpieza;
        }else{
            resul=super.calcularPVP(porcentaje,precioLimpieza);
        }
        return resul;
    }
}
