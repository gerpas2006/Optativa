package ejercicioTipoExamen3;

public class Furgoneta extends Vehiculo{

    private double capacidadKG;

    public Furgoneta(String matriculo, double precioBaseDia, String nombre, boolean ocupado, int diasAlquiler, int numeroOcupantes, double capacidadKG) {
        super(matriculo, precioBaseDia, nombre, ocupado, diasAlquiler, numeroOcupantes);
        this.capacidadKG = capacidadKG;
    }

    public double getCapacidadKG() {
        return capacidadKG;
    }

    public void setCapacidadKG(double capacidadKG) {
        this.capacidadKG = capacidadKG;
    }

    @Override
    public String toString() {
        return "Furgoneta{" +
                "capacidadKG=" + capacidadKG +
                '}';
    }

    @Override
    public double calcularPVP(double limite,double porcentaje) {
        double resul=0.0;
        if(capacidadKG>limite){
            resul=super.calcularPVP(limite,porcentaje)+20;
        }else{
            resul=super.calcularPVP(limite,porcentaje);
        }
        return resul;

    }
}
