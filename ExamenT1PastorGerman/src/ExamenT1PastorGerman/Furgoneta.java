package ExamenT1PastorGerman;

public class Furgoneta extends Vehiculo{

    private double longitud;

    public Furgoneta(String matricula, int horas, double longitud) {
        super(matricula, horas);
        this.longitud = longitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return super.toString()+"Furgoneta{" +
                "longitud=" + longitud +
                '}';
    }

    @Override
    public double calcularPVP(double precio,double cantPorMetro) {
        double resul=0.0;
        if(longitud>4){
            resul=super.calcularPVP(precio,cantPorMetro)+(longitud+cantPorMetro);
        }else{
            resul=super.calcularPVP(precio, cantPorMetro);
        }
        return resul;
    }

    public void avisarLongitud(double longMax){
        if(longitud>longMax){
            System.out.println("¡Cuidado, aparcar en zona especial!");
        }}
}
