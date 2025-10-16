package ExamenT1PastorGerman;

public class Motos extends Vehiculo{

    private int CC;

    public Motos(String matricula, int horas, int CC) {
        super(matricula, horas);
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
        return super.toString()+"Motos{" +
                "CC=" + CC +
                '}';
    }

    @Override
    public double calcularPVP(double precio, double cantPorMetro) {
        double resul=0.0;
        double div=2;
        if(CC<250){
            resul=super.calcularPVP(precio,cantPorMetro)/div;
        }else{
            resul=super.calcularPVP(precio, cantPorMetro);
        }
        return resul;
    }
}
