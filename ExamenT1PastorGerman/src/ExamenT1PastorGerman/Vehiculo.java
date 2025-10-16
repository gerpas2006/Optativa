package ExamenT1PastorGerman;

public class Vehiculo {

    private String matricula;
    private int horas;

    public Vehiculo(String matricula, int horas) {
        this.matricula = matricula;
        this.horas = horas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", horas=" + horas +
                '}';
    }


    public double calcularPVP(double precio,double cantPorMetro){
        double resul = 0.0;
        resul = horas*precio;
        return resul;
    }
}
