package ejercicioTipoExamen3;

public class Coche extends Vehiculo{

    private String tipoGasolina;
    private double costeExtra;

    public Coche(String matriculo, double precioBaseDia, String nombre, boolean ocupado, int diasAlquiler, int numeroOcupantes, String tipoGasolina, double costeExtra) {
        super(matriculo, precioBaseDia, nombre, ocupado, diasAlquiler, numeroOcupantes);
        this.tipoGasolina = tipoGasolina;
        this.costeExtra = costeExtra;
    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public double getCosteExtra() {
        return costeExtra;
    }

    public void setCosteExtra(double costeExtra) {
        this.costeExtra = costeExtra;
    }

    @Override
    public String toString() {
        return super.toString()+"Coche{" +
                "tipoGasolina='" + tipoGasolina + '\'' +
                ", costeExtra=" + costeExtra +
                '}';
    }

    @Override
    public double calcularPVP(double limite,double porcentaje) {
        double resul=0.0;
        resul=costeExtra*super.getDiasAlquiler();
        return resul+super.calcularPVP(limite,porcentaje);
    }
}
