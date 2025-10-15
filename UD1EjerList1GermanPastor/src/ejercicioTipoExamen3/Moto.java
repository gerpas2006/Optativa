package ejercicioTipoExamen3;

public class Moto extends Vehiculo{

    private int CC;

    public Moto(String matriculo, double precioBaseDia, String nombre, boolean ocupado, int diasAlquiler, int numeroOcupantes, int CC) {
        super(matriculo, precioBaseDia, nombre, ocupado, diasAlquiler, numeroOcupantes);
        this.CC = CC;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "CC=" + CC +
                '}';
    }

    @Override
    public double calcularPVP(double limite,double porcentaje) {
        double resul=0.0;
        if(CC>500){
            resul=super.calcularPVP(limite,porcentaje)+((super.calcularPVP(limite,porcentaje)*porcentaje)/100);
        }else{
            resul=super.calcularPVP(limite,porcentaje);
        }
        return resul;
    }
}
