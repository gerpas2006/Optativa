package ejercicioTipoExamen2;

public class Suite extends Habitacion{

    private double metrosCuadrados;
    private double dineroConsumido;

    public Suite(double precioBase, boolean ocupado, String nombreCliente, int numeDiasReservada, int numDeOcupantes, double metrosCuadrados, double dineroConsumido) {
        super(precioBase, ocupado, nombreCliente, numeDiasReservada, numDeOcupantes);
        this.metrosCuadrados = metrosCuadrados;
        this.dineroConsumido = dineroConsumido;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public double getDineroConsumido() {
        return dineroConsumido;
    }

    public void setDineroConsumido(double dineroConsumido) {
        this.dineroConsumido = dineroConsumido;
    }

    @Override
    public String toString() {
        return "Suite{" +
                "metrosCuadrados=" + metrosCuadrados +
                ", dineroConsumido=" + dineroConsumido +
                '}';
    }

    @Override
    public double calcularPVP(double porcentaje,double precioLimpieza) {
        double resul=0.0;
        resul=dineroConsumido-((dineroConsumido*porcentaje)/100);
        return super.calcularPVP(porcentaje,precioLimpieza)+resul;
    }
}
