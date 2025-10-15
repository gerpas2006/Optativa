package ejercicioTipoExamen2;

public class Habitacion {

    private double precioBase;
    private boolean ocupado;
    private String nombreCliente;
    private int numeDiasReservada;
    private int numDeOcupantes;

    public Habitacion(double precioBase, boolean ocupado, String nombreCliente, int numeDiasReservada, int numDeOcupantes) {
        this.precioBase = precioBase;
        this.ocupado = ocupado;
        this.nombreCliente = nombreCliente;
        this.numeDiasReservada = numeDiasReservada;
        this.numDeOcupantes = numDeOcupantes;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeDiasReservada() {
        return numeDiasReservada;
    }

    public void setNumeDiasReservada(int numeDiasReservada) {
        this.numeDiasReservada = numeDiasReservada;
    }

    public int getNumDeOcupantes() {
        return numDeOcupantes;
    }

    public void setNumDeOcupantes(int numDeOcupantes) {
        this.numDeOcupantes = numDeOcupantes;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "precioBase=" + precioBase +
                ", ocupado=" + ocupado +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", numeDiasReservada=" + numeDiasReservada +
                ", numDeOcupantes=" + numDeOcupantes +
                '}';
    }

    public double calcularPVP(double porcentaje,double precioLimpieza){
        double resul=0.0;
        resul=precioBase*numeDiasReservada;
        return resul;
    }

}
